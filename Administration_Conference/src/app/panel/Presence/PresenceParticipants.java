package app.panel.Presence;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import app.sessions.Home;
import ejb.entity.Listener;
import ejb.entity.Participant;
import session.SessionRemote;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.JTextField;
import javax.swing.RowFilter;

public class PresenceParticipants extends JPanel {
	private JTable table;
	private JLabel lblrefrech;
	private JTextField textFieldRechercher;
	/**
	 * Create the panel.
	 */
	public PresenceParticipants() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 701, 41);
		add(panel);
		
		JLabel lblListeEsAuditeurs = new JLabel("Liste des participants");
		lblListeEsAuditeurs.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblListeEsAuditeurs.setBounds(10, 0, 252, 43);
		panel.add(lblListeEsAuditeurs);
		
		Button buttonbackToTable = new Button("Retour");
		buttonbackToTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
			}
		});
		buttonbackToTable.setForeground(Color.WHITE);
		buttonbackToTable.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonbackToTable.setBackground(new Color(30, 144, 255));
		buttonbackToTable.setBounds(543, 541, 100, 35);
		add(buttonbackToTable);
		
		JLabel lblGnererLesAttestations = new JLabel("G\u00E9nerer les attestations pour les participants pr\u00E9sents");
		lblGnererLesAttestations.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lblGnererLesAttestations.setBounds(36, 469, 421, 41);
		add(lblGnererLesAttestations);
		
		Button buttonAddprogramme = new Button("G\u00E9nerer");
		buttonAddprogramme.setForeground(Color.WHITE);
		buttonAddprogramme.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonAddprogramme.setBackground(new Color(100, 149, 237));
		buttonAddprogramme.setBounds(452, 474, 127, 36);
		add(buttonAddprogramme);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 97, 633, 359);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(28);
		table.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		DefaultTableModel tableModel=new DefaultTableModel()
	 	{@Override
            public Class getColumnClass(int column) {
            switch (column) {
                case 0:
                    return String.class;
                case 1:
                    return String.class;
                case 2:
                    return String.class;
                case 3:
                    return String.class;
                case 4:
                    return Boolean.class;
                default:
                    return String.class;
            }}};
	 	
	 	tableModel.addColumn("Numero");
	 	tableModel.addColumn("Nom");
    	tableModel.addColumn("Prenom");
    	tableModel.addColumn("Session");
    	tableModel.addColumn("présence");
        
    	
    	
	
				
		table.getTableHeader().setBackground(new Color(0, 96, 255));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		scrollPane.setViewportView(table);
		JPanel panel_1 = new JPanel();
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(629, 455, 40, 40);
		add(panel_1);
		panel_1.setLayout(null);
		
		lblrefrech = new JLabel("");
		
		lblrefrech.setBounds(0, 0, 40, 40);
		ImageIcon img=new ImageIcon(Home.class.getResource("/images/refrech.png"));
		Image img1=img.getImage();
		
		ImageIcon i=new ImageIcon(img1.getScaledInstance(lblrefrech.getWidth(), lblrefrech.getHeight(),Image.SCALE_SMOOTH));
		lblrefrech.setIcon(i);
		panel_1.add(lblrefrech);
		try {
			InitialContext ctx=new InitialContext();
		    String appName = "EAR_Conference";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
		    List<Participant> list=proxy.listeParticipantsAccepte1();
		for(Participant ligne :list) {
		 Object[] tab=new Object[5];
		 tab[0]=ligne.getId_speaker();
		 tab[1]=ligne.getNom();
		 tab[2]=ligne.getPrenom();
		 tab[3]=ligne.getSession();
		 tab[4]=new Boolean(false);
	
	     tableModel.addRow(tab);
		}
		 list=proxy.listeParticipantsAccepteParAdmin();
			for(Participant ligne :list) {
			 Object[] tab=new Object[5];
			 tab[0]=ligne.getId_speaker();
			 tab[1]=ligne.getNom();
			 tab[2]=ligne.getPrenom();
			 tab[3]="(SO)"+ligne.getSession();
			 tab[4]=new Boolean(false);
		
		     tableModel.addRow(tab);
			}
		 list=proxy.listeParticipantsNonAccepte();
			for(Participant ligne :list) {
			 Object[] tab=new Object[5];
			 tab[0]=ligne.getId_speaker();
			 tab[1]=ligne.getNom();
			 tab[2]=ligne.getPrenom();
			 tab[3]="(NA)"+ligne.getSession();
			 tab[4]=new Boolean(false);
		
		     tableModel.addRow(tab);
			}
		
		table.setModel(tableModel);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblRechercher.setBounds(273, 52, 105, 37);
		add(lblRechercher);
		
		textFieldRechercher = new JTextField();
		textFieldRechercher.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textFieldRechercher.setColumns(10);
		textFieldRechercher.setBounds(390, 52, 260, 36);
		add(textFieldRechercher);
		lblrefrech.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 if (tableModel.getRowCount() > 0) {
	                    for (int i = tableModel.getRowCount() - 1; i > -1; i--) {
	                    	tableModel.removeRow(i);
	                    }
				 }
				List<Participant> list=proxy.listeParticipantsAccepte1();
				for(Participant ligne :list) {
				 Object[] tab=new Object[5];
				 tab[0]=ligne.getId_speaker();
				 tab[1]=ligne.getNom();
				 tab[2]=ligne.getPrenom();
				 tab[3]=ligne.getSession();
				 tab[4]=new Boolean(false);
			
			     tableModel.addRow(tab);
			     
				}
				 list=proxy.listeParticipantsAccepteParAdmin();
					for(Participant ligne :list) {
					 Object[] tab=new Object[5];
					 tab[0]=ligne.getId_speaker();
					 tab[1]=ligne.getNom();
					 tab[2]=ligne.getPrenom();
					 tab[3]="(SO)"+ligne.getSession();
					 tab[4]=new Boolean(false);
				
				     tableModel.addRow(tab);
					}
				 list=proxy.listeParticipantsNonAccepte();
					for(Participant ligne :list) {
					 Object[] tab=new Object[5];
					 tab[0]=ligne.getId_speaker();
					 tab[1]=ligne.getNom();
					 tab[2]=ligne.getPrenom();
					 tab[3]="(NA)"+ligne.getSession();
					 tab[4]=new Boolean(false);
				
				     tableModel.addRow(tab);
					}
					table.setModel(tableModel);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(new Color(100, 180, 237));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(new Color(100, 149, 237));
				
			}
		});
		textFieldRechercher.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel table1 = (DefaultTableModel)table.getModel();
		        String search = textFieldRechercher.getText();
		        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table1);
		        table.setRowSorter(tr);
		        tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
	
		buttonAddprogramme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean generate=false;
				for(int i=0;i<tableModel.getRowCount();i++) {
					Participant p=proxy.afficherParticipant((int)tableModel.getValueAt(i, 0));
					p.setPresence((boolean) tableModel.getValueAt(i, 4));
					proxy.upDateParticipant(p);
					if( (boolean) tableModel.getValueAt(i, 4)){
						System.out.println(tableModel.getValueAt(i, 3));
						generate=true;
						try{
							File file=new File("fichier/attestationParticipant.pdf");
							OutputStream outputStream = 
					                new FileOutputStream("fichier/attestationtemp.pdf");
							
							InputStream input= new FileInputStream(file);
							generateAttestation(input,outputStream,p.getNom(),p.getPrenom());
							/*File attest=new File("fichier/attestationtemp.pdf");
							InputStream inputAttest= new FileInputStream(attest);
							System.out.println(l.getId_listener());
							if(inputAttest==null) System.out.print("nuuuuuuuuuuuuuuuuuuuuuuuuull");*/
							byte[] encoded = Files.readAllBytes(Paths.get("fichier/attestationtemp.pdf"));
							
							proxy.saveAttestationParticipant(p.getId_speaker(), encoded);
							
						} catch ( DocumentException | IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							JOptionPane.showMessageDialog(null, "erreur s'est produite","", JOptionPane.WARNING_MESSAGE);
						}
						
					}
					
				}
				if(generate) {
				try {
					 List<Participant> list=proxy.listeParticipantPresent();
					 List<InputStream> inputPdfList = new ArrayList<InputStream>();
			        //Prepare input pdf file list as list of input stream.
					 for(Participant ligne:list) {
						 System.out.println(ligne.getId_speaker());
							
			        InputStream input=new ByteArrayInputStream(ligne.getAttestation());
			        inputPdfList.add(input);
					 }
					 String path="";
					 JFileChooser j=new JFileChooser();
					 j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					 Integer opt = j.showSaveDialog(null);
					 if(opt == JFileChooser.APPROVE_OPTION) path=j.getSelectedFile().getAbsolutePath();
					 String name = JOptionPane.showInputDialog(null, "Saisissez un nom pour le pfd des attestations ");

					 
		            
			        //Prepare output stream for merged pdf file.
			        OutputStream outputStream = 
			                new FileOutputStream(path+"/"+name+".pdf");

			        //call method to merge pdf files.
			        doMerge(inputPdfList, outputStream);    
			        JOptionPane.showMessageDialog(null, "Les attéstations sont génerées","succès", JOptionPane.INFORMATION_MESSAGE);
			        Desktop.getDesktop().open(new File(path+"/"+name+".pdf"));
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
				}else JOptionPane.showMessageDialog(null, "Cocher les présents","Cocher les présents", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	
	
	
		} catch (NamingException e) {
			System.out.println("cccccccccccccccaaaaaaaaaaaa");
			e.printStackTrace();
		
    	}

	

	}
	public static void generateAttestation(InputStream in, OutputStream outputStream,String nom,String prenom)
            throws DocumentException, IOException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        
        
            PdfReader reader = new PdfReader(in);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                document.newPage();
                //import the page from source pdf
                PdfImportedPage page = writer.getImportedPage(reader, i);
                ColumnText ct = new ColumnText(writer.getDirectContent());
                ct.setSimpleColumn(370,0,3900,468);
                com.itextpdf.text.Font bold = new com.itextpdf.text.Font(FontFamily.HELVETICA, 12, Font.BOLD);
                /*Paragraph p = new Paragraph("NAME: ", bold);
                Paragraph p=new Paragraph("Mehdi Adnani");*/
             Phrase pc=new Phrase(nom+" "+prenom,bold);
             
               
                ct.addElement(pc);
                
                ct.go();
               
                //add the page to the destination pdf
                cb.addTemplate(page, 0, 0);
                
             // this are the coordinates where you want to add text
             // if the text does not fit inside it will be cropped
             
            
        }
        
        outputStream.flush();
        document.close();
        outputStream.close();
    }
 public static void doMerge(List<InputStream> list, OutputStream outputStream)
            throws DocumentException, IOException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        
        for (InputStream in : list) {
            PdfReader reader = new PdfReader(in);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                document.newPage();
                //import the page from source pdf
                PdfImportedPage page = writer.getImportedPage(reader, i);
                //add the page to the destination pdf
                cb.addTemplate(page, 0, 0);
            }
        }
        
        outputStream.flush();
        document.close();
        outputStream.close();
    }
}
