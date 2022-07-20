package app.panel.dates;

import javax.swing.JPanel;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import ejb.entity.Dates;
import session.SessionRemote;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AjouterDate extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Create the panel.
	 */
	public AjouterDate() {
		
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblAjouterUneDate = new JLabel("Ajouter Une Date ");
		lblAjouterUneDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblAjouterUneDate.setBounds(12, 0, 243, 41);
		add(lblAjouterUneDate);
		
		JLabel lblNomDvnement = new JLabel("Nom d'\u00E9v\u00E8nement :");
		lblNomDvnement.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblNomDvnement.setBounds(70, 188, 191, 66);
		add(lblNomDvnement);
		
		JLabel lblDate = new JLabel("Date                   :");
		lblDate.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblDate.setBounds(70, 264, 181, 66);
		add(lblDate);
		
		textField = new JTextField();
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textField.setBounds(271, 200, 260, 36);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textField_1.setBounds(271, 278, 260, 36);
		add(textField_1);
		textField_1.setColumns(10);
		
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
		buttonbackToTable.setBounds(432, 463, 100, 35);
		add(buttonbackToTable);
		
		Button buttonAjouter = new Button("Ajouter");
		buttonAjouter.addMouseListener(new MouseAdapter() {
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
					SessionRemote proxy=(SessionRemote) ctx.lookup(jndi);
					Dates date=new Dates(textField_1.getText(), textField.getText());
				    proxy.ajouterDate(date);
				    
				    
				    JOptionPane.showMessageDialog(buttonAjouter, "la date est bien ajoutée","", JOptionPane.INFORMATION_MESSAGE);
				
				} catch (NamingException e1) {
					System.out.println("cccccccccccccccaaaaaaaaaaaa");
					e1.printStackTrace();
				}
			}
		});
		buttonAjouter.setForeground(Color.WHITE);
		buttonAjouter.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		buttonAjouter.setBackground(new Color(30, 144, 255));
		buttonAjouter.setBounds(292, 463, 100, 35);
		add(buttonAjouter);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 701, 41);
		add(panel);

	}
}
