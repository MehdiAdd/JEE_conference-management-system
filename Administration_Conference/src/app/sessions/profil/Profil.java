package app.sessions.profil;

import javax.swing.JPanel;
import java.awt.Color;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import app.panel.login.Login;
import session.SessionRemote;

import java.awt.Button;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Profil extends JPanel {
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JPasswordField passwordField1;

	/**
	 * Create the panel.
	 */
	public Profil() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNom = new JLabel("Nom ");
		lblNom.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblNom.setBounds(28, 146, 61, 66);
		add(lblNom);
		
		nomField = new JTextField();
		nomField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		nomField.setColumns(10);
		nomField.setText(Login.account_current.getNom_resp_session());
		nomField.setBounds(99, 162, 159, 36);
		add(nomField);
		
		Button buttonModifier = new Button("Modifier");
	
		buttonModifier.setForeground(Color.WHITE);
		buttonModifier.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonModifier.setBackground(new Color(30, 144, 255));
		buttonModifier.setBounds(433, 488, 103, 36);
		add(buttonModifier);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblPrenom.setBounds(310, 146, 75, 66);
		add(lblPrenom);
		
		prenomField = new JTextField();
		prenomField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		prenomField.setColumns(10);
		prenomField.setText(Login.account_current.getPrenom_resp_session());
		prenomField.setBounds(422, 162, 159, 36);
		add(prenomField);
		
		JLabel lblDePasse = new JLabel("Mot de passe");
		lblDePasse.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblDePasse.setBounds(28, 278, 183, 66);
		add(lblDePasse);
		
		JLabel lblModifierProfil = new JLabel("Modifier Profil ");
		lblModifierProfil.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblModifierProfil.setBounds(15, 0, 243, 42);
		add(lblModifierProfil);
		
		JLabel lblRepMotDe = new JLabel("Rep. mot de passe");
		lblRepMotDe.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblRepMotDe.setBounds(28, 334, 183, 66);
		add(lblRepMotDe);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblEmail.setBounds(28, 222, 91, 66);
		
		add(lblEmail);
		
		emailField = new JTextField();
		emailField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		emailField.setColumns(10);
		emailField.setText(Login.account_current.getEmail());
		emailField.setBounds(216, 238, 210, 36);
		add(emailField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(216, 294, 210, 36);
		passwordField.setText(Login.account_current.getPassword());
		passwordField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		add(passwordField);
		
		passwordField1 = new JPasswordField();
		passwordField1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		passwordField1.setBounds(216, 350, 210, 36);
		passwordField1.setText(Login.account_current.getPassword());
		add(passwordField1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 701, 42);
		add(panel);
		
		Button buttonModifierPhoto = new Button("Modifier la photo de profil");
		
		buttonModifierPhoto.setForeground(Color.WHITE);
		buttonModifierPhoto.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonModifierPhoto.setBackground(new Color(100, 149, 237));
		buttonModifierPhoto.setBounds(28, 83, 215, 36);
		add(buttonModifierPhoto);
		buttonModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(passwordField.getText().equals(passwordField1.getText())) {
					try {
						InitialContext ctx=new InitialContext();
					    String appName = "EAR_Conference";
					    String moduleName = "Ejb_Conference";
					    String distinctName = "";
					    String beanName = "SI";
					    String interfaceFullName = SessionRemote.class.getName();
					    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
						SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
					Login.account_current.setNom_resp_session(nomField.getText());
					Login.account_current.setPrenom_resp_session(prenomField.getText());
					Login.account_current.setEmail(emailField.getText());
					Login.account_current.setPassword(passwordField.getText());
					proxy.modifierProfil(Login.account_current);
					 JOptionPane.showMessageDialog(buttonModifier, "la modification est faite avec succès ","", JOptionPane.WARNING_MESSAGE);
					} catch (NamingException e) {
						System.out.println("ccccccccccccccc");
						e.printStackTrace();
						JOptionPane.showMessageDialog(buttonModifier, "échec de la modification ","", JOptionPane.WARNING_MESSAGE);
					
					}
				}else JOptionPane.showMessageDialog(buttonModifier, "les mots de passes ne sont pas adéquats ","", JOptionPane.WARNING_MESSAGE);
			}
		});
		buttonModifierPhoto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {JFileChooser file = new JFileChooser();
				file.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter=new FileNameExtensionFilter("*.images","jpg","png","jpeg","gif");
				file.addChoosableFileFilter(filter);
				int result=file.showSaveDialog(null);
				if(result==JFileChooser.APPROVE_OPTION) {
					File selectedFile=file.getSelectedFile();
					FileInputStream inputStream;
					inputStream = new FileInputStream(selectedFile);
					byte[] pdfData=new byte[(int) selectedFile.length()];
				    inputStream.read(pdfData);
				    Login.account_current.setProfilImage(pdfData);
				    JOptionPane.showMessageDialog(null,
	                        "l'image est bien téléchargée", "",
	                        JOptionPane.INFORMATION_MESSAGE);
				    }else  JOptionPane.showMessageDialog(null,
	                        "vous devez selectionner une seule image de type (png,jpg,jpeg) pour étre référence", "",
	                        JOptionPane.WARNING_MESSAGE);
					} catch ( IOException e) {
						JOptionPane.showMessageDialog(null,
		                        "vous devez selectionner une seule image de type (png,jpg,jpeg) pour étre référence", "",
		                        JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});

	}
}
