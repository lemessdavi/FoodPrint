package residencia;

import java.util.ArrayList;
import java.util.List;

public class Reciclado {
	private int pontos = 24;
	private int quantidadeReciclada;
	
	public Reciclado(int quantidadeReciclada) {
		this.quantidadeReciclada = quantidadeReciclada;
		
		pontos -= quantidadeReciclada();
		
	}
	
	public int quantidadeReciclada(){
		return quantidadeReciclada * 4;
	}
	
	public int getPontos() {
		return pontos;
		
	}
}
