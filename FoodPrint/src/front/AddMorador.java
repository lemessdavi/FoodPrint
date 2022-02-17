package front;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import residencia.Residencia;
import usuario.Admin;
import usuario.Dieta;
import usuario.Morador;
import usuario.Transporte;
import usuario.Usuario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class AddMorador extends JFrame {

	private JPanel contentPane;
	private JTextField fieldUsuarioNome;
	private JTextField fieldUsuarioIdade;
	private JTextField textFieldTransporteParticular;
	private JTextField textFieldTransportePublico;
	private JPasswordField passwordField;
	public static DefaultComboBoxModel modeloBox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMorador frame = new AddMorador();
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
	public AddMorador() {
		
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
		
		JLabel labelSenha = new JLabel("Digite sua Senha:");
		labelSenha.setBounds(30, 165, 128, 16);
		contentPane.add(labelSenha);
		labelSenha.hide();
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(30, 181, 233, 43);
    	contentPane.add(passwordField);
    	passwordField.hide();
		
		
		checkboxAdmin.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		        	passwordField.show();
		        	labelSenha.show();
		        	System.out.println("ä");
		        } else {//checkbox has been deselected
		        	passwordField.hide();
		        	labelSenha.hide();
		        };
		    }
		});
		
		
		
		
		
		//Dieta e Procedencia
		
		JLabel labelOpcoesDieta = new JLabel("Quais das opções abaixo melhor caracteriza sua dieta em relação ao consumo de carne?");
		labelOpcoesDieta.setBounds(30, 342, 558, 20);
		contentPane.add(labelOpcoesDieta);
	
		String[] opcoesDieta = { "Vegano", "Vegetariano", "Alguns Dias da Semana", "Praticamente todos os dias"};
		String[] opcoesProcedenciaAlimentos= { "Somente comida fresca, produzida localmente.", "Um balanco entre comida fresca e industrializada.", "Apenas comida industrializada."};
		
		JComboBox comboBoxOpcoesDieta = new JComboBox(opcoesDieta);
		comboBoxOpcoesDieta.setBounds(30, 381, 201, 27);
		contentPane.add(comboBoxOpcoesDieta);
		
		JLabel labelOpcoesProcedencia = new JLabel("Quais das opções abaixo melhor caracteriza a procedencia de seus alimentos?");
		labelOpcoesProcedencia.setBounds(30, 437, 528, 16);
		contentPane.add(labelOpcoesProcedencia);

		
		JComboBox comboBoxOpcoesProcedenciaAlimentos = new JComboBox(opcoesProcedenciaAlimentos);
		comboBoxOpcoesProcedenciaAlimentos.setBounds(30, 474, 377, 27);
		contentPane.add(comboBoxOpcoesProcedenciaAlimentos);
		
		JLabel labelSelecionarResidencia = new JLabel("Seleciona a sua Residencia:");
		labelSelecionarResidencia.setBounds(516, 47, 177, 16);
		contentPane.add(labelSelecionarResidencia);
		
		modeloBox = new DefaultComboBoxModel(Home.modelResidencia.toArray());
		
		JComboBox comboBoxResidencias = new JComboBox(modeloBox);
		comboBoxResidencias.setBounds(516, 72, 201, 27);
		contentPane.add(comboBoxResidencias);
		
		
		JButton btnAddNovaResidencia = new JButton("Adicionar Nova Residencia");
		btnAddNovaResidencia.setBounds(735, 71, 223, 29);
		contentPane.add(btnAddNovaResidencia);

		btnAddNovaResidencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddResidencia frame = new AddResidencia();
				frame.setVisible(true);
			}
			});
		
		JLabel labelDieta = new JLabel("Fale um pouco sobre sua Dieta:");
		labelDieta.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		labelDieta.setBounds(30, 305, 354, 20);
		contentPane.add(labelDieta);
		
		JLabel lblFaleUmPoucoTransporte = new JLabel("Fale um pouco sobre seu Transporte");
		lblFaleUmPoucoTransporte.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblFaleUmPoucoTransporte.setBounds(666, 204, 354, 20);
		contentPane.add(lblFaleUmPoucoTransporte);
		
		JLabel lblEmMdiaQuantos = new JLabel("Em média, quantos kilometros por ano você anda com seu carro particular?");
		lblEmMdiaQuantos.setBounds(666, 243, 492, 20);
		contentPane.add(lblEmMdiaQuantos);
		
		textFieldTransporteParticular = new JTextField();
		textFieldTransporteParticular.setColumns(10);
		textFieldTransporteParticular.setBounds(666, 279, 89, 43);
		contentPane.add(textFieldTransporteParticular);
		
		JLabel lblCasoNoTenha = new JLabel("Caso não tenha carro, bote 0.");
		lblCasoNoTenha.setBounds(767, 287, 354, 20);
		contentPane.add(lblCasoNoTenha);
		
		textFieldTransportePublico = new JTextField();
		textFieldTransportePublico.setColumns(10);
		textFieldTransportePublico.setBounds(666, 373, 89, 43);
		contentPane.add(textFieldTransportePublico);
		
		JLabel lblEmMdiaQuantos_2 = new JLabel("Em média, quantos kilometros por ano você anda por transporte público?");
		lblEmMdiaQuantos_2.setBounds(666, 345, 492, 20);
		contentPane.add(lblEmMdiaQuantos_2);
		
		JLabel lblVoos = new JLabel("Qual das opções melhor caracteriza os seus voôs?");
		lblVoos.setBounds(666, 442, 337, 20);
		contentPane.add(lblVoos);
		
		String[] opcoesVoos = { "Nenhum Voo por Ano", "Apenas voos curtos, dentro do próprio estado", "Voos mais longos, dentro do meu país", "Distancias intercontinentais, para outros países"};
		
		JComboBox comboBoxVoos = new JComboBox(opcoesVoos);
		comboBoxVoos.setBounds(666, 474, 201, 27);
		contentPane.add(comboBoxVoos);
		
		JButton btnAddUsuario = new JButton("Adicionar Usuário");
		btnAddUsuario.setBounds(913, 617, 223, 29);
		contentPane.add(btnAddUsuario);
		
	
		
		
		btnAddUsuario.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	String nome = fieldUsuarioNome.getText();
		    	int idade = 0;
		    	boolean idadeNull;
		    	
		    	try {
		    	idade = Integer.parseInt(fieldUsuarioIdade.getText());	
		    	idadeNull = false;
		    	} catch(NumberFormatException ex){
		    		idadeNull = true;
		    	}
		    	String dietaSelecionada = String.valueOf(comboBoxOpcoesDieta.getSelectedItem());
		    	String procedencia = String.valueOf(comboBoxOpcoesProcedenciaAlimentos.getSelectedItem());
		    	
		    	Dieta dieta = new Dieta(dietaSelecionada, procedencia);
		    	
		    	int transporteParicular = Integer.parseInt(textFieldTransporteParticular.getText());
		    	int transportePublico = Integer.parseInt(textFieldTransportePublico.getText());
		    	String voos = String.valueOf(comboBoxVoos.getSelectedItem());
		    	
		    	Transporte transporte = new Transporte(transporteParicular, transportePublico, voos);
		    	
		    	Residencia residencia = (Residencia) comboBoxResidencias.getSelectedItem();
		   
		    	System.out.println(residencia.getPontosResidencia());
		    	System.out.println(residencia);
		    	
		    	Usuario usuario;
		    	if(!idadeNull) {	
		    	if(checkboxAdmin.isSelected()) {
		    		char[] senha = passwordField.getPassword();
		    		usuario = new Admin(nome, idade, transporte, dieta ,residencia, senha);
		    		residencia.setAdmin((Admin) usuario);
		    	} else {
		    		usuario = new Morador(nome, idade, transporte, dieta, residencia);
		    	}
		    	}else {
		    		if(checkboxAdmin.isSelected()) {
			    		char[] senha = passwordField.getPassword();
			    		usuario = new Admin(nome, transporte, dieta ,residencia, senha);
			    		residencia.setAdmin((Admin) usuario);
			    	} else {
			    		usuario = new Morador(nome, transporte, dieta, residencia);
			    	}
		    	}
		    	
		    	 Home.repo.listaUsuarios.add(usuario);
		    	 Home.modelUsuario.addElement(usuario);
		    	
		    	 
		    	 System.out.println(nome);
		    	 System.out.println(residencia.getNomeMoradia());
		    	 
		    	 System.out.println(usuario.getPontosTotais());
		    	 
		    	dispose();
		    	
		    	 
		    	
		    }
		});
		
		
		
		
		//Dieta dieta = new Dieta(comboBoxOpcoesDieta., comboBoxOpcoesProcedenciaAlimentos);
		
		
	}
}
