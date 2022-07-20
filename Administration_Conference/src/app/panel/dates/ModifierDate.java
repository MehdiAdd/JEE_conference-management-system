package app.panel.dates;

import javax.swing.JPanel;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import session.SessionRemote;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModifierDate extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldId;
	
	
	public ModifierDate() {
		setBackground(Color.WHITE);
		setLayout(null);
	
		JLabel lblModifierUneDate = new JLabel("Modifier Une Date ");
		lblModifierUneDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblModifierUneDate.setBounds(12, 0, 243, 41);
		add(lblModifierUneDate);
		
		JLabel lblNomDvnement = new JLabel("Nom d'\u00E9v\u00E8nement :");
		lblNomDvnement.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblNomDvnement.setBounds(89, 184, 191, 66);
		add(lblNomDvnement);
		
		JLabel lblDate = new JLabel("Date                   :");
		lblDate.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblDate.setBounds(89, 260, 181, 66);
		add(lblDate);
		
		textField = new JTextField();
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(290, 274, 260, 36);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(290, 196, 260, 36);
		add(textField_1);
		
		Button buttonModifier = new Button("Modifier");
	
		buttonModifier.setForeground(Color.WHITE);
		buttonModifier.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonModifier.setBackground(new Color(30, 144, 255));
		buttonModifier.setBounds(311, 459, 100, 35);
		add(buttonModifier);
		
		Button buttonbackToTable = new Button("Retour");
		buttonbackToTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		buttonbackToTable.setForeground(Color.WHITE);
		buttonbackToTable.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonbackToTable.setBackground(new Color(30, 144, 255));
		buttonbackToTable.setBounds(451, 459, 100, 35);
		add(buttonbackToTable);
		
		textFieldId = new JTextField();
		textFieldId.setVisible(false);
		textFieldId.setBounds(295, 85, 116, 22);
		add(textFieldId);
		textFieldId.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 701, 41);
		add(panel);
		buttonModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				try {
					InitialContext ctx=new InitialContext();
				    String appName = "EAR_Conference";
				    String moduleName = "Ejb_Conference";
				    String distinctName = "";
				    String beanName = "SI";
				    String interfaceFullName = SessionRemote.class.getName();
				    final String jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceFullName;
					SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
				    proxy.modifierDate(Integer.parseInt(textFieldId.getText()), textField.getText(), textField_1.getText());
				   
				    JOptionPane.showMessageDialog(buttonModifier, "la date est bien modifiée","", JOptionPane.INFORMATION_MESSAGE);
				} catch (NamingException e) {
					System.out.println("cccccccccccccccaaaaaaaaaaaa");
					e.printStackTrace();
				}
			}
		});

	}
	public void setTextField(String mot) {
		textField.setText(mot);
	}
	public void setTextField1(String mot) {
		textField_1.setText(mot);
	}
	public void setTextFieldId(String mot) {
		textFieldId.setText(mot);
		
	}
}
