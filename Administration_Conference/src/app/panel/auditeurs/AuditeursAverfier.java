package app.panel.auditeurs;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ejb.entity.Listener;
import session.SessionRemote;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Button;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class AuditeursAverfier extends JPanel {
	private JTable table;
 public Listener l=null;
	/**
	 * Create the panel.
	 */
	public AuditeursAverfier() {
		
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panelInfos = new JPanel();

		panelInfos.setVisible(false);
		panelInfos.setBackground(Color.WHITE);
		panelInfos.setEnabled(false);
		panelInfos.setBounds(0, 0, 703, 600);
		add(panelInfos);
		panelInfos.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom ");
		lblNom.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNom.setBounds(90, 54, 86, 47);
		panelInfos.add(lblNom);
		
		JLabel lblNomVal = new JLabel("inconu");
		lblNomVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomVal.setBounds(289, 54, 279, 47);
		panelInfos.add(lblNomVal);
		
		JLabel lblSession = new JLabel("Prenom ");
		lblSession.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblSession.setBounds(90, 111, 63, 47);
		panelInfos.add(lblSession);
		
		JLabel lblPrenomVal = new JLabel("inconu");
		lblPrenomVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblPrenomVal.setBounds(289, 111, 387, 47);
		panelInfos.add(lblPrenomVal);
		
		JLabel lblTitre = new JLabel("Ville ");
		lblTitre.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblTitre.setBounds(90, 168, 71, 47);
		panelInfos.add(lblTitre);
		
		JLabel lblVilleVal = new JLabel("inconu");
		lblVilleVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblVilleVal.setBounds(289, 168, 402, 47);
		panelInfos.add(lblVilleVal);
		
		Button buttonbackToTable = new Button("Retour");
		buttonbackToTable.setForeground(Color.WHITE);
		
		buttonbackToTable.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonbackToTable.setBackground(new Color(30, 144, 255));
		buttonbackToTable.setBounds(439, 500, 100, 35);
		panelInfos.add(buttonbackToTable);
		
		JLabel lblNomEtPrenom_1 = new JLabel("Etablissement");
		lblNomEtPrenom_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_1.setBounds(90, 225, 124, 47);
		panelInfos.add(lblNomEtPrenom_1);
		
		JLabel lblEtablissementVal = new JLabel("inconu");
		lblEtablissementVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblEtablissementVal.setBounds(289, 225, 402, 47);
		panelInfos.add(lblEtablissementVal);
		
		JLabel lblNomEtPrenom_2 = new JLabel("Email");
		lblNomEtPrenom_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_2.setBounds(90, 282, 71, 47);
		panelInfos.add(lblNomEtPrenom_2);
		
		JLabel lblEmailVal = new JLabel("inconu");
		lblEmailVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblEmailVal.setBounds(289, 282, 402, 47);
		panelInfos.add(lblEmailVal);
		
		JLabel lblNomEtPrenom_2_1 = new JLabel("Titre Acadimique ");
		lblNomEtPrenom_2_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_2_1.setBounds(90, 333, 132, 47);
		panelInfos.add(lblNomEtPrenom_2_1);
		
		JLabel lblTitreAcadimiqueVal = new JLabel("inconu");
		lblTitreAcadimiqueVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblTitreAcadimiqueVal.setBounds(289, 333, 387, 47);
		panelInfos.add(lblTitreAcadimiqueVal);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 701, 41);
		panelInfos.add(panel);
		
		JLabel lblDetailsSurLauditeur = new JLabel("Details sur l'auditeur");
		lblDetailsSurLauditeur.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblDetailsSurLauditeur.setBounds(10, 0, 252, 43);
		panel.add(lblDetailsSurLauditeur);
		
		JLabel _2 = new JLabel(":");
		_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		_2.setBounds(236, 54, 19, 47);
		panelInfos.add(_2);
		
		JLabel _2_1 = new JLabel(":");
		_2_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		_2_1.setBounds(236, 111, 19, 47);
		panelInfos.add(_2_1);
		
		JLabel _2_2 = new JLabel(":");
		_2_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		_2_2.setBounds(236, 165, 19, 47);
		panelInfos.add(_2_2);
		
		JLabel _2_3 = new JLabel(":");
		_2_3.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		_2_3.setBounds(236, 225, 19, 47);
		panelInfos.add(_2_3);
		
		JLabel _2_4 = new JLabel(":");
		_2_4.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		_2_4.setBounds(236, 282, 19, 47);
		panelInfos.add(_2_4);
		
		JLabel _2_5 = new JLabel(":");
		_2_5.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		_2_5.setBounds(236, 333, 19, 47);
		panelInfos.add(_2_5);
		
		JLabel lblNomEtPrenom_2_1_1 = new JLabel("Montant pay\u00E9");
		lblNomEtPrenom_2_1_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_2_1_1.setBounds(90, 385, 132, 47);
		panelInfos.add(lblNomEtPrenom_2_1_1);
		
		JLabel _2_5_1 = new JLabel(":");
		_2_5_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		_2_5_1.setBounds(236, 385, 19, 47);
		panelInfos.add(_2_5_1);
		
		JLabel lblMontant = new JLabel("inconu");
		lblMontant.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblMontant.setBounds(289, 385, 164, 47);
		panelInfos.add(lblMontant);
		
		Button buttonRecu = new Button("Re\u00E7u de paiement");
		buttonRecu.setForeground(Color.WHITE);
		buttonRecu.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonRecu.setBackground(new Color(100, 149, 237));
		buttonRecu.setBounds(459, 390, 178, 36);
		panelInfos.add(buttonRecu);
		
		Button buttonConfirmer = new Button("Confirmer");
	
		buttonConfirmer.setForeground(Color.WHITE);
		buttonConfirmer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonConfirmer.setBackground(new Color(30, 144, 255));
		buttonConfirmer.setBounds(300, 500, 100, 35);
		panelInfos.add(buttonConfirmer);
		
		JLabel invisibleid = new JLabel("invisible");
		invisibleid.setVisible(false);
		invisibleid.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		invisibleid.setBounds(12, 433, 132, 47);
		panelInfos.add(invisibleid);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 176, 632, 253);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(28);
		table.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
	 	DefaultTableModel tableModel=new DefaultTableModel();
	 	tableModel.addColumn("Num");
	 	tableModel.addColumn("Nom");
    	tableModel.addColumn("Prenom");
    	tableModel.addColumn("Ville");
    	tableModel.addColumn("Etablissement");
    	tableModel.addColumn("Titre acadimique");
    	
    	
	
				
		table.getTableHeader().setBackground(new Color(0, 96, 255));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		Button buttonAfficher = new Button("Voir Plus");
	
		buttonAfficher.setForeground(Color.WHITE);
		buttonAfficher.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonAfficher.setBackground(new Color(30, 144, 255));
		buttonAfficher.setBounds(330, 500, 94, 34);
		add(buttonAfficher);
		Button buttonSupprimer = new Button("Supprimer");
		buttonSupprimer.setBounds(214, 500, 94, 34);
		add(buttonSupprimer);
		buttonSupprimer.setForeground(Color.WHITE);
		buttonSupprimer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonSupprimer.setBackground(new Color(30, 144, 255));
        Button buttonActualiser = new Button("Actualiser");
		buttonActualiser.setForeground(Color.WHITE);
		buttonActualiser.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonActualiser.setBackground(new Color(30, 144, 255));
		buttonActualiser.setBounds(85, 500, 94, 34);
		add(buttonActualiser);
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
		buttonBackTochoice.setBounds(446, 500, 94, 34);
		add(buttonBackTochoice);
		try {
			InitialContext ctx=new InitialContext();
		    String appName = "EAR_Conference";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
		    List<Listener> list=proxy.listeListenersAVerifier();
		for(Listener ligne :list) {
		 Object[] tab=new Object[6];
		 tab[0]=ligne.getId_listener();
		 tab[1]=ligne.getNom();
		 tab[2]=ligne.getPrenom();
		 tab[3]=ligne.getVille();
		 tab[4]=ligne.getEtablissement();
		 tab[5]=ligne.getTitre_academique();
	     tableModel.addRow(tab);
		}
		table.setModel(tableModel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(2, 0, 701, 41);
		add(panel_1);
		
		JLabel lblLesAuditeurs = new JLabel("Les auditeurs \u00E0 verifier");
		lblLesAuditeurs.setBounds(12, 0, 315, 41);
		panel_1.add(lblLesAuditeurs);
		lblLesAuditeurs.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		buttonSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
			
				if(indexRow != -1) {
				proxy.deleteListener((int)model.getValueAt(indexRow, 0));
				JOptionPane.showMessageDialog(buttonSupprimer, "l'auditeur est supprimé , SVP actualisez la table pour voir le derniére mise à jour  ","", JOptionPane.INFORMATION_MESSAGE);
				}else JOptionPane.showMessageDialog(scrollPane, "Selectionnez un auditeur ","", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		buttonAfficher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
				
				if(indexRow != -1) {
				lblNomVal.setText( model.getValueAt(indexRow, 0).toString());
					panelInfos.setVisible(true);
					scrollPane.setVisible(false);
					 l=proxy.afficherListener((int)model.getValueAt(indexRow, 0));
					lblNomVal.setText(l.getNom());
					lblPrenomVal.setText(l.getPrenom());
					lblVilleVal.setText(l.getVille());
					lblEtablissementVal.setText(l.getEtablissement());
					lblEmailVal.setText(l.getEmail());
					lblMontant.setText(l.getMontant());
					lblTitreAcadimiqueVal.setText(l.getTitre_academique());
					invisibleid.setText((String) tableModel.getValueAt(indexRow, 0));
					
					
					
				}else JOptionPane.showMessageDialog(scrollPane, "Selectionnez un ligne ","", JOptionPane.WARNING_MESSAGE);
			}
		});
		buttonbackToTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
				panelInfos.setVisible(false);
				scrollPane.setVisible(true);
			
				
			}
		});
		buttonActualiser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tableModel=new DefaultTableModel();
				tableModel.addColumn("Num");
			 	tableModel.addColumn("Nom");
		    	tableModel.addColumn("Prenom");
		    	tableModel.addColumn("Ville");
		    	tableModel.addColumn("Etablissement");
		    	tableModel.addColumn("Titre acadimique");
		    	table.setModel(tableModel);
				
				
				table.getTableHeader().setBackground(new Color(0, 96, 255));
				table.getTableHeader().setForeground(Color.white);
				table.getTableHeader().setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
			    List<Listener> list=proxy.listeListenersAVerifier();
				for(Listener ligne :list) {
				 Object[] tab=new Object[6];
				 tab[0]=ligne.getId_listener();
				 tab[1]=ligne.getNom();
				 tab[2]=ligne.getPrenom();
				 tab[3]=ligne.getVille();
				 tab[4]=ligne.getEtablissement();
				 tab[5]=ligne.getTitre_academique();
			     tableModel.addRow(tab);
				}
				table.setModel(tableModel);
				
			}
		});
		buttonConfirmer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				proxy.confirmerListener(l.getId_listener());
				JOptionPane.showMessageDialog(null, "cet auditeur est déplacé vers la table des auditeurs verifiés ","", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		buttonRecu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					File file=new File("temp.png");
        	        FileOutputStream fos=new FileOutputStream(file);
        	        byte b[]=l.getRecu();
        	      
					fos.write(b);
					 fos.close();
					
					File f = new File("temp.png");
			    Desktop dt = Desktop.getDesktop();
			    
					dt.open(f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		} catch (NamingException e) {
			System.out.println("cccccccccccccccaaaaaaaaaaaa");
			e.printStackTrace();
		
    	}
	
	}
}
