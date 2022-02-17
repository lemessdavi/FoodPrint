package front;

import java.awt.BorderLayout;
import repositorio.*;
import residencia.Agua;
import residencia.Compras;
import residencia.Lixo;
import residencia.Reciclado;
import residencia.Residencia;
import usuario.Admin;
import usuario.Usuario;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class AddResidencia extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeMoradia;
	private JTextField textFieldNumeroDeMoradores;
	private JTextField textFieldLavaLouca;
	private JTextField textFieldLavaRoupas;
	private JTextField textFieldComprasPorAno;
	private JTextField textFieldLixoPorSemana;
	ArrayList<JCheckBox> checkBoxReciclados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddResidencia frame = new AddResidencia();
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
	public AddResidencia() {
		 setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel idLabelNome = new JLabel("Nome da Moradia");
		idLabelNome.setBounds(30, 17, 117, 16);
		contentPane.add(idLabelNome);
		
		textFieldNomeMoradia = new JTextField();
		textFieldNomeMoradia.setBounds(30, 36, 222, 41);
		contentPane.add(textFieldNomeMoradia);
		textFieldNomeMoradia.setColumns(10);
		
		textFieldNumeroDeMoradores = new JTextField();
		textFieldNumeroDeMoradores.setColumns(10);
		textFieldNumeroDeMoradores.setBounds(290, 36, 147, 41);
		contentPane.add(textFieldNumeroDeMoradores);
		
		JLabel idLabelNumeroMoradores = new JLabel("Numero de Moradores");
		idLabelNumeroMoradores.setBounds(290, 17, 147, 16);
		contentPane.add(idLabelNumeroMoradores);
		
		JLabel idLabelTipoDeMoradia = new JLabel("Tipo de Moradia");
		idLabelTipoDeMoradia.setBounds(523, 17, 101, 16);
		contentPane.add(idLabelTipoDeMoradia);
		
		String[] opcoesMoradia = {"Apartamento", "Casa Pequena", "Casa Media", "Casa Grande"};
		
		JComboBox comboBox = new JComboBox(opcoesMoradia);
		comboBox.setBounds(523, 44, 162, 27);
		contentPane.add(comboBox);
		
		JLabel idLabelConsumoDeAgua = new JLabel("Consumo de Agua");
		idLabelConsumoDeAgua.setBounds(30, 202, 117, 16);
		contentPane.add(idLabelConsumoDeAgua);
		
		textFieldLavaLouca = new JTextField();
		textFieldLavaLouca.setColumns(10);
		textFieldLavaLouca.setBounds(30, 270, 66, 41);
		contentPane.add(textFieldLavaLouca);
		
		JLabel lbLabelLavaLouca = new JLabel("Quantas vezes por semana é utilizada a Lava Louças? ");
		lbLabelLavaLouca.setBounds(30, 251, 432, 16);
		contentPane.add(lbLabelLavaLouca);
		
		JLabel lblporFavorBote = new JLabel("(por favor, bote 0 se não tiver máquina)");
		lblporFavorBote.setBounds(108, 282, 254, 16);
		contentPane.add(lblporFavorBote);
		
		JLabel lbLabelLavaRoupas = new JLabel("Quantas vezes por semana é utilizada a Lava Roupas? ");
		lbLabelLavaRoupas.setBounds(30, 351, 432, 16);
		contentPane.add(lbLabelLavaRoupas);
		
		textFieldLavaRoupas = new JTextField();
		textFieldLavaRoupas.setColumns(10);
		textFieldLavaRoupas.setBounds(30, 370, 66, 41);
		contentPane.add(textFieldLavaRoupas);
		
		JLabel lblporFavorBote_1 = new JLabel("(por favor, bote 0 se não tiver máquina)");
		lblporFavorBote_1.setBounds(108, 382, 254, 16);
		contentPane.add(lblporFavorBote_1);
		
		textFieldComprasPorAno = new JTextField();
		textFieldComprasPorAno.setColumns(10);
		textFieldComprasPorAno.setBounds(30, 573, 66, 41);
		contentPane.add(textFieldComprasPorAno);
		
		JLabel lbLabelComprasPorAno = new JLabel("Quantas grandes compras são feitas por ano?  (Móveis e Eletrodomésticos).");
		lbLabelComprasPorAno.setBounds(30, 554, 496, 16);
		contentPane.add(lbLabelComprasPorAno);
		
		JLabel idLabelCompras = new JLabel("Compras de Casa");
		idLabelCompras.setBounds(30, 505, 117, 16);
		contentPane.add(idLabelCompras);
		
		JLabel lblDesperdcio = new JLabel("Desperdício");
		lblDesperdcio.setBounds(635, 202, 117, 16);
		contentPane.add(lblDesperdcio);
		
		textFieldLixoPorSemana = new JTextField();
		textFieldLixoPorSemana.setColumns(10);
		textFieldLixoPorSemana.setBounds(635, 270, 66, 41);
		contentPane.add(textFieldLixoPorSemana);
		
		JLabel lbLabelLixosPorSemana = new JLabel("Em média, quantos sacos de lixo são produzidos por semana?");
		lbLabelLixosPorSemana.setBounds(635, 251, 496, 16);
		contentPane.add(lbLabelLixosPorSemana);
		
		
		
		
		JLabel lbLabelReciclagem = new JLabel("Selecione quais grupos voce recicla:");
		lbLabelReciclagem.setBounds(635, 351, 496, 16);
		contentPane.add(lbLabelReciclagem);
		
		checkBoxReciclados =  new ArrayList<JCheckBox>();
		
		JCheckBox chckbxVidro = new JCheckBox("Vidro");
		chckbxVidro.setBounds(624, 378, 128, 23);
		contentPane.add(chckbxVidro);
		checkBoxReciclados.add(chckbxVidro);
		
		JCheckBox chckbxPapel = new JCheckBox("Papel");
		chckbxPapel.setBounds(624, 401, 128, 23);
		contentPane.add(chckbxPapel);
		checkBoxReciclados.add(chckbxPapel);
		
		JCheckBox chckbxPlastico = new JCheckBox("Plástico");
		chckbxPlastico.setBounds(624, 425, 128, 23);
		contentPane.add(chckbxPlastico);
		checkBoxReciclados.add(chckbxPlastico);
		
		JCheckBox chckbxAluminio = new JCheckBox("Aluminio");
		chckbxAluminio.setBounds(775, 425, 128, 23);
		contentPane.add(chckbxAluminio);
		checkBoxReciclados.add(chckbxAluminio);
		
		JCheckBox chckbxFerro = new JCheckBox("Ferro");
		chckbxFerro.setBounds(775, 378, 128, 23);
		contentPane.add(chckbxFerro);
		checkBoxReciclados.add(chckbxFerro);
		
		JCheckBox chckbxOrganico = new JCheckBox("Organico");
		chckbxOrganico.setBounds(775, 401, 128, 23);
		contentPane.add(chckbxOrganico);
		checkBoxReciclados.add(chckbxOrganico);
		
		JButton btnAddResidencia = new JButton("Adicionar Residencia");
		btnAddResidencia.setBounds(984, 597, 243, 29);
		contentPane.add(btnAddResidencia);
		
	
		
		btnAddResidencia.addActionListener(new ActionListener() {
			

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String nomeMoradia = textFieldNomeMoradia.getText();
		        int numeroMoradores = Integer.parseInt(textFieldNumeroDeMoradores.getText());
		        String tamanhoResidencia  = String.valueOf(comboBox.getSelectedItem());
		        
		        
		        //Agua
		        int consumoLavaLouca = Integer.parseInt(textFieldLavaLouca.getText()); 
		        int consumoLavaRoupa = Integer.parseInt(textFieldLavaRoupas.getText());
		        
		        Agua consumoAgua = new Agua(consumoLavaRoupa, consumoLavaLouca);
		        
		        // Compras
		        int comprasPorAno = Integer.parseInt(textFieldComprasPorAno.getText());
		        
		        Compras comprasAno = new Compras(comprasPorAno); 
		        
		        //Lixo
		        int lixoPorSemana = Integer.parseInt(textFieldLixoPorSemana.getText());
		        
		        Lixo lixo = new Lixo(lixoPorSemana);
		        
		        //Reciclado
		        int selecionadas = 0;
		        for (JCheckBox caixinha : checkBoxReciclados) {
					if(caixinha.isSelected()) {
						selecionadas++;
					}
		        }
		        
		        Reciclado reciclados = new Reciclado(selecionadas);
		        
		        
		        Residencia residencia = new Residencia(nomeMoradia, numeroMoradores, tamanhoResidencia, consumoAgua, comprasAno, lixo, reciclados);
		        
		        System.out.println(residencia.getTamanhoResidencia());
		        System.out.println(residencia.getPontosNumeroResidencia());
		         
		        Home.repo.listaResidenicas.add(residencia);
		        Home.modelResidencia.addElement(residencia);
		        try {
		        	AddMorador.modeloBox.addElement(residencia);
		        } catch (NullPointerException ex) {
		        	
		        }
		        
		        
		        System.out.println(residencia.toString());
		        System.out.println(Home.repo.listaResidenicas.toString());
		        
		        dispose();
		    }
		});
		
		
	}
}
