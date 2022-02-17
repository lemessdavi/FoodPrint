package residencia;

public class Agua {
	private int pontos;
	private int lavaRoupa; // 0 -> nao tem | 1 -> +9x por semana (3pontos) 2-> entre 4 e 9(2pontos) | 3-> entra 1 e 3 (1 ponto)
	private int lavaLouca; // 0 -> nao tem | 1 -> +9x por semana (3pontos) 2-> entre 4 e 9(2pontos) | 3-> entra 1 e 3 (1 ponto)
	
	public Agua(int lavaRoupa, int lavaLouca) {
		this.lavaLouca = lavaLouca;
		this.lavaRoupa = lavaRoupa;
		
		pontos += getPontosConsumoAgua();

	}
	
	private int getPontosConsumoAgua() {
		return getLavaLoucaPontos() + getLavaRoupaPontos();
	}
	
	public int getLavaLoucaPontos() {
		if (lavaLouca != 0) {
			if (lavaLouca > 9) {
				return 3;
			}
			if (lavaLouca <= 9 && lavaLouca >= 4) {
				return 2;
			}
			if (lavaLouca <= 3 && lavaLouca >= 1) {
				return 1;
			}
		}
		return 0;  
	}
	
	public int getLavaRoupaPontos(){
		if (lavaRoupa != 0) {
			if (lavaRoupa > 9) {
				return 3;
			}
			if (lavaRoupa <= 9 && lavaRoupa >= 4) {
				return 2;
			}
			if (lavaRoupa <= 3 && lavaRoupa >= 1) {
				return 1;
			}
		}
		return 0;	
	}
	
	public int getLavaLouca() {
		return lavaLouca;
	}
	public int getLavaRoupa() {
		return lavaRoupa;
	}
	public int getPontos() {
		return pontos;
		
	}
	
	//somente o admin pode alterar
	
	public void setLavaLouca(int lavaLouca) {
		this.lavaLouca = lavaLouca;
		pontos += getPontosConsumoAgua();
	
	}
	public void setLavaRoupa(int lavaRoupa) {
		this.lavaRoupa = lavaRoupa;
		pontos += getPontosConsumoAgua();
	}
	@Override
	public String toString() {
		return "Consumo agua pontos: " +pontos;
	}
}
