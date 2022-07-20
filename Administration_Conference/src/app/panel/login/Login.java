package app.panel.login;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Panel;
import javax.swing.JLabel;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import app.panel.Presence.ChoicePresence;
import app.panel.auditeurs.AuditeursAverfier;
import app.panel.auditeurs.ChoiceAuditeur;
import app.panel.dates.Dates_panel;
import app.panel.fichier.PublierFichier;
import app.panel.speakers.ChoiceSession;
import app.sessions.Home;
import ejb.entity.Session_speciale;
import session.SessionRemote;

import javax.swing.JTextField;
import javax.swing.OverlayLayout;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Login extends JPanel {
	private JTextField textField;
	private JPasswordField textField_1;
	private final JLabel incorrect = new JLabel("Email ou le mot de passe est incorrect ");
    public static Session_speciale account_current=null;
	/**
	 * Create the panel.
	 */
	public Login() {
		setBackground(Color.WHITE);
		setLayout(new OverlayLayout(this));
		Panel panelRespondable = new Panel();
		panelRespondable.setBounds(0, 0, 1001, 643);
		panelRespondable.setLayout(null);
		add(panelRespondable);
		panelRespondable.setVisible(false);
		ChoiceSession speaker=new ChoiceSession();
		speaker.setBounds(300, 0, 700, 643);
		speaker.setVisible(true);
		panelRespondable.add(speaker);
		Dates_panel dates=new Dates_panel();
		dates.setBounds(300, 0, 700, 643);
		panelRespondable.add(dates);
		dates.setVisible(false);
		PublierFichier publierFichier=new PublierFichier();
		publierFichier.setBounds(300, 0, 700, 643);
		panelRespondable.add(publierFichier);
		publierFichier.setVisible(false);
		ChoiceAuditeur auditeurs=new ChoiceAuditeur();
		auditeurs.setBounds(300, 0, 700, 643);
		panelRespondable.add(auditeurs);
		auditeurs.setVisible(false);
		ChoicePresence presence=new ChoicePresence();
		presence.setBounds(300, 0, 700, 643);
		panelRespondable.add(presence);
		presence.setVisible(false);
		JPanel panelSide = new JPanel();
		panelSide.setBackground(new Color(0, 50, 90));
		panelSide.setBounds(0, 0, 301, 643);
		panelRespondable.add(panelSide);
		panelSide.setLayout(null);
		panelSide.setVisible(true);
		
		Panel panelLogin=new Panel();
		
		panelLogin.setBounds(0, 0, 1001, 643);
		panelLogin.setLayout(null);
		add(panelLogin);
		Panel panel1 = new Panel();
		panel1.setBounds(507, 0, 500, 643);
		panelLogin.add(panel1);
		panel1.setLayout(null);
		Panel panel = new Panel();
		panel.setBounds(0, 0, 506, 593);
		panelLogin.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		//lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/5df80d6d74548.jpg")));
		lblNewLabel.setBounds(0, 0, 506, 593);
		ImageIcon img=new ImageIcon(Home.class.getResource("/images/mod.png"));
		Image img1=img.getImage();
		
		ImageIcon i=new ImageIcon(img1.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(i);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		textField.setBounds(71, 184, 321, 42);
		panel1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDeRedponsable = new JLabel("Email");
		lblNomDeRedponsable.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblNomDeRedponsable.setBounds(71, 140, 304, 31);
		panel1.add(lblNomDeRedponsable);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(71, 288, 321, 42);
		panel1.add(textField_1);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblMotDePasse.setBounds(71, 244, 304, 31);
		panel1.add(lblMotDePasse);
		
		Button button = new Button("Connecter");
		
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(71, 380, 321, 49);
		panel1.add(button);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 26));
		lblLogin.setBounds(200, 46, 84, 49);
		panel1.add(lblLogin);
		incorrect.setForeground(new Color(220, 20, 60));
		incorrect.setVisible(false);
		incorrect.setFont(new Font("MS Reference Sans Serif", Font.ITALIC, 14));
		incorrect.setBackground(new Color(220, 20, 60));
		incorrect.setBounds(30, 500, 300, 40);
		panel1.add(incorrect);
		JPanel panelBtnResume = new JPanel();
		panelBtnResume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBtnResume.setBackground(new Color(0, 50, 90));
		panelBtnResume.setBounds(11, 119, 289, 68);
		panelSide.add(panelBtnResume);
		panelBtnResume.setLayout(null);
		
		JLabel lblLesR = new JLabel("Sessions & R\u00E9sum\u00E9s");
		lblLesR.setForeground(new Color(255, 255, 255));
		lblLesR.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblLesR.setBounds(25, 18, 252, 31);
		panelBtnResume.add(lblLesR);
		
		JPanel panelBtnDate = new JPanel();
		panelBtnDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBtnDate.setBackground(new Color(0, 50, 90));
		panelBtnDate.setBounds(11, 275, 289, 68);
		panelSide.add(panelBtnDate);
		panelBtnDate.setLayout(null);
		
		JLabel lblLesDates = new JLabel("Les Dates importantes");
		lblLesDates.setForeground(Color.WHITE);
		lblLesDates.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblLesDates.setBounds(33, 18, 223, 31);
		panelBtnDate.add(lblLesDates);
		
		JPanel panelBtnSideResume = new JPanel();
		panelBtnSideResume.setBackground(new Color(0, 150, 50));
		panelBtnSideResume.setBounds(0, 127, 10, 50);
		panelSide.add(panelBtnSideResume);
		
		JPanel panelBtnSideDate = new JPanel();
		panelBtnSideDate.setBackground(new Color(0, 50, 90));
		panelBtnSideDate.setBounds(0, 283, 10, 50);
		panelSide.add(panelBtnSideDate);
		
		JPanel panelBtnAuditeur = new JPanel();
		panelBtnAuditeur.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBtnAuditeur.setLayout(null);
		panelBtnAuditeur.setBackground(new Color(0, 50, 90));
		panelBtnAuditeur.setBounds(11, 197, 289, 68);
		panelSide.add(panelBtnAuditeur);
		
		JLabel lblLesAuditeurs = new JLabel("Les auditeurs");
		lblLesAuditeurs.setForeground(Color.WHITE);
		lblLesAuditeurs.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblLesAuditeurs.setBounds(63, 18, 193, 31);
		panelBtnAuditeur.add(lblLesAuditeurs);
		
		JPanel panelBtnSideAuditeur = new JPanel();
		panelBtnSideAuditeur.setBackground(new Color(0, 50, 90));
		panelBtnSideAuditeur.setBounds(0, 205, 10, 50);
		panelSide.add(panelBtnSideAuditeur);
		
		JPanel panelBtnFichier = new JPanel();
		panelBtnFichier.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBtnFichier.setLayout(null);
		panelBtnFichier.setBackground(new Color(0, 50, 90));
		panelBtnFichier.setBounds(11, 353, 289, 68);
		panelSide.add(panelBtnFichier);
		
		JLabel lblPublierLesFichier = new JLabel("Publier les fichiers");
		lblPublierLesFichier.setForeground(Color.WHITE);
		lblPublierLesFichier.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblPublierLesFichier.setBounds(48, 18, 208, 31);
		panelBtnFichier.add(lblPublierLesFichier);
		
		JPanel panelBtnSideFichier = new JPanel();
		panelBtnSideFichier.setBackground(new Color(0, 50, 90));
		panelBtnSideFichier.setBounds(0, 361, 10, 50);
		panelSide.add(panelBtnSideFichier);
		
		JPanel panelBtnSidePresence = new JPanel();
		panelBtnSidePresence.setBackground(new Color(0, 50, 90));
		panelBtnSidePresence.setBounds(0, 438, 10, 50);
		panelSide.add(panelBtnSidePresence);
		
		JPanel panelBtnPresence = new JPanel();
		panelBtnPresence.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBtnPresence.setLayout(null);
		panelBtnPresence.setBackground(new Color(0, 50, 90));
		panelBtnPresence.setBounds(11, 430, 289, 68);
		panelSide.add(panelBtnPresence);
		
		JLabel lblPresence = new JLabel("Pr\u00E9sence & Attestation");
		lblPresence.setForeground(Color.WHITE);
		lblPresence.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblPresence.setBounds(23, 18, 233, 31);
		panelBtnPresence.add(lblPresence);

	
		
	
		
		panelBtnResume.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setcolorside(panelBtnSideResume);
				resetcolorside(panelBtnSideDate);
				resetcolorside(panelBtnSideAuditeur);
				resetcolorside(panelBtnSideFichier);
				resetcolorside(panelBtnSidePresence);
				dates.setVisible(false);
				publierFichier.setVisible(false);
				speaker.setVisible(true);
				auditeurs.setVisible(false);
				presence.setVisible(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				setcolorbtn(panelBtnResume);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetcolorbtn(panelBtnResume);
			}
		});
		panelBtnPresence.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				resetcolorside(panelBtnSideResume);
				resetcolorside(panelBtnSideDate);
				resetcolorside(panelBtnSideAuditeur);
				resetcolorside(panelBtnSideFichier);
				setcolorside(panelBtnSidePresence);
				dates.setVisible(false);
				publierFichier.setVisible(false);
				speaker.setVisible(false);
				auditeurs.setVisible(false);
				presence.setVisible(true);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				setcolorbtn(panelBtnPresence);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetcolorbtn(panelBtnPresence);
			}
		});
		panelBtnDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setcolorside(panelBtnSideDate);
				resetcolorside(panelBtnSideResume);
				resetcolorside(panelBtnSideAuditeur);
				resetcolorside(panelBtnSideFichier);
				resetcolorside(panelBtnSidePresence);
				speaker.setVisible(false);
				dates.setVisible(true);
				publierFichier.setVisible(false);
				auditeurs.setVisible(false);
				presence.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				setcolorbtn(panelBtnDate);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetcolorbtn(panelBtnDate);
			}
		});
		panelBtnAuditeur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				resetcolorside(panelBtnSideResume);
				resetcolorside(panelBtnSideDate);
				setcolorside(panelBtnSideAuditeur);
				resetcolorside(panelBtnSideFichier);
				resetcolorside(panelBtnSidePresence);
				dates.setVisible(false);
				speaker.setVisible(false);
				auditeurs.setVisible(true);
				publierFichier.setVisible(false);
				presence.setVisible(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				setcolorbtn(panelBtnAuditeur);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetcolorbtn(panelBtnAuditeur);
			}
		});
		panelBtnFichier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				resetcolorside(panelBtnSideResume);
				resetcolorside(panelBtnSideDate);
				resetcolorside(panelBtnSideAuditeur);
				setcolorside(panelBtnSideFichier);
				resetcolorside(panelBtnSidePresence);
				dates.setVisible(false);
				speaker.setVisible(false);
				auditeurs.setVisible(false);
				publierFichier.setVisible(true);
				presence.setVisible(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				setcolorbtn(panelBtnFichier);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetcolorbtn(panelBtnFichier);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					InitialContext ctx=new InitialContext();
				    String appName = "EAR_Conference";
				    String moduleName = "Ejb_Conference";
				    String distinctName = "";
				    String beanName = "SI";
				    String interfaceFullName = SessionRemote.class.getName();
				    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
					try {
				    SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
				    List<Session_speciale> listeSession=proxy.connectToSession(textField.getText(), textField_1.getText());
				    
				    
				    if(listeSession.size()!=0) {
				    	account_current=listeSession.get(0);
				    	Home homeSession = new Home();
						homeSession.setBackground(new Color(0, 50, 90));
						homeSession.setBounds(0, 0, 1001, 643);
						add(homeSession);
						
				    	homeSession.setVisible(true);
				    	panelLogin.setVisible(false);
				    }
				    else if(textField.getText().equals("admin") && textField_1.getText().equals("admin"))
				    { panelRespondable.setVisible(true);
				    panelLogin.setVisible(false);}
					}catch(Exception ex) {
						incorrect.setVisible(true);
						
					}
				} catch (NamingException e1) {
					System.out.println("cccccccccccccccaaaaaaaaaaaa");
					e1.printStackTrace();
				
		    	}
		
			
			
			}
		});

	}
	 public void setcolorbtn(JPanel panbtn){
			panbtn.setBackground(new Color(0,50,110));
		}
	 public void resetcolorbtn(JPanel panbtn){
			panbtn.setBackground(new Color(0,50,90));
		}
	 public void setcolorside(JPanel panbtn){
			panbtn.setBackground(new Color(0,150,50));
		}
	 public void resetcolorside(JPanel panbtn){
			panbtn.setBackground(new Color(0,50,90));
		}
}
