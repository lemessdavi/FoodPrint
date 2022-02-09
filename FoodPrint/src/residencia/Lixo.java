package residencia;

public class Lixo {

	private int pontos;
	private int lixeiraPorSemana;
	
	public Lixo(int lixeiraPorSemana) {
		this.lixeiraPorSemana = lixeiraPorSemana;
		pontos =+ calculaPontosLixeira();
	}
	
	public int calculaPontosLixeira() {
		
		return (lixeiraPorSemana * 10 + 10);
		
		
		/*
		 * if (lixeiraPorSemana > 4) { return 60; } switch (lixeiraPorSemana) { case 0:
		 * // 0 é metade de uma lixeira ou menos return 5; case 1: return 20; case 2:
		 * return 30; case 3: return 40; case 4: return 50; } throw new
		 * IllegalArgumentException("Unexpected value: " + lixeiraPorSemana);
		 */
	}
	
	public int getPontos() {
		return pontos;
	}
}
