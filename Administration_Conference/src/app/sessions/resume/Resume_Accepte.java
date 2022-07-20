package app.sessions.resume;

import java.awt.Button;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.InputStream;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

import app.panel.login.Login;
import session.SessionRemote;

public class Resume_Accepte extends JPanel {
	private JTable table;
	/**
	 * Create the panel.
	 */
	public Resume_Accepte() {

		setBackground(Color.WHITE);
		setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 151, 632, 253);
		JPanel panelInfos = new JPanel();
		panelInfos.setForeground(Color.WHITE);
		panelInfos.setVisible(false);
		panelInfos.setBackground(Color.WHITE);
		panelInfos.setBounds(0, 0, 701, 560);
		add(panelInfos);
		panelInfos.setLayout(null);
		
		Button buttonbackToTable = new Button("Retour");
		buttonbackToTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelInfos.setVisible(false);
				scrollPane.setVisible(true);
				
			}
		});
		buttonbackToTable.setBackground(new Color(30, 144, 255));
		buttonbackToTable.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonbackToTable.setBounds(446, 475, 100, 35);
		panelInfos.add(buttonbackToTable);
		
		Button buttonSupprimer = new Button("Supprimer");
		buttonSupprimer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonSupprimer.setBackground(new Color(30, 144, 255));
		buttonSupprimer.setBounds(322, 475, 106, 35);
		panelInfos.add(buttonSupprimer);
		
		add(scrollPane);
		
		table = new JTable();
		table.setShowVerticalLines(false);
	
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setForeground(Color.BLACK);
		DefaultTableModel tableModel=new DefaultTableModel();
		tableModel.addColumn("Nimuero d'article");
	 	tableModel.addColumn("Nom d'auteur");
	 	tableModel.addColumn("titre");
    	tableModel.addColumn("Session");
    	table.setModel(tableModel);
		table.getTableHeader().setBackground(new Color(0, 96, 255));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		Button buttonAfficher = new Button("Voir Plus");
		
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
		JLabel lblNomAuteur = new JLabel("Nom Auteur ");
		lblNomAuteur.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomAuteur.setBounds(96, 53, 124, 47);
		panelInfos.add(lblNomAuteur);
		
		JLabel lblNomAuteurVal = new JLabel("inconu");
		lblNomAuteurVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomAuteurVal.setBounds(264, 53, 391, 47);
		panelInfos.add(lblNomAuteurVal);
		
		JLabel lblSession = new JLabel("Session      ");
		lblSession.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblSession.setBounds(96, 99, 124, 47);
		panelInfos.add(lblSession);
		
		JLabel lblSessionVal = new JLabel("inconu");
		lblSessionVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblSessionVal.setBounds(264, 99, 391, 47);
		panelInfos.add(lblSessionVal);
		
		JLabel lblTitre = new JLabel("Titre  ");
		lblTitre.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblTitre.setBounds(96, 324, 79, 47);
		panelInfos.add(lblTitre);
		
		JLabel lbltitreVal = new JLabel("inconu");
		lbltitreVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lbltitreVal.setBounds(266, 324, 369, 47);
		panelInfos.add(lbltitreVal);
		JLabel lblNomEtPrenom_1 = new JLabel("Etablissement");
		lblNomEtPrenom_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_1.setBounds(96, 145, 124, 47);
		panelInfos.add(lblNomEtPrenom_1);
		
		JLabel lblEtablissementVal = new JLabel("inconu");
		lblEtablissementVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblEtablissementVal.setBounds(264, 145, 371, 47);
		panelInfos.add(lblEtablissementVal);
		
		JLabel lblNomEtPrenom_2 = new JLabel("Email  ");
		lblNomEtPrenom_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_2.setBounds(96, 237, 100, 47);
		panelInfos.add(lblNomEtPrenom_2);
		
		JLabel lblEmailVal = new JLabel("inconu");
		lblEmailVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblEmailVal.setBounds(264, 237, 349, 47);
		panelInfos.add(lblEmailVal);
		
		JLabel lblVille = new JLabel("Ville ");
		lblVille.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblVille.setBounds(96, 191, 93, 47);
		panelInfos.add(lblVille);
		
		JLabel lblVilleVal = new JLabel("inconu");
		lblVilleVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblVilleVal.setBounds(264, 191, 391, 47);
		panelInfos.add(lblVilleVal);
		
		JLabel lblNomEtPrenom_2_1 = new JLabel("Titre Acadimique");
		lblNomEtPrenom_2_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblNomEtPrenom_2_1.setBounds(96, 281, 131, 47);
		panelInfos.add(lblNomEtPrenom_2_1);
		
		JLabel lblTitreAcadimiqueVal = new JLabel("inconu");
		lblTitreAcadimiqueVal.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblTitreAcadimiqueVal.setBounds(264, 281, 371, 47);
		panelInfos.add(lblTitreAcadimiqueVal);
		
		JLabel lblRsum = new JLabel("R\u00E9sum\u00E9");
		lblRsum.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblRsum.setBounds(96, 368, 85, 47);
		panelInfos.add(lblRsum);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label.setBounds(223, 62, 22, 28);
		panelInfos.add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_1.setBounds(223, 107, 22, 28);
		panelInfos.add(label_1);
		
		JLabel label_2 = new JLabel(":");
		label_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_2.setBounds(223, 156, 22, 28);
		panelInfos.add(label_2);
		
		JLabel label_3 = new JLabel(":");
		label_3.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_3.setBounds(223, 200, 22, 28);
		panelInfos.add(label_3);
		
		JLabel label_4 = new JLabel(":");
		label_4.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_4.setBounds(223, 243, 22, 28);
		panelInfos.add(label_4);
		
		JLabel label_5 = new JLabel(":");
		label_5.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_5.setBounds(223, 286, 22, 28);
		panelInfos.add(label_5);
		
		JLabel label_6 = new JLabel(":");
		label_6.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_6.setBounds(223, 375, 22, 28);
		panelInfos.add(label_6);
		Button buttonPdf = new Button("Pdf");
		buttonPdf.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonPdf.setBackground(new Color(100, 149, 237));
		buttonPdf.setBounds(247, 377, 106, 28);
		panelInfos.add(buttonPdf);
		
		JLabel label_7 = new JLabel(":");
		label_7.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		label_7.setBounds(223, 330, 22, 28);
		panelInfos.add(label_7);
		
		JLabel lblModifierPdcvrofil = new JLabel("Details sur le r\u00E9sum\u00E9");
		lblModifierPdcvrofil.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblModifierPdcvrofil.setBounds(15, -3, 262, 43);
		panelInfos.add(lblModifierPdcvrofil);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(0, -3, 701, 42);
		panelInfos.add(panel_1);
		Button buttonActualiser = new Button("Actualiser");
		buttonActualiser.setForeground(Color.WHITE);
		buttonActualiser.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonActualiser.setBackground(new Color(30, 144, 255));
		buttonActualiser.setBounds(170, 500, 106, 35);
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
			if(Login.account_current!=null) {
		    List<ejb.entity.Participant> list=proxy.listeParticipantsAccepte(Login.account_current);
		for(ejb.entity.Participant ligne :list) {
		 Object[] tab=new Object[4];
		 tab[0]=ligne.getId_speaker();
		 tab[1]=ligne.getNom()+" "+ligne.getPrenom();
		 tab[2]=ligne.getTitre();
		 tab[3]=ligne.getSession();
	
	     tableModel.addRow(tab);
	  
		}
		table.setModel(tableModel);
			}
		JLabel lblLesRsumsAccepts = new JLabel("Les r\u00E9sum\u00E9s accept\u00E9s");
		lblLesRsumsAccepts.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblLesRsumsAccepts.setBounds(10, 0, 243, 42);
		add(lblLesRsumsAccepts);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(240, 248, 255));
		panel_1_1.setBounds(0, 0, 701, 42);
		add(panel_1_1);
		   buttonAfficher.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int indexRow= table.getSelectedRow();
					
					System.out.print(indexRow);
					if(indexRow != -1) {
					ejb.entity.Participant speaker=proxy.afficherParticipant((int)model.getValueAt(indexRow, 0));
					lblNomAuteurVal.setText( speaker.getNom()+" "+speaker.getPrenom());
					lblEtablissementVal.setText(speaker.getEtablissement());
					lblEmailVal.setText(speaker.getEmail());
					lbltitreVal.setText(speaker.getTitre());
					lblVilleVal.setText(speaker.getVille());
					lblTitreAcadimiqueVal.setText(speaker.getTitre_academique());
					lblSessionVal.setText(speaker.getSession());
					
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
				ejb.entity.Participant speaker=proxy.deleteParticipant((int)model.getValueAt(indexRow, 0));
				JOptionPane.showMessageDialog(buttonSupprimer, "le resumé de l'auteur "+speaker.getNom()+" "+speaker.getPrenom()+" est bien supprimé","", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		buttonActualiser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				DefaultTableModel tableModel=new DefaultTableModel();
				tableModel.addColumn("Nimuero d'article");
			 	tableModel.addColumn("Nom d'auteur");
			 	tableModel.addColumn("titre");
		    	tableModel.addColumn("Session");
		    	table.setModel(tableModel);
			
				 List<ejb.entity.Participant> list=proxy.listeParticipantsAccepte(Login.account_current);
				for(ejb.entity.Participant ligne :list) {
				 Object[] tab=new Object[4];
				 tab[0]=ligne.getId_speaker();
				 tab[1]=ligne.getNom()+" "+ligne.getPrenom();
				 tab[2]=ligne.getTitre();
				 tab[3]=ligne.getSession();
			
			     tableModel.addRow(tab);
			  
				}
				table.setModel(tableModel);
			}
		});
		buttonPdf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int indexRow= table.getSelectedRow();
				ejb.entity.Participant speaker=proxy.afficherParticipant((int)model.getValueAt(indexRow, 0));
				byte[] b=speaker.getResume();
				FileOutputStream fout;
				try {
					fout = new FileOutputStream("temp.pdf");
					DataOutputStream dout = new DataOutputStream(fout);
					dout.write(b,0,b.length);
					fout.close();
					Desktop.getDesktop().open(new File("temp.pdf"));
					//Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+"C:\\Users\\mehdi\\eclipse-workspace\\Administration_Conference\\"+speaker.getTitre()+".pdf");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		} catch (NamingException e) {
			System.out.println("cccccccccccccccaaaaaaaaaaaa");
			e.printStackTrace();
		
    	}
		

	}

}
