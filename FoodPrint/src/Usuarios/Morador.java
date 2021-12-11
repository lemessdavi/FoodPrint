package Usuarios;

import java.util.*;

import Residencia.Agua;
import Residencia.Residencia;
import Usuarios.Dieta.Dieta;

public class Morador extends Usuario {
	private String nome;
	private int idade;
	private int pontosTotais;
	private Residencia residencia;
	private Dieta dieta;
	
	
	public Morador(String nome, int idade, Residencia residencia, Dieta dieta) {
		this.nome = nome;
		this.dieta = dieta;
		this.idade = idade;
		this.residencia = residencia;
	}
}


// fazer com que o numeoro de pessoas que moram na casa seja = a o numero de (moradores + admin)
//so o admin pode fazer alteracoes na casa, consumo de agua e compras da casa
// todos os membros podem editar sua dieta, o admin pode editar de todos.