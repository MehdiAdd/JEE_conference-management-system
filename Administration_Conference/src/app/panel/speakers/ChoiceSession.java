package app.panel.speakers;

import javax.swing.JPanel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoiceSession extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceSession() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		NV_Session resume=new NV_Session();
		
		resume.setBounds(0, 0, 701, 601);
		add(resume);
		resume.setVisible(false);
		SessionAccepte resume_accepte=new SessionAccepte();
		resume_accepte.setBounds(0, 0, 701, 601);
		add(resume_accepte);
		resume_accepte.setVisible(false);
		
		ParticipantAccepteParAdmin participantAccepte=new ParticipantAccepteParAdmin();
		participantAccepte.setBounds(0, 0, 701, 601);
		add(participantAccepte);
		participantAccepte.setVisible(false);
		
		ParticipantNonAccepteParAdmin participantNonAccepte=new ParticipantNonAccepteParAdmin();
		participantNonAccepte.setBounds(0, 0, 701, 601);
		add(participantNonAccepte);
		participantNonAccepte.setVisible(false);
		
		Button buttonNvSession = new Button("Les nouvaux propositions  des sessions");
	
		buttonNvSession.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				resume.setVisible(true);
				participantAccepte.setVisible(false);
				participantNonAccepte.setVisible(false);
				resume_accepte.setVisible(false);
			}
		});
	
		buttonNvSession.setForeground(new Color(255, 255, 255));
		buttonNvSession.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonNvSession.setBackground(new Color(0, 191, 255));
		buttonNvSession.setBounds(187, 152, 335, 57);
		add(buttonNvSession);
		
		Button buttonSessionAccepte = new Button("Les sessions accept\u00E9es");
		buttonSessionAccepte.setForeground(Color.WHITE);
		buttonSessionAccepte.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonSessionAccepte.setBackground(new Color(0, 191, 255));
		buttonSessionAccepte.setBounds(187, 239, 335, 57);
		add(buttonSessionAccepte);
		
		Button buttonParticipantsAccepte = new Button("Les r\u00E9sum\u00E9s acc\u00E9pt\u00E9s");
		buttonParticipantsAccepte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resume.setVisible(false);
				participantAccepte.setVisible(true);
				participantNonAccepte.setVisible(false);
				resume_accepte.setVisible(false);
			}
		});
		buttonParticipantsAccepte.setForeground(Color.WHITE);
		buttonParticipantsAccepte.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonParticipantsAccepte.setBackground(new Color(0, 191, 255));
		buttonParticipantsAccepte.setBounds(187, 410, 335, 57);
		add(buttonParticipantsAccepte);
		
		Button buttonParticipantsNonAccepte = new Button("Les r\u00E9sum\u00E9s non acc\u00E9pt\u00E9s");
		buttonParticipantsNonAccepte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resume.setVisible(false);
				participantAccepte.setVisible(false);
				participantNonAccepte.setVisible(true);
				resume_accepte.setVisible(false);
			}
		});
		buttonParticipantsNonAccepte.setForeground(Color.WHITE);
		buttonParticipantsNonAccepte.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonParticipantsNonAccepte.setBackground(new Color(0, 191, 255));
		buttonParticipantsNonAccepte.setBounds(187, 323, 335, 57);
		add(buttonParticipantsNonAccepte);
		buttonSessionAccepte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				resume_accepte.setVisible(true);
				resume.setVisible(false);
				participantAccepte.setVisible(false);
				participantNonAccepte.setVisible(false);
				
			}
		});
		


}
}

