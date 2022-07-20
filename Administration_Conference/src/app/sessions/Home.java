package app.sessions;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import app.panel.login.Login;
import app.sessions.profil.Profil;
import app.sessions.resume.ChoiceResume;
import ejb.entity.Session_speciale;
import session.SessionRemote;

public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		setBackground(Color.WHITE);
		setLayout(null);
		JPanel panelSide = new JPanel();
		panelSide.setBackground(new Color(0, 50, 90));
		panelSide.setBounds(0, 0, 301, 601);
		this.add(panelSide);
		panelSide.setLayout(null);
		Profil profil=new Profil();
		profil.setBounds(300, 40, 701, 560);
		profil.setVisible(false);
		add(profil);
		
		JPanel panelBtnResume = new JPanel();
		panelBtnResume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBtnResume.setBackground(new Color(0, 50, 90));
		panelBtnResume.setBounds(11, 318, 289, 68);
		panelSide.add(panelBtnResume);
		panelBtnResume.setLayout(null);
		
		JLabel lblLesDates = new JLabel("Gestion R\u00E9sum\u00E9");
		lblLesDates.setForeground(Color.WHITE);
		lblLesDates.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblLesDates.setBounds(62, 18, 194, 31);
		panelBtnResume.add(lblLesDates);
		
		JPanel panelBtnSideResume = new JPanel();
		panelBtnSideResume.setBackground(new Color(0, 150, 50));
		panelBtnSideResume.setBounds(0, 328, 10, 50);
		panelSide.add(panelBtnSideResume);
		
		JPanel panelBtnProfil = new JPanel();
	
		panelBtnProfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBtnProfil.setLayout(null);
		panelBtnProfil.setBackground(new Color(0, 50, 90));
		panelBtnProfil.setBounds(11, 240, 289, 68);
		panelSide.add(panelBtnProfil);
		
		JLabel lblLesAuditeurs = new JLabel("Profil");
		lblLesAuditeurs.setForeground(Color.WHITE);
		lblLesAuditeurs.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblLesAuditeurs.setBounds(111, 18, 145, 31);
		panelBtnProfil.add(lblLesAuditeurs);
		
		JPanel panelBtnSideProfil = new JPanel();
		panelBtnSideProfil.setBackground(new Color(0, 50, 90));
		panelBtnSideProfil.setBounds(0, 250, 10, 50);
		panelSide.add(panelBtnSideProfil);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setBounds(93, 0, 115, 105);
	
	
		
		JLabel lblNomCompte = new JLabel(Login.account_current.getNom_resp_session()+" "+Login.account_current.getPrenom_resp_session());
		lblNomCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomCompte.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblNomCompte.setForeground(Color.WHITE);
		lblNomCompte.setBackground(Color.WHITE);
		lblNomCompte.setBounds(11, 115, 280, 61);
		panelSide.add(lblNomCompte);
		
		ChoiceResume choiceResume=new ChoiceResume();
		choiceResume.setBounds(300, 40, 701, 560);
		choiceResume.setVisible(true);
		add(choiceResume);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(299, 0, 701, 40);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblGrerVotreSession = new JLabel("Résponsable de session : "+Login.account_current.getTitre_session());
		lblGrerVotreSession.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		lblGrerVotreSession.setBounds(10, 0, 691, 40);
		panel.add(lblGrerVotreSession);
		
		try {
			InitialContext ctx=new InitialContext();
		    String appName = "EAR_Conference";
		    String moduleName = "Ejb_Conference";
		    String distinctName = "";
		    String beanName = "SI";
		    String interfaceFullName = SessionRemote.class.getName();
		    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
			SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
		
			ImageIcon img=proxy.getImage(Login.account_current);
			Image img1=img.getImage();
			
			ImageIcon i=new ImageIcon(img1.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(i);
			panelSide.add(lblNewLabel);
			panelBtnProfil.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					setcolorside(panelBtnSideProfil);
					resetcolorside(panelBtnSideResume);
					profil.setVisible(true);
					choiceResume.setVisible(false);
					lblNomCompte.setText(Login.account_current.getNom_resp_session()+" "+Login.account_current.getPrenom_resp_session());
					ImageIcon img=proxy.getImage(Login.account_current);
					Image img1=img.getImage();
					
					ImageIcon i=new ImageIcon(img1.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),Image.SCALE_SMOOTH));
					lblNewLabel.setIcon(i);
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					
					setcolorbtn(panelBtnProfil);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					
					resetcolorbtn(panelBtnProfil);
				}
			});
			panelBtnResume.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					setcolorside(panelBtnSideResume);
					resetcolorside(panelBtnSideProfil);
					profil.setVisible(false);
					choiceResume.setVisible(true);
					lblNomCompte.setText(Login.account_current.getNom_resp_session()+" "+Login.account_current.getPrenom_resp_session());
					ImageIcon img=proxy.getImage(Login.account_current);
					Image img1=img.getImage();
					
					ImageIcon i=new ImageIcon(img1.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),Image.SCALE_SMOOTH));
					lblNewLabel.setIcon(i);
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
		} catch (NamingException e) {
			System.out.println("ccccccccccccccc");
			e.printStackTrace();
			
		}
		
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
