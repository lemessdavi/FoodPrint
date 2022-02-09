package residencia;

import java.util.ArrayList;
import java.util.List;

public class Reciclado {
	private int pontos = 24;
	private boolean recicla;
	private int quantidadeReciclada;
	
	public Reciclado(boolean recicla, int quantidadeReciclada) {
		this.recicla = recicla;
		this.quantidadeReciclada = quantidadeReciclada;
		
		pontos -= quantidadeReciclada();
		
	}
	
	public int quantidadeReciclada(){
		if (recicla) {
			return quantidadeReciclada * 4;
		}
		return 0;
	}
	
	public int getPontos() {
		return pontos;
		
	}
}
