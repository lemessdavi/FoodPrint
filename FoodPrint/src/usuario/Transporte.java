package usuario;

public class Transporte {
	private int pontos;
	private double veiculoPessoal;
	private double transportePublico;
	private String voos;
	
	public Transporte(double veiculoPessoal, double transportePublico, String voos) {
		this.veiculoPessoal = veiculoPessoal * 0.621371; // transformando em milhhas para melhor precisao
		this.transportePublico = transportePublico * 0.621371; // transformando em milhhas para melhor precisao
		this.voos = voos;
		
		pontos = calculaPontosVoos()+ calculaPontosVeiculo() + calculaPontosTransportePublico();
		
		//botar os calculos aqui
	}
	
	public int calculaPontosVeiculo() {
		if (veiculoPessoal >= 15000) {
			return 12;
		}
		if (veiculoPessoal >= 10000 && veiculoPessoal < 150000) {
			return 10;
		}
		if (veiculoPessoal >= 1000 && veiculoPessoal < 10000) {
			return 6;
		}
		if (veiculoPessoal < 1000 && veiculoPessoal > 0) {
			return 4;
		}
		return 0;
			
	}
	
	public int calculaPontosTransportePublico() {
		if (transportePublico >= 20000) {
			return 12;
		}
		if (transportePublico >= 15000 && transportePublico < 200000) {
			return 10;
		}
		if (transportePublico >= 10000 && transportePublico < 15000) {
			return 6;
		}
		if (transportePublico >= 1000 && transportePublico < 10000) {
			return 4;
		}
		if (transportePublico < 1000 && transportePublico > 0) {
			return 2;
		}
		return 0;
	}
	
	public int calculaPontosVoos() {
		String[] opcoesVoos = { "Nenhum Voo por Ano", "Apenas voos curtos, dentro do próprio estado", "Voos mais longos, dentro do meu país", "Distancias intercontinentais, para outros países"};
		switch (voos) {
		case "Nenhum Voo por Ano": 
			return 0;
		case "Apenas voos curtos, dentro do próprio estado":
			return 2;
		case "Voos mais longos, dentro do meu país":
			return 6;
		case "Distancias intercontinentais, para outros países":
			return 20;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + voos);
		}
		
	}
	
	public int getPontos() {
		return pontos;
	}

}
