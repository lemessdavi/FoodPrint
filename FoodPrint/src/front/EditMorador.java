package front;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import residencia.Residencia;
import usuario.Admin;
import usuario.Dieta;
import usuario.Morador;
import usuario.Transporte;
import usuario.Usuario;

public class EditMorador extends JFrame {

	private JPanel contentPane;
	private JTextField fieldUsuarioNome;
	private JTextField fieldUsuarioIdade;
	private JTextField textFieldTransporteParticular;
	private JTextField textFieldTransportePublico;
	public static DefaultComboBoxModel modeloBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditMorador(Usuario usuario) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		fieldUsuarioNome = new JTextField();
		fieldUsuarioNome.setColumns(10);
		fieldUsuarioNome.setBounds(30, 63, 185, 43);
		contentPane.add(fieldUsuarioNome);
		fieldUsuarioNome.setText(usuario.getNome());
		
		JLabel labelUsuarioNome = new JLabel("Nome");
		labelUsuarioNome.setBounds(30, 47, 61, 16);
		contentPane.add(labelUsuarioNome);
		
		fieldUsuarioIdade = new JTextField();
		fieldUsuarioIdade.setColumns(10);
		fieldUsuarioIdade.setBounds(260, 63, 89, 43);
		contentPane.add(fieldUsuarioIdade);
		fieldUsuarioIdade.setText(String.valueOf(usuario.getIdade()));
		
		JLabel labelUsuarioIdade = new JLabel("Idade");
		labelUsuarioIdade.setBounds(260, 47, 61, 16);
		contentPane.add(labelUsuarioIdade);
		
		
		
		
		
		//Dieta e Procedencia
		
		JLabel labelOpcoesDieta = new JLabel("Quais das opções abaixo melhor caracteriza sua dieta?");
		labelOpcoesDieta.setBounds(30, 177, 354, 20);
		contentPane.add(labelOpcoesDieta);
	
		String[] opcoesDieta = { "Vegano", "Vegetariano", "Alguns Dias da Semana", "Praticamente todos os dias"};
		String[] opcoesProcedenciaAlimentos= { "Somente comida fresca, produzida localmente.", "Um balanco entre comida fresca e industrializada.", "Apenas comida industrializada."};
		
		JComboBox comboBoxOpcoesDieta = new JComboBox(opcoesDieta);
		comboBoxOpcoesDieta.setBounds(30, 216, 201, 27);
		contentPane.add(comboBoxOpcoesDieta);
		comboBoxOpcoesDieta.setSelectedItem(usuario.getDieta().getDieta());
		
		JLabel labelOpcoesProcedencia = new JLabel("Quais das opções abaixo melhor caracteriza a procedencia de seus alimentos?");
		labelOpcoesProcedencia.setBounds(30, 272, 528, 16);
		contentPane.add(labelOpcoesProcedencia);

		
		JComboBox comboBoxOpcoesProcedenciaAlimentos = new JComboBox(opcoesProcedenciaAlimentos);
		comboBoxOpcoesProcedenciaAlimentos.setBounds(30, 309, 377, 27);
		contentPane.add(comboBoxOpcoesProcedenciaAlimentos);
		comboBoxOpcoesProcedenciaAlimentos.setSelectedItem(usuario.getDieta().getProcedenciaAlimentos());
		
		
		JLabel labelDieta = new JLabel("Fale um pouco sobre sua Dieta:");
		labelDieta.setBounds(30, 140, 354, 20);
		contentPane.add(labelDieta);
		
		JLabel lblFaleUmPoucoTransporte = new JLabel("Fale um pouco sobre seu Transporte");
		lblFaleUmPoucoTransporte.setBounds(611, 63, 354, 20);
		contentPane.add(lblFaleUmPoucoTransporte);
		
		JLabel lblEmMdiaQuantos = new JLabel("Em média, quantos kilometros por ano você anda com seu carro particular?");
		lblEmMdiaQuantos.setBounds(611, 102, 492, 20);
		contentPane.add(lblEmMdiaQuantos);
		
		textFieldTransporteParticular = new JTextField();
		textFieldTransporteParticular.setColumns(10);
		textFieldTransporteParticular.setBounds(611, 138, 89, 43);
		contentPane.add(textFieldTransporteParticular);
		textFieldTransporteParticular.setText(String.valueOf(usuario.getTransporte().getVeiculoPessoal()/ 0.621371));
		
		JLabel lblCasoNoTenha = new JLabel("Caso não tenha carro, bote 0.");
		lblCasoNoTenha.setBounds(712, 146, 354, 20);
		contentPane.add(lblCasoNoTenha);
		
		textFieldTransportePublico = new JTextField();
		textFieldTransportePublico.setColumns(10);
		textFieldTransportePublico.setBounds(611, 232, 89, 43);
		contentPane.add(textFieldTransportePublico);
		textFieldTransportePublico.setText(String.valueOf(usuario.getTransporte().getTransportePublico()));
		
		JLabel lblEmMdiaQuantos_2 = new JLabel("Em média, quantos kilometros por ano você anda por transporte público?");
		lblEmMdiaQuantos_2.setBounds(611, 204, 492, 20);
		contentPane.add(lblEmMdiaQuantos_2);
		
		JLabel lblVoos = new JLabel("Qual das opções melhor caracteriza os seus voôs?");
		lblVoos.setBounds(611, 301, 337, 20);
		contentPane.add(lblVoos);

		
		String[] opcoesVoos = { "Nenhum Voo por Ano", "Apenas voos curtos, dentro do próprio estado", "Voos mais longos, dentro do meu país", "Distancias intercontinentais, para outros países"};
		
		JComboBox comboBoxVoos = new JComboBox(opcoesVoos);
		comboBoxVoos.setBounds(611, 333, 201, 27);
		contentPane.add(comboBoxVoos);
		comboBoxVoos.setSelectedItem(usuario.getTransporte().getVoos());
		
		JButton btnEditUsuario = new JButton("Editar Usuário");
		btnEditUsuario.setBounds(913, 617, 223, 29);
		contentPane.add(btnEditUsuario);
		
		btnEditUsuario.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	String nome = fieldUsuarioNome.getText();
		    	int idade = Integer.parseInt(fieldUsuarioIdade.getText());	
		    	
		    	String dietaSelecionada = String.valueOf(comboBoxOpcoesDieta.getSelectedItem());
		    	String procedencia = String.valueOf(comboBoxOpcoesProcedenciaAlimentos.getSelectedItem());
		    	
		    	Dieta dieta = new Dieta(dietaSelecionada, procedencia);
		    	
		    	int transporteParicular = Integer.parseInt(textFieldTransporteParticular.getText());
		    	int transportePublico = Integer.parseInt(textFieldTransportePublico.getText());
		    	String voos = String.valueOf(comboBoxVoos.getSelectedItem());
		    	
		    	Transporte transporte = new Transporte(transporteParicular, transportePublico, voos);
		    	
		   
		    	usuario.editUsuario(nome, idade, transporte, dieta);
		    	
		    	 
		    	
		    	 
		    	 
		    	
		    }
		});
	}

}
