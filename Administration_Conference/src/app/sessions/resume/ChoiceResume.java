package app.sessions.resume;

import javax.swing.JPanel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoiceResume extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceResume() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		NV_Resume resume=new NV_Resume();
		
		resume.setBounds(0, 0, 701, 643);
		add(resume);
		resume.setVisible(false);
		Resume_Accepte resume_accepte=new Resume_Accepte();
		resume_accepte.setBounds(0, 0, 701, 643);
		add(resume_accepte);
		resume_accepte.setVisible(false);
		Button buttonNvResume = new Button("Les nouvaux r\u00E9sum\u00E9s ");
	
		buttonNvResume.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				resume.setVisible(true);
			}
		});
	
		buttonNvResume.setForeground(new Color(255, 255, 255));
		buttonNvResume.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonNvResume.setBackground(new Color(0, 191, 255));
		buttonNvResume.setBounds(155, 199, 313, 57);
		add(buttonNvResume);
		
		Button buttonResumeAccepte = new Button("Les r\u00E9sum\u00E9s accept\u00E9s");
		buttonResumeAccepte.setForeground(Color.WHITE);
		buttonResumeAccepte.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		buttonResumeAccepte.setBackground(new Color(0, 191, 255));
		buttonResumeAccepte.setBounds(155, 298, 313, 57);
		add(buttonResumeAccepte);
		buttonResumeAccepte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				resume_accepte.setVisible(true);
			}
		});
		


}
}

