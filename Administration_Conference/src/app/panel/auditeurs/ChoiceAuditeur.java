package app.panel.auditeurs;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;



public class ChoiceAuditeur extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceAuditeur() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		AuditeursAverfier auditeursAverfier=new AuditeursAverfier();
		
		auditeursAverfier.setBounds(0, 0, 701, 643);
		add(auditeursAverfier);
		auditeursAverfier.setVisible(false);
		AuditeursVerfies auditeursVerfies=new AuditeursVerfies();
		auditeursVerfies.setBounds(0, 0, 701, 643);
		add(auditeursVerfies);
		auditeursVerfies.setVisible(false);
	AuditeursApayer auditeursApayer=new AuditeursApayer();
		
	auditeursApayer.setBounds(0, 0, 701, 643);
		add(auditeursApayer);
		auditeursApayer.setVisible(false);
		Button buttonNvResume = new Button("Les auditeurs \u00E0 verifier ");
	
		buttonNvResume.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				auditeursAverfier.setVisible(true);
			}
		});
	
		buttonNvResume.setForeground(new Color(255, 255, 255));
		buttonNvResume.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonNvResume.setBackground(new Color(0, 191, 255));
		buttonNvResume.setBounds(174, 173, 313, 57);
		add(buttonNvResume);
		
		Button buttonResumeAccepte = new Button("Les auditeurs verifi\u00E9s");
		buttonResumeAccepte.setForeground(Color.WHITE);
		buttonResumeAccepte.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonResumeAccepte.setBackground(new Color(0, 191, 255));
		buttonResumeAccepte.setBounds(174, 268, 313, 57);
		add(buttonResumeAccepte);
		
		Button buttonApayer = new Button("Les auditeurs \u00E0 payer ");
		buttonApayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				auditeursApayer.setVisible(true);
			}
		});
		buttonApayer.setForeground(Color.WHITE);
		buttonApayer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonApayer.setBackground(new Color(0, 191, 255));
		buttonApayer.setBounds(174, 363, 313, 57);
		add(buttonApayer);
		buttonResumeAccepte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				auditeursVerfies.setVisible(true);
				
			}
		});
	}
}
