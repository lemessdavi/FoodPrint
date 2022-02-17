package residencia;

import usuario.Admin;

public class Residencia {
	private String nomeMoradia;
	private int numeroMoradores;
	private String tamanhoResidencia; // 0 -> apartamento, 1-> small house, 2-> medium house, 3->large house
	private int pontos;
	private Agua consumoAgua;	
	private Compra compras;
	private Lixo lixo;
	private Reciclado lixoReciclado;
	private Admin admin;
	
	public Residencia(String nome,int numeroMoradores, String tamanhoResidencia, Agua consumoAgua, Compra compras, Lixo lixo, Reciclado lixoReciclado) {
		this.nomeMoradia = nome;
		this.numeroMoradores = numeroMoradores;
		this.tamanhoResidencia = tamanhoResidencia;
		this.consumoAgua = consumoAgua;
		this.compras = compras;
		this.lixo = lixo;
		this.lixoReciclado = lixoReciclado;
		
		pontos += getPontosResidencia();
	}
	public int getPontosResidencia(){
		pontos = 0;
		
		return getPontosNumeroMoradores() + getPontosNumeroResidencia() + consumoAgua.getPontos() + compras.getPontos() + lixo.getPontos() + lixoReciclado.getPontos();
	}
	
	private int getPontosNumeroMoradores() {
		if (numeroMoradores > 6) {
			return 2;
		} 
		if (numeroMoradores > 0 && numeroMoradores <= 6) {
		switch (numeroMoradores) {
		case 1: 
			return 14;
		case 2: 
			return 12;
		case 3: 
			return 10;
		case 4: 
			return  8;
		case 5: 
			return 6;
		case 6: 
			return 4;
		}
		}
		throw new IllegalArgumentException("Unexpected value: " + tamanhoResidencia);
	}
	
	public int getPontosNumeroResidencia() {
		switch (tamanhoResidencia) {
		case "Apartamento":
			return 2;
		case "Casa Pequena":
			return 4;
		case "Casa Media":
			return 6;
		case "Casa Grande":
			return 8;
		default:
			throw new IllegalArgumentException("Unexpected value: " + tamanhoResidencia);
		}
	}
	public String getNomeMoradia() {
		return nomeMoradia;
	}
	public int getNumeroMoradores() {
		return numeroMoradores;
	}
	public String getTamanhoResidencia() {
		return tamanhoResidencia;
	}
	
	public Agua getConsumoAgua() {
		return consumoAgua;
	}
	public Compra getCompras() {
		return compras;
	}
	public Lixo getLixo() {
		return lixo;
	}
	public Reciclado getLixoReciclado() {
		return lixoReciclado;
	}
	
	//somente o admin pode alterar
	public void setConsumoAgua(Agua consumoAgua) {
		this.consumoAgua = consumoAgua;
		pontos += getPontosResidencia();
	}
	public void setNumeroMoradores(int numeroMoradores) {
		this.numeroMoradores = numeroMoradores;
		pontos += getPontosResidencia();
	}
	public void setTamanhoResidencia(String tamanhoResidencia) {
		this.tamanhoResidencia = tamanhoResidencia;
		pontos += getPontosResidencia();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  nomeMoradia ;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
		
	}
	public Admin getAdmin() {
		return admin;
	}
	
	public void alterarResidencia(String nomeMoradia2, int numeroMoradores2, String tamanhoResidencia2,
			Agua consumoAgua2, Compra comprasAno, Lixo lixo2, Reciclado reciclados) {
		this.nomeMoradia = nomeMoradia2;
		this.numeroMoradores = numeroMoradores2;
		this.tamanhoResidencia = tamanhoResidencia2;
		this.consumoAgua = consumoAgua2;
		this.compras = comprasAno;
		this.lixo = lixo2;
		this.lixoReciclado = reciclados;
		
		pontos += getPontosResidencia();
		
	}
}
