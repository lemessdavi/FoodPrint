
public class Dieta {
	private int pontos;
	private boolean consumoCarne; 
	// true = daily basis, then add 10 points. || false = few times per week, then add 8 points.
	private boolean vegetarian;
	private boolean vegan;
	private int procedenciaAlimentos; 
	// 0 = 12 points if most of the food you eat is prepackaged || 1 = 6 points good balance of fresh and convenience food. || 2 = 2 points only eat fresh, locally grown
	
	public Dieta(boolean consumoCarne, boolean vegetarian, boolean vegan, int procedencia) {
		this.consumoCarne = consumoCarne;
		this.vegan = vegan;
		this.vegetarian = vegetarian;
		this.procedenciaAlimentos = procedencia;
		
		if (consumoCarne) {
			pontos += 10;
		} 
		if(!consumoCarne){
			pontos += 8;
		}
		if(vegetarian) {
			pontos += 4;
		}
		if(vegan) {
			pontos += 2;
		}
		switch (procedencia) {
		case 0: 
			pontos+= 12;
			break;
		case 1:
			pontos+= 6;
			break;
		case 2:
			pontos+= 2;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + procedencia);
		}
		
	}
	
	public int getPontos() {
		return pontos;
	}
	public int getProcedenciaAlimentos() {
		return procedenciaAlimentos;
	}
	
	public boolean getVegetarian(){
		return vegetarian;
	}
	public boolean getVegan(){
		return vegan;
	}
	
}
