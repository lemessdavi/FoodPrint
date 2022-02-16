package usuario;

import java.util.*;

import residencia.Agua;
import residencia.Residencia;

public class Morador extends Usuario {
	
	
	
	public Morador(String nome, int idade, Transporte transporte, Dieta dieta, Residencia residencia) {
		this.nome = nome;
		this.dieta = dieta;
		this.idade = idade;
		this.residencia = residencia;
		this.transporte = transporte;
	}
}


// fazer com que o numeoro de pessoas que moram na casa seja = a o numero de (moradores + admin)
//so o admin pode fazer alteracoes na casa, consumo de agua e compras da casa
// todos os membros podem editar sua dieta, o admin pode editar de todos.