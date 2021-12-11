package Usuarios.Dieta;

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
		pontos+= pontosDieta();
		
	}
	
	public int pontosDieta() {
		pontos = 0;
		if (consumoCarne) {
			return 10;
		} 
		if(!consumoCarne){
			return 8;
		}
		if(vegetarian) {
			return 4;
		}
		if(vegan) {
			return 2;
		}
		
		switch (procedenciaAlimentos) {
		case 0: 
			return 12;
		case 1:
			return 6;
		case 2:
			return 2;
		default:
			throw new IllegalArgumentException("Unexpected value: " + procedenciaAlimentos);
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
	
	//  cada uma altera o seu, adm pode alterar de todos. 
	public void setConsumoCarne(boolean consumoCarne) {
		this.consumoCarne = consumoCarne;
		pontos+= pontosDieta();
	}
	public void setProcedenciaAlimentos(int procedenciaAlimentos) {
		this.procedenciaAlimentos = procedenciaAlimentos;
		pontos+= pontosDieta();
	}
	public void setVegan(boolean vegan) {
		this.vegan = vegan;
		pontos+= pontosDieta();
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
		pontos+= pontosDieta();
	}
	
	
}
