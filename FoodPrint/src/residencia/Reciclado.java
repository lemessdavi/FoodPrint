package residencia;

import java.util.ArrayList;
import java.util.List;

public class Reciclado {
	private int pontos = 24;
	private int quantidadeReciclada;
	
	public Reciclado(int quantidadeReciclada) {
		this.quantidadeReciclada = quantidadeReciclada;
		
		pontos -= getQuantidadeReciclada();
		
	}
	
	public int getQuantidadeReciclada(){
		return quantidadeReciclada * 4;
	}
	
	public int getPontos() {
		return pontos;
		
	}
	
	@Override
	public String toString() {
		return "Pontos por reciclagem " +pontos;
    } 
}
