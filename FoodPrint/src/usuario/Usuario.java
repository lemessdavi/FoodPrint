package usuario;

import java.util.*;

import repositorio.Repositorio;
import residencia.Agua;
import residencia.Residencia;

public abstract class Usuario {
	protected String nome;
	protected int idade;
	private int pontosTotais;
	protected Residencia residencia;
	protected Dieta dieta;
	protected Transporte transporte;
	static Repositorio repo;
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public Transporte getTransporte() {
		return transporte;
	}
	public int getPontosTotais() {
		pontosTotais = 0;
		pontosTotais = this.residencia.getPontosResidencia() + this.dieta.getPontos() + this.transporte.getPontos();
		
		return pontosTotais;
	}
	
	public Residencia getResidencia() {
		return residencia;
	}
	
	public Dieta getDieta() {
		return dieta;
	}
	
	public double calculaNota() {
		return (getPontosTotais() * 10) / 184;
		
	}
	
	@Override
	public String toString() {
		return nome + "      Indice de Emissao: " + getPontosTotais() + "      Mora na Residencia: " + residencia.getNomeMoradia();
	}
	
	public void editUsuario(String nome, int idade, Transporte transporte, Dieta dieta) {
		this.nome = nome;
		this.dieta = dieta;
		this.idade = idade;
		this.transporte = transporte;
	}
	
	
}

// transformar usuario em interface, fazer heranca com moradores e admin

//  fazer com que o numeoro de pessoas que moram na casa seja = a o numero de (moradores + admin)
// so o admin pode fazer alteracoes na casa, consumo de agua e compras da casa
// todos os membros podem editar sua dieta, o admin pode editar de todos.
// tornar dieta clean code
// fazer compras