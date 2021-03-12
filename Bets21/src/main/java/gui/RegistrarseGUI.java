package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import businessLogic.BLFacade;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class RegistrarseGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarseGUI frame = new RegistrarseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrarseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(144, 39, 148, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 93, 148, 32);
		contentPane.add(passwordField);
		
		JButton btnRegistrate = new JButton("Registrate");
		btnRegistrate.setBounds(171, 151, 89, 23);
		btnRegistrate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				String l = textField.getText();
				String p = new String(passwordField.getPassword());
				
				BLFacade facade = MainGUI.getBusinessLogic();
				if (facade.registrar(l, p)) {
					JFrame b = new FindQuestionsGUI();

					b.setVisible(true);
				}else {
					lblError.setVisible(true);
				}
			}
		});
		contentPane.add(btnRegistrate);
		
		lblError = new JLabel("ERROR");
		lblError.setBounds(191, 185, 46, 14);
		lblError.setVisible(false);
		contentPane.add(lblError);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(143, 21, 73, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(144, 80, 93, 14);
		contentPane.add(lblContrasea);
		
	}
}
