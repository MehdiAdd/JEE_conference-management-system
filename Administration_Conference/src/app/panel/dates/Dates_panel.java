package app.panel.dates;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import ejb.entity.Listener;

import session.SessionRemote;

import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.Font;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Dates_panel extends JPanel {
	private static JTable table;

	/**
	 * Create the panel.
	 */
	public Dates_panel() {
		setBackground(Color.WHITE);
		setLayout(null);
AjouterDate ajouterDate=new AjouterDate();

		
		ajouterDate.setBounds(0, 0, 701, 643);
		add(ajouterDate);
		ajouterDate.setVisible(false);
	
        ModifierDate modifierDate=new ModifierDate();
		
        modifierDate.setBounds(0, 0, 701, 643);
		add(modifierDate);
		modifierDate.setVisible(false);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 147, 520, 273);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultTableModel tableModel=new DefaultTableModel();
	 	tableModel.addColumn("Num");
	 	tableModel.addColumn("Evenement");
    	tableModel.addColumn("Date");
    	table.setModel(tableModel);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getTableHeader().setBackground(new Color(0, 96, 255));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Les dates Importantes");
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 0, 315, 40);
		add(lblNewLabel);
		
		Button buttonModifier = new Button("Modifier");
	
		buttonModifier.setForeground(Color.WHITE);
		buttonModifier.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonModifier.setBackground(new Color(30, 144, 255));
		buttonModifier.setBounds(380, 500, 100, 35);
		add(buttonModifier);
		
		Button buttonAjouter = new Button("Ajouter");
		buttonAjouter.setForeground(Color.WHITE);
		buttonAjouter.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonAjouter.setBackground(new Color(30, 144, 255));
		buttonAjouter.setBounds(265, 500, 100, 35);
		add(buttonAjouter);
		buttonAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ajouterDate.setVisible(true);
				
			}
		});
		Button buttonSupprimer = new Button("Supprimer");
		buttonSupprimer.setForeground(Color.WHITE);
		buttonSupprimer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonSupprimer.setBackground(new Color(30, 144, 255));
		buttonSupprimer.setBounds(495, 500, 100, 35);
		add(buttonSupprimer);
	    Button buttonActualiser = new Button("Actualiser");
		
		buttonActualiser.setForeground(Color.WHITE);
		buttonActualiser.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonActualiser.setBackground(new Color(30, 144, 255));
		buttonActualiser.setBounds(115, 500, 100, 35);
		add(buttonActualiser);
		try {
			InitialContext ctx=new InitialContext();
		    String appName = "EAR_Conference";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
		    List<ejb.entity.Dates> list=proxy.listeDates();
		for(ejb.entity.Dates ligne :list) {
		 Object[] tab=new Object[3];
		 tab[0]=ligne.getId_date();
		 tab[1]=ligne.getNomDate();
		 tab[2]=ligne.getDate();
	
	     tableModel.addRow(tab);
		}
		table.setModel(tableModel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 701, 41);
		add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(240, 248, 255));
	
		
		buttonModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
			
				if(indexRow != -1) {
				modifierDate.setTextField( model.getValueAt(indexRow,2).toString());
				modifierDate.setTextField1( model.getValueAt(indexRow, 1).toString());
	            modifierDate.setTextFieldId( model.getValueAt(indexRow, 0).toString());
				modifierDate.setVisible(true);
				}else JOptionPane.showMessageDialog(scrollPane, "Selectionnez une date ","", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		buttonSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
			
				if(indexRow != -1) {
				proxy.deleteDate((int)model.getValueAt(indexRow, 0));
				JOptionPane.showMessageDialog(buttonSupprimer, "la date est supprimée , SVP actualisez la table pour voir le derniére mise à jour  ","", JOptionPane.INFORMATION_MESSAGE);
				}else JOptionPane.showMessageDialog(scrollPane, "Selectionnez une date ","", JOptionPane.WARNING_MESSAGE);

				
			}
		});
		buttonActualiser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tableModel=new DefaultTableModel();
			 	tableModel.addColumn("Num");
			 	tableModel.addColumn("Evenement");
		    	tableModel.addColumn("Date");
		    	table.setModel(tableModel);
				table.getColumnModel().getColumn(1).setPreferredWidth(200);
				table.getColumnModel().getColumn(0).setPreferredWidth(4);
				
				table.getTableHeader().setBackground(new Color(0, 96, 255));
				table.getTableHeader().setForeground(Color.white);
				table.getTableHeader().setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				List<ejb.entity.Dates> list=proxy.listeDates();
				for(ejb.entity.Dates ligne :list) {
				 Object[] tab=new Object[3];
				 tab[0]=ligne.getId_date();
				 tab[1]=ligne.getNomDate();
				 tab[2]=ligne.getDate();
			
			     tableModel.addRow(tab);
				}
				table.setModel(tableModel);
				
			}
		});
	
		
		} catch (NamingException e) {
			System.out.println("cccccccccccccccaaaaaaaaaaaa");
			e.printStackTrace();
		
    	}

	}
}
