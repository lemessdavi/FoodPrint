package front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import repositorio.Repositorio;
import residencia.Residencia;
import usuario.Usuario;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;
	public static Repositorio repo = new Repositorio();
	private JButton btnAddResidencia;
	private JButton btnAddUsuario;
	public  JList<Usuario> listUsuario;
	public  JList<Residencia> listResidencia;
	private JButton btnAtualizar;;
	public static DefaultListModel modelResidencia;
	public static DefaultListModel modelUsuario;
	private JLabel lblResidenciasCadastradas;
	private JLabel lblUsuariosCadastradas;
	private JLabel lableMyFoodPrint;
	private JButton btnEditarUsuario;
	private JButton btnEditarResidencia;

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
		
	
		
		btnAddResidencia = new JButton("Adicionar Residencia");
		btnAddResidencia.setBounds(60, 615, 175, 29);
		contentPane.add(btnAddResidencia);
		
		btnAddResidencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddResidencia frame = new AddResidencia();
				frame.setVisible(true);
				
			}
		});
		
		
		
		btnAddUsuario = new JButton("Adicionar Usuario");
		btnAddUsuario.setBounds(501, 615, 175, 29);
		contentPane.add(btnAddUsuario);
		
		btnAddUsuario.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				AddMorador frame = new AddMorador();
				frame.setVisible(true);
			}
		});
		
		modelResidencia = new DefaultListModel();
		modelResidencia.addAll(repo.listaResidenicas);
		
		
		listResidencia = new JList(modelResidencia);
		listResidencia.setBounds(60, 200, 371, 403);
		contentPane.add(listResidencia);
		
		
		modelUsuario = new DefaultListModel();
		modelUsuario.addAll(repo.listaUsuarios);
		
		listUsuario = new JList(modelUsuario);
		listUsuario.setBounds(501, 200, 371, 403);
		contentPane.add(listUsuario);
		
		lblResidenciasCadastradas = new JLabel("Residencias Cadastradas:");
		lblResidenciasCadastradas.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblResidenciasCadastradas.setBounds(113, 172, 278, 16);
		contentPane.add(lblResidenciasCadastradas);
		
		lblUsuariosCadastradas = new JLabel("Usuarios Cadastrados:");
		lblUsuariosCadastradas.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblUsuariosCadastradas.setBounds(577, 172, 220, 16);
		contentPane.add(lblUsuariosCadastradas);
		
		lableMyFoodPrint = new JLabel("MyFootPrint");
		lableMyFoodPrint.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		lableMyFoodPrint.setBounds(455, 32, 326, 75);
		contentPane.add(lableMyFoodPrint);
		
		btnEditarUsuario = new JButton("Editar Usuario");
		btnEditarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditarUsuario.setBounds(697, 615, 175, 29);
		contentPane.add(btnEditarUsuario);
		
		
		
		btnEditarResidencia = new JButton("Editar Residencia");
		btnEditarResidencia.setBounds(256, 615, 175, 29);
		contentPane.add(btnEditarResidencia);
		
		btnEditarResidencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Residencia selecionada = listResidencia.getSelectedValue();
				PerguntaSenha telaSenha = new PerguntaSenha();
				telaSenha.setVisible(true);
				
				telaSenha.btnEntrar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(selecionada.getAdmin().autenticaSenha(telaSenha.getSenha())) {
							  int index = listResidencia.getSelectedIndex();
					          Residencia selecionada = (Residencia) listResidencia.getSelectedValue();
					          EditResidencia frameEditResidencia = new EditResidencia(selecionada);
					          frameEditResidencia.setVisible(true);
						} else {
							System.out.println("senha incorreta");
						}
					}

				});

	           
	        }
		});
		
		// if(listResidencia.getSelectedValue().getAdmin().autenticaSenha(senha.getSelectedText()));
		
		
	}
}
