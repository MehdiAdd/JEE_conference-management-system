package app.panel.fichier;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Desktop;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import app.panel.login.Login;
import ejb.entity.Fichier;
import session.SessionRemote;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class PublierFichier extends JPanel {
	private JTextField textFieldprogramme;
	private JTextField textFieldLivre;

	/**
	 * Create the panel.
	 */
	public PublierFichier() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblPublierLeProgramme = new JLabel("Publier le programme ");
		lblPublierLeProgramme.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblPublierLeProgramme.setBounds(15, 0, 262, 43);
		add(lblPublierLeProgramme);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(0, 0, 701, 42);
		add(panel_1);
		
		JLabel lblPublierLeLivre = new JLabel("Publier le livre des r\u00E9sum\u00E9s");
		lblPublierLeLivre.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblPublierLeLivre.setBounds(15, 291, 345, 43);
		add(lblPublierLeLivre);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(240, 248, 255));
		panel_1_1.setBounds(0, 291, 701, 42);
		add(panel_1_1);
		
		JLabel lblPublierLeProgramme_1 = new JLabel("Importer le programme");
		lblPublierLeProgramme_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblPublierLeProgramme_1.setBounds(15, 70, 205, 43);
		add(lblPublierLeProgramme_1);
		
		Button buttonAddprogramme = new Button("Importer ");
		
		buttonAddprogramme.setForeground(Color.WHITE);
		buttonAddprogramme.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonAddprogramme.setBackground(new Color(100, 149, 237));
		buttonAddprogramme.setBounds(226, 70, 134, 36);
		add(buttonAddprogramme);
		
		JLabel lblPublierLeProgramme_1_1 = new JLabel("sous le nom :");
		lblPublierLeProgramme_1_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblPublierLeProgramme_1_1.setBounds(15, 123, 134, 43);
		add(lblPublierLeProgramme_1_1);
		
		Button buttonPublierprogramme = new Button("Publier");
	
		buttonPublierprogramme.setForeground(Color.WHITE);
		buttonPublierprogramme.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonPublierprogramme.setBackground(new Color(30, 144, 255));
		buttonPublierprogramme.setBounds(297, 234, 106, 35);
		add(buttonPublierprogramme);
		
		Button buttonSupprimerprogramme = new Button("Supprimer");
	
		buttonSupprimerprogramme.setForeground(Color.WHITE);
		buttonSupprimerprogramme.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonSupprimerprogramme.setBackground(new Color(30, 144, 255));
		buttonSupprimerprogramme.setBounds(447, 234, 106, 35);
		add(buttonSupprimerprogramme);
		
		textFieldprogramme = new JTextField();
		textFieldprogramme.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textFieldprogramme.setColumns(10);
		textFieldprogramme.setBounds(159, 123, 260, 36);
		add(textFieldprogramme);
		
		JLabel lblPublierLeProgramme_1_2 = new JLabel("Le livre");
		lblPublierLeProgramme_1_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblPublierLeProgramme_1_2.setBounds(15, 365, 167, 43);
		add(lblPublierLeProgramme_1_2);
		
		Button buttonDownloadlivre = new Button("T\u00E9l\u00E9charger le livre");
		buttonDownloadlivre.setForeground(Color.WHITE);
		buttonDownloadlivre.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonDownloadlivre.setBackground(new Color(100, 149, 237));
		buttonDownloadlivre.setBounds(193, 365, 167, 36);
		add(buttonDownloadlivre);
		
		JLabel lblPublierLeProgramme_1_1_1 = new JLabel("sous le nom :");
		lblPublierLeProgramme_1_1_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblPublierLeProgramme_1_1_1.setBounds(15, 418, 134, 43);
		add(lblPublierLeProgramme_1_1_1);
		
		textFieldLivre = new JTextField();
		textFieldLivre.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textFieldLivre.setColumns(10);
		textFieldLivre.setBounds(159, 422, 260, 36);
		add(textFieldLivre);
		
		Button buttonPublierlivre = new Button("Publier");
		buttonPublierlivre.setForeground(Color.WHITE);
		buttonPublierlivre.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonPublierlivre.setBackground(new Color(30, 144, 255));
		buttonPublierlivre.setBounds(297, 529, 106, 35);
		add(buttonPublierlivre);
		
		Button buttonSupprimerLivre = new Button("Supprimer");
		buttonSupprimerLivre.setForeground(Color.WHITE);
		buttonSupprimerLivre.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonSupprimerLivre.setBackground(new Color(30, 144, 255));
		buttonSupprimerLivre.setBounds(447, 529, 106, 35);
		add(buttonSupprimerLivre);
		Fichier programme=new Fichier();
		Fichier livre=new Fichier();
		try {
			InitialContext ctx=new InitialContext();
		    String appName = "EAR_Conference";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
		buttonAddprogramme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					JFileChooser file = new JFileChooser();
				file.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter=new FileNameExtensionFilter("*.pdf","PDF");
				file.addChoosableFileFilter(filter);
				int result=file.showSaveDialog(null);
				if(result==JFileChooser.APPROVE_OPTION) {
					File selectedFile=file.getSelectedFile();
					FileInputStream inputStream;
					inputStream = new FileInputStream(selectedFile);
					byte[] pdfData=new byte[(int) selectedFile.length()];
				    inputStream.read(pdfData);
				   programme.setFichier(pdfData);
				   programme.setType("programme");
				    JOptionPane.showMessageDialog(null,
	                        "le programme est bien téléchargé", "Succès",
	                        JOptionPane.INFORMATION_MESSAGE);
				    }else  JOptionPane.showMessageDialog(null,
	                        "vous devez selectionner un seul programme type (pfd) pour étre référence", "Erreur",
	                        JOptionPane.WARNING_MESSAGE);
					} catch ( IOException e1) {
						JOptionPane.showMessageDialog(null,
		                        "vous devez selectionner un seul programme type (pfd) pour étre référence", "Erreur",
		                        JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		buttonDownloadlivre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					if(proxy.downloadFichier("livreNP")==null  ){
						 JOptionPane.showMessageDialog(null,
			                        "Aucun résumé n'est accepté , Le livre n'est pas encore géneré", "Erreur",
			                        JOptionPane.WARNING_MESSAGE);
					} else {
					 String path="";
					 JFileChooser j=new JFileChooser();
					 j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					 Integer opt = j.showSaveDialog(null);
					 if(opt == JFileChooser.APPROVE_OPTION) path=j.getSelectedFile().getAbsolutePath();
					 String name="livre de resumés";
					name = JOptionPane.showInputDialog(null, "Saisissez un nom pour le livre des résumés ");

					 
		            
			        //Prepare output stream for merged pdf file.
			        OutputStream outputStream = 
			                new FileOutputStream(path+"/"+name+".pdf");
			        //get livre depuis la base de donnes
			        Fichier livre=proxy.downloadFichier("livreNP");
                    InputStream input=new  ByteArrayInputStream(livre.getFichier());
			        //call method to merge pdf files.
			        getPdf(input, outputStream); 
				    JOptionPane.showMessageDialog(null,
	                        "le livre est bien téléchargé", "Succès",
	                        JOptionPane.INFORMATION_MESSAGE);
				    Desktop.getDesktop().open(new File(path+"/"+name+".pdf"));
					}
					
					} catch ( IOException e1) {
						JOptionPane.showMessageDialog(null,
		                        "vous devez selectionner un répertoire pour étre référence", "Erreur",
		                        JOptionPane.WARNING_MESSAGE);
					
				} catch (DocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null,
		                        "une erreur s'est produite, fermez les pdf ouvertes et reessayez ", "Erreur",
		                        JOptionPane.WARNING_MESSAGE);
					}
			}
		});
		
		

		buttonPublierprogramme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				programme.setNom(textFieldprogramme.getText());
				if(programme.getFichier()==null || programme.getNom()==null) {
					 JOptionPane.showMessageDialog(null,
		                        "vous devez selectionner le programme et préciser le nom avec lequel sera publié dans le site", "Erreur",
		                        JOptionPane.WARNING_MESSAGE);
				}else {
				 proxy.uploadFichier(programme);
				 JOptionPane.showMessageDialog(null,
	                        "le programme est bien publié", "Succès",
	                        JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		buttonPublierlivre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(proxy.downloadFichier("livreNP")==null  ){
					 JOptionPane.showMessageDialog(null,
		                        "Aucun résumé n'est accepté , Le livre n'est pas encore géneré", "Erreur",
		                        JOptionPane.WARNING_MESSAGE);
				} else if(textFieldLivre.getText().trim().equals("")){
					 JOptionPane.showMessageDialog(null,
		                        "vous devez préciser le nom du livre avec lequel sera publié dans le site", "Erreur",
		                        JOptionPane.WARNING_MESSAGE);
				}else {
					Fichier livre=new Fichier();
					livre.setFichier(proxy.downloadFichier("livreNP").getFichier());
					livre.setType("livre");
				livre.setNom(textFieldLivre.getText());
				 proxy.uploadFichier(livre);
				 JOptionPane.showMessageDialog(null,
	                        "le livre est bien publié", "Succès",
	                        JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		buttonSupprimerprogramme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "voulez-vous supprimer le programme publié dans le site", "Attention",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				   proxy.deletefichier("programme");
				   JOptionPane.showMessageDialog(null,
	                        "le programme est bien supprimé", "Succès",
	                        JOptionPane.INFORMATION_MESSAGE);
				} 
				
			}
		});
		buttonSupprimerLivre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "voulez-vous supprimer le livre publié dans le site", "Attention",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				   proxy.deletefichier("livre");
				   JOptionPane.showMessageDialog(null,
	                        "le livre est bien supprimé", "Succès",
	                        JOptionPane.INFORMATION_MESSAGE);
				} 
				
			}
		});
		} catch (NamingException e) {
			System.out.println("ccccccccccccccc");
			e.printStackTrace();
			}
	}
public static void getPdf(InputStream in, OutputStream outputStream)
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
            //add the page to the destination pdf
            cb.addTemplate(page, 0, 0);
        }
    
    
    outputStream.flush();
    document.close();
    outputStream.close();
}
}
