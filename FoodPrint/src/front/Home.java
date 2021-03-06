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
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

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
	private JButton btnRemoverUsuario;
	private JButton btnVerDetalhes;
	private JTextPane textPane;

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
		btnAddResidencia.setBounds(43, 615, 175, 29);
		contentPane.add(btnAddResidencia);
		
		btnAddResidencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddResidencia frame = new AddResidencia();
				frame.setVisible(true);
				
				
			}
		});
		
		
		
		btnAddUsuario = new JButton("Adicionar Usuario");
		btnAddUsuario.setBounds(442, 615, 175, 29);
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
		listResidencia.setBounds(60, 200, 326, 403);
		contentPane.add(listResidencia);
		
		
		modelUsuario = new DefaultListModel();
		modelUsuario.addAll(repo.listaUsuarios);
		
		listUsuario = new JList(modelUsuario);
		listUsuario.setBounds(444, 200, 371, 403);
		contentPane.add(listUsuario);
		
		lblResidenciasCadastradas = new JLabel("Residencias Cadastradas:");
		lblResidenciasCadastradas.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblResidenciasCadastradas.setBounds(60, 172, 326, 16);
		contentPane.add(lblResidenciasCadastradas);
		
		lblUsuariosCadastradas = new JLabel("Usuarios Cadastrados:");
		lblUsuariosCadastradas.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblUsuariosCadastradas.setBounds(442, 172, 222, 16);
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
		btnEditarUsuario.setBounds(640, 615, 175, 29);
		contentPane.add(btnEditarUsuario);
		
		btnEditarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		          Usuario selecionado = (Usuario) listUsuario.getSelectedValue();
		          EditMorador frameEditmorador = new EditMorador(selecionado);
		          frameEditmorador.setVisible(true)
		          ;}
		});
		
		
		btnEditarResidencia = new JButton("Editar Residencia");
		btnEditarResidencia.setBounds(230, 615, 175, 29);
		contentPane.add(btnEditarResidencia);
		
		JLabel lblOQueQuer = new JLabel("O que quer dizer meu ??ndice?");
		lblOQueQuer.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblOQueQuer.setBounds(913, 161, 371, 39);
		contentPane.add(lblOQueQuer);
		
		JTextPane txtpnOqueQuerDizer_1 = new JTextPane();
		txtpnOqueQuerDizer_1.setBackground(new Color(238, 238, 238));
		txtpnOqueQuerDizer_1.setToolTipText("");
		txtpnOqueQuerDizer_1.setText("Resumindo, quanto menos, melhor! \n\n\n-> Abaixo de 65 pontos de ??ndice, voc?? est?? mais ajudando o meio-ambiente do que poluindo!\n\n-> Buscar se manter entre 60 e 75 ?? o ideal pra o meio ambiete.\n\n-> A quantidade m??xima estimada* de pontos ?? de 175. \n\n* Por??m, ?? praticamente imposs??vel apenas um ser humano conseguir poluir tanto tendo em vista que um estilo de vida deste seria muito caro.");
		txtpnOqueQuerDizer_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txtpnOqueQuerDizer_1.setEditable(false);
		txtpnOqueQuerDizer_1.setBounds(895, 200, 326, 393);
		contentPane.add(txtpnOqueQuerDizer_1);
		txtpnOqueQuerDizer_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		btnRemoverUsuario = new JButton("Remover Usuario");
		btnRemoverUsuario.setBounds(442, 656, 175, 29);
		contentPane.add(btnRemoverUsuario);
		
		btnVerDetalhes = new JButton("Ver Detalhes");
		btnVerDetalhes.setBounds(640, 656, 175, 29);
		contentPane.add(btnVerDetalhes);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(870, 172, 371, 438);
		contentPane.add(textArea);
		textArea.hide();
		
		
		btnVerDetalhes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		          int selecionadoIndex = listUsuario.getSelectedIndex();
		          Usuario selecionado = (Usuario) listUsuario.getSelectedValue();
		          textArea.removeAll();
		          textArea.setText(selecionado.getNome() + "\n" + "\n" + selecionado.getDieta().toString() +
		        		  "\n" + selecionado.getTransporte().toString()+ "\n"+ "\n" + "Mora em: " + selecionado.getResidencia().toString() + "\n" +
		        		  "Pontos vindos de Residencia: " + selecionado.getResidencia().getPontosResidencia()+ ", onde:"
		        		  + "\n" + "Por conta do n??mero de moradores: " + selecionado.getResidencia().getPontosNumeroMoradores()
		        		  + "\n" + "Por conta do tamanho da residencia: " + selecionado.getResidencia().getPontosNumeroResidencia()
		        		  + "\n" + selecionado.getResidencia().getConsumoAgua().toString() + "\n" + selecionado.getResidencia().getCompras().toString()
		        		  + "\n" + selecionado.getResidencia().getLixo().toString() + "\n" + selecionado.getResidencia().getLixoReciclado().toString());
		          			
		          txtpnOqueQuerDizer_1.hide();
		          lblOQueQuer.hide();
		          textArea.show();
		       
		          
		          ;}
		});
		
		btnRemoverUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		          int selecionadoIndex = listUsuario.getSelectedIndex();
		          Usuario selecionado = (Usuario) listUsuario.getSelectedValue();
		          modelUsuario.removeElement(selecionado);
		          ;}
		});
		
		btnEditarResidencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listResidencia.getSelectedIndex();
		          Residencia selecionada = (Residencia) listResidencia.getSelectedValue();
		          EditResidencia frameEditResidencia = new EditResidencia(selecionada);
		          frameEditResidencia.setVisible(true)
		          ;}
		});
		
		// if(listResidencia.getSelectedValue().getAdmin().autenticaSenha(senha.getSelectedText()));
		
		
	}
}
