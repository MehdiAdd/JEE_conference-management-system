package app.panel.speakers;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ejb.entity.Session_speciale;
import session.SessionRemote;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Button;
import javax.swing.JTextArea;

public class SessionAccepte extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public SessionAccepte() {

		setBackground(Color.WHITE);
		setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 151, 632, 253);
		JPanel panelInfos = new JPanel();
		panelInfos.setForeground(Color.WHITE);
		panelInfos.setVisible(false);
		panelInfos.setBackground(Color.WHITE);
		panelInfos.setBounds(0, 0, 701, 643);
		add(panelInfos);
		panelInfos.setLayout(null);
		
		Button buttonbackToTable = new Button("Retour");
		buttonbackToTable.setBounds(464, 519, 100, 35);
		buttonbackToTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelInfos.setVisible(false);
				scrollPane.setVisible(true);
				
			}
		});
		buttonbackToTable.setBackground(new Color(30, 144, 255));
		buttonbackToTable.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		panelInfos.add(buttonbackToTable);
		
		Button buttonSupprimer = new Button("Supprimer");
		buttonSupprimer.setBounds(340, 519, 106, 35);
		buttonSupprimer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonSupprimer.setBackground(new Color(30, 144, 255));
		panelInfos.add(buttonSupprimer);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 701, 41);
		panel.setBackground(new Color(240, 248, 255));
		panelInfos.add(panel);
		panel.setLayout(null);
		
		JLabel lblDetailsSurLa = new JLabel("Details sur la session");
		lblDetailsSurLa.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblDetailsSurLa.setBounds(10, 0, 252, 43);
		panel.add(lblDetailsSurLa);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(240, 357, 406, 136);
		panelInfos.add(scrollPane_1);
		
		JTextArea but = new JTextArea();
		but.setEditable(false);
		but.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		scrollPane_1.setViewportView(but);
		
		JLabel lblTitre = new JLabel("But de session");
		lblTitre.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblTitre.setBounds(66, 336, 124, 47);
		panelInfos.add(lblTitre);
		
		JLabel lblSession = new JLabel("Titre de session      ");
		lblSession.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblSession.setBounds(66, 293, 146, 47);
		panelInfos.add(lblSession);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_1.setBounds(240, 302, 22, 28);
		panelInfos.add(label_1);
		
		JLabel lblSessionVal = new JLabel("inconu");
		lblSessionVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblSessionVal.setBounds(281, 293, 378, 47);
		panelInfos.add(lblSessionVal);
		
		JLabel lblTitreAcadimiqueVal = new JLabel("inconu");
		lblTitreAcadimiqueVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblTitreAcadimiqueVal.setBounds(281, 247, 378, 47);
		panelInfos.add(lblTitreAcadimiqueVal);
		
		JLabel lblEmailVal = new JLabel("inconu");
		lblEmailVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblEmailVal.setBounds(281, 203, 378, 47);
		panelInfos.add(lblEmailVal);
		
		JLabel label_5 = new JLabel(":");
		label_5.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_5.setBounds(240, 256, 22, 28);
		panelInfos.add(label_5);
		
		JLabel lblNomEtPrenom_2_1 = new JLabel("Titre Acadimique");
		lblNomEtPrenom_2_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_2_1.setBounds(66, 247, 131, 47);
		panelInfos.add(lblNomEtPrenom_2_1);
		
		JLabel lblNomEtPrenom_2 = new JLabel("Email  ");
		lblNomEtPrenom_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_2.setBounds(65, 203, 100, 47);
		panelInfos.add(lblNomEtPrenom_2);
		
		JLabel label_4 = new JLabel(":");
		label_4.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_4.setBounds(240, 212, 22, 28);
		panelInfos.add(label_4);
		
		JLabel lblEtablissementVal = new JLabel("inconu");
		lblEtablissementVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblEtablissementVal.setBounds(281, 155, 378, 47);
		panelInfos.add(lblEtablissementVal);
		
		JLabel label_2 = new JLabel(":");
		label_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_2.setBounds(240, 166, 22, 28);
		panelInfos.add(label_2);
		
		JLabel lblNomEtPrenom_1 = new JLabel("Etablissement");
		lblNomEtPrenom_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_1.setBounds(66, 155, 124, 47);
		panelInfos.add(lblNomEtPrenom_1);
		
		JLabel lblNomAuteur = new JLabel("Nom de Proposant");
		lblNomAuteur.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomAuteur.setBounds(66, 108, 162, 47);
		panelInfos.add(lblNomAuteur);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label.setBounds(240, 117, 22, 28);
		panelInfos.add(label);
		
		JLabel lblNomAuteurVal = new JLabel("inconu");
		lblNomAuteurVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomAuteurVal.setBounds(281, 108, 378, 47);
		panelInfos.add(lblNomAuteurVal);
		
		
		add(scrollPane);
		
		table = new JTable();
		table.setShowVerticalLines(false);
	
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setForeground(Color.BLACK);
		DefaultTableModel tableModel=new DefaultTableModel();
		
		tableModel.addColumn("Nimuero de demande");
	 	tableModel.addColumn("Nom du proposant");
	 	tableModel.addColumn("titre de session");
    	table.setModel(tableModel);
		table.getTableHeader().setBackground(new Color(0, 96, 255));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		Button buttonAfficher = new Button("Voir Plus");
		buttonAfficher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
				System.out.print(indexRow);
				if(indexRow != -1) {
				lblNomAuteurVal.setText( model.getValueAt(indexRow, 0).toString());
					panelInfos.setVisible(true);
					scrollPane.setVisible(false);
				}else JOptionPane.showMessageDialog(scrollPane, "Selectionnez un ligne ","", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		buttonAfficher.setForeground(new Color(255, 255, 255));
		buttonAfficher.setBackground(new Color(30, 144, 255));
		buttonAfficher.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonAfficher.setBounds(430, 500, 94, 34);
		add(buttonAfficher);
		
		Button buttonBackTochoice = new Button("Retour");
		buttonBackTochoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		buttonBackTochoice.setForeground(Color.WHITE);
		buttonBackTochoice.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonBackTochoice.setBackground(new Color(30, 144, 255));
		buttonBackTochoice.setBounds(300, 500, 94, 34);
		add(buttonBackTochoice);
		
		JLabel lblLesSessionAccepte = new JLabel("Les sessions accept\u00E9es");
		lblLesSessionAccepte.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblLesSessionAccepte.setBounds(12, 0, 243, 41);
		add(lblLesSessionAccepte);
		
		Button buttonActualiser = new Button("Actualiser");
		buttonActualiser.setBounds(170, 500, 94, 34);
		add(buttonActualiser);
		buttonActualiser.setForeground(Color.WHITE);
		buttonActualiser.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonActualiser.setBackground(new Color(30, 144, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(0, 0, 701, 41);
		add(panel_1);
		try {
			InitialContext ctx=new InitialContext();
		    String appName = "EAR_Conference";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
		    List<Session_speciale> list=proxy.listeSessionsAccepte();
		for(Session_speciale ligne :list) {
		 Object[] tab=new Object[3];
		 tab[0]=ligne.getId_session();
		 tab[1]=ligne.getNom_resp_session()+" "+ligne.getPrenom_resp_session();
		 tab[2]=ligne.getTitre_session();
		
	
	     tableModel.addRow(tab);
	  
		}
		table.setModel(tableModel);
		buttonAfficher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
				
				System.out.print(indexRow);
				if(indexRow != -1) {
				Session_speciale session=proxy.afficherSession((int)model.getValueAt(indexRow, 0));
				lblNomAuteurVal.setText( session.getNom_resp_session()+" "+session.getPrenom_resp_session());
				lblEtablissementVal.setText(session.getEtablissement());
				lblEmailVal.setText(session.getEmail());		
				lblTitreAcadimiqueVal.setText(session.getTitreAcadimique());
				lblSessionVal.setText(session.getTitre_session());
				but.setText(session.getInteret());
					panelInfos.setVisible(true);
					scrollPane.setVisible(false);
				}else JOptionPane.showMessageDialog(scrollPane, "Selectionnez un ligne ","", JOptionPane.WARNING_MESSAGE);
				
			}
		});

		buttonSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
				Session_speciale session=proxy.deleteSession((int)model.getValueAt(indexRow, 0));
				JOptionPane.showMessageDialog(buttonSupprimer, "la session "+session.getTitre_session()+" est bien supprimée","", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		buttonActualiser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				DefaultTableModel tableModel=new DefaultTableModel();
				
				tableModel.addColumn("Nimuero de demande");
			 	tableModel.addColumn("Nom du proposant");
			 	tableModel.addColumn("titre de session");
		    	table.setModel(tableModel);
			
		    	List<Session_speciale> list=proxy.listeSessionsAccepte();
				for(Session_speciale ligne :list) {
				 Object[] tab=new Object[3];
				 tab[0]=ligne.getId_session();
				 tab[1]=ligne.getNom_resp_session()+" "+ligne.getPrenom_resp_session();
				 tab[2]=ligne.getTitre_session();
				
			
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
