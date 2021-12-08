package Residencia;

public class Residencia {
	private int numeroMoradores;
	private int tamanhoResidencia; // 0 -> apartamento, 1-> small house, 2-> medium house, 3->large house
	private int pontos;
	private Agua consumoAgua;	
	
	public Residencia(int numeroMoradores, int tamanhoResidencia) {
		this.numeroMoradores = numeroMoradores;
		this.tamanhoResidencia = tamanhoResidencia;
		
		pontos += getPontosNumeroMoradores();
		pontos += getPontosNumeroResidencia();
		
		
	}
	
	private int getPontosNumeroMoradores() {
		if (numeroMoradores >5) {
			pontos+= 2;
		} 
		if (numeroMoradores > 0) {
		switch (numeroMoradores) {
		case 1: 
			return 12;
		case 2: 
			return 10;
		case 3: 
			return 8;
		case 4: 
			return  6;
		case 5: 
			return 4;
		}
		}
		throw new IllegalArgumentException("Unexpected value: " + tamanhoResidencia);
	}
	
	private int getPontosNumeroResidencia() {
		switch (tamanhoResidencia) {
		case 0:
			return 2;
		case 1:
			return 4;
		case 2:
			return 6;
		case 3:
			return 8;
		default:
			throw new IllegalArgumentException("Unexpected value: " + tamanhoResidencia);
		}
	}
	public int getNumeroMoradores() {
		return numeroMoradores;
	}
	public int getTamanhoResidencia() {
		return tamanhoResidencia;
	}
	public int getPontos() {
		return pontos;
	}
}
