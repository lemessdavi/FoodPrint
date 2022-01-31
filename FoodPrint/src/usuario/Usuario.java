package usuario;

import java.util.*;

import residencia.Agua;
import residencia.Residencia;

public abstract class Usuario {
	protected String nome;
	protected int idade;
	private int pontosTotais;
	protected Residencia residencia;
	protected Dieta dieta;
	protected Transporte transporte;
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getPontosTotais() {
		pontosTotais = 0;
		pontosTotais = residencia.getPontos() + dieta.getPontos() + transporte.getPontos();
		
		return pontosTotais;
	}
	
	public Residencia getResidencia() {
		return residencia;
	}
	
	public Dieta getDieta() {
		return dieta;
	}
	
	
	
}

// transformar usuario em interface, fazer heranca com moradores e admin

//  fazer com que o numeoro de pessoas que moram na casa seja = a o numero de (moradores + admin)
// so o admin pode fazer alteracoes na casa, consumo de agua e compras da casa
// todos os membros podem editar sua dieta, o admin pode editar de todos.
// tornar dieta clean code
// fazer compras