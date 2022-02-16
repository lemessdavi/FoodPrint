package front;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import residencia.Residencia;

public class PerguntaSenha extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	JButton btnEntrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerguntaSenha frame = new PerguntaSenha();
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
	public PerguntaSenha() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelDigiteSenha = new JLabel("Digite a Senha definida pelo Administrador da Residencia:");
		labelDigiteSenha.setBounds(34, 62, 438, 16);
		contentPane.add(labelDigiteSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(57, 104, 314, 45);
		contentPane.add(passwordField);
		
		
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(161, 203, 117, 29);
		contentPane.add(btnEntrar);
		
	}
	
	public String getSenha() {
		return passwordField.getSelectedText();
	}

	

}
