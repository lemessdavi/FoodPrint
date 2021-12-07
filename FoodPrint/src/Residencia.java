
public class Residencia {
	private int numeroMoradores;
	private int tamanhoResidencia; // 0 -> apartamento, 1-> small house, 2-> medium house, 3->large house
	private int pontos;
	
	public Residencia(int numeroMoradores, int tamanhoResidencia) {
		this.numeroMoradores = numeroMoradores;
		this.tamanhoResidencia = tamanhoResidencia;
		
		if (numeroMoradores >5) {
			pontos+= 2;
		} 
		if (numeroMoradores > 0) {
		switch (numeroMoradores) {
		case 1: 
			pontos += 12;
			break;
		case 2: 
			pontos += 10;
			break;
		case 3: 
			pontos += 8;
			break;
		case 4: 
			pontos += 6;
			break;
		case 5: 
			pontos += 4;
			break;
		}
		}else {
			throw new IllegalArgumentException("Unexpected value: " + tamanhoResidencia);
		}
		switch (tamanhoResidencia) {
		case 0:
			pontos += 2;
			break;
		case 1:
			pontos += 4;
			break;
		case 2:
			pontos += 6;
			break;
		case 3:
			pontos += 8;
			break;
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
