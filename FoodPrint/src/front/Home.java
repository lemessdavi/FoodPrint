package front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField fieldUsuarioNome;
	private JTextField fieldUsuarioIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		fieldUsuarioNome = new JTextField();
		fieldUsuarioNome.setColumns(10);
		fieldUsuarioNome.setBounds(30, 63, 185, 43);
		contentPane.add(fieldUsuarioNome);
		
		JLabel labelUsuarioNome = new JLabel("Nome");
		labelUsuarioNome.setBounds(30, 47, 61, 16);
		contentPane.add(labelUsuarioNome);
		
		fieldUsuarioIdade = new JTextField();
		fieldUsuarioIdade.setColumns(10);
		fieldUsuarioIdade.setBounds(260, 63, 89, 43);
		contentPane.add(fieldUsuarioIdade);
		
		JLabel labelUsuarioIdade = new JLabel("Idade");
		labelUsuarioIdade.setBounds(260, 47, 61, 16);
		contentPane.add(labelUsuarioIdade);
		
		JCheckBox checkboxAdmin = new JCheckBox("Administrador?");
		checkboxAdmin.setBounds(30, 118, 128, 23);
		contentPane.add(checkboxAdmin);
		
		JLabel labelOpcoesDieta = new JLabel("Quais das opções abaixo melho carateriza sua dieta?");
		labelOpcoesDieta.setBounds(30, 193, 354, 16);
		contentPane.add(labelOpcoesDieta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(30, 259, 201, 27);
		contentPane.add(comboBox);
		
		
	}
}
