package app.panel.Presence;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class ChoicePresence extends JPanel {
	public ChoicePresence(){
	setBackground(new Color(255, 255, 255));
	setLayout(null);
	Button buttonAuditeurs = new Button("Liste des auditeurs");
	PresenceAuditeurs pa=new PresenceAuditeurs();
	pa.setBounds(0, 0, 701, 643);
	add(pa);
	pa.setVisible(false);
	PresenceParticipants pp=new PresenceParticipants();
	pp.setBounds(0, 0, 701, 643);
	add(pp);
	pp.setVisible(false);
	PresenceComites pc=new PresenceComites();
	pc.setBounds(0, 0, 701, 643);
	add(pc);
	pc.setVisible(false);
	PresenceSpeakers ps=new PresenceSpeakers();
	ps.setBounds(0, 0, 701, 643);
	add(ps);
	ps.setVisible(false);
	buttonAuditeurs.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			pa.setVisible(true);
			pp.setVisible(false);
			pc.setVisible(false);
			ps.setVisible(false);
			
		}
	});

	buttonAuditeurs.setForeground(new Color(255, 255, 255));
	buttonAuditeurs.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
	buttonAuditeurs.setBackground(new Color(0, 191, 255));
	buttonAuditeurs.setBounds(175, 154, 313, 57);
	add(buttonAuditeurs);
	
	Button buttonparticipants = new Button("Liste des participants");
	buttonparticipants.setForeground(Color.WHITE);
	buttonparticipants.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
	buttonparticipants.setBackground(new Color(0, 191, 255));
	buttonparticipants.setBounds(175, 249, 313, 57);
	add(buttonparticipants);
	
	Button buttoncomites = new Button("Liste des comit\u00E9s");
	buttoncomites.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			pc.setVisible(true);
			pa.setVisible(false);
			pp.setVisible(false);
			ps.setVisible(false);
		}
	});
	buttoncomites.setForeground(Color.WHITE);
	buttoncomites.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
	buttoncomites.setBackground(new Color(0, 191, 255));
	buttoncomites.setBounds(175, 438, 313, 57);
	add(buttoncomites);
	
	Button buttonSpeakers = new Button("Liste des speakers");
	buttonSpeakers.setForeground(Color.WHITE);
	buttonSpeakers.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
	buttonSpeakers.setBackground(new Color(0, 191, 255));
	buttonSpeakers.setBounds(175, 344, 313, 57);
	add(buttonSpeakers);
	buttonSpeakers.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			ps.setVisible(true);
			pa.setVisible(false);
			pp.setVisible(false);
			pc.setVisible(false);
		}
	});
	buttonparticipants.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			pp.setVisible(true);
			pa.setVisible(false);
			pc.setVisible(false);
			ps.setVisible(false);
			
		}
	});
	}
}
