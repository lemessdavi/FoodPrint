package usuario;

public class Transporte {
	private int pontos;
	private int veiculoPessoal;
	private int transportePublico;
	private int voos;
	
	public Transporte(int veiculoPessoal, int transportePublico, int voos) {
		this.veiculoPessoal = veiculoPessoal;
		this.transportePublico = transportePublico;
		this.voos = voos;
		
		//botar os calculos aqui
	}
	
	public void calculaPontosVeiculo() {
		
	}
	
	public void calculaPontosTransportePublico() {
		
	}
	
	public void calculaPontosVoos() {
		
	}
	
	public int getPontos() {
		return pontos;
	}

}
