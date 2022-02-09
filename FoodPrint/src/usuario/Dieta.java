package usuario;

public class Dieta {
	private int pontos;
	private String dieta; 
	String[] opcoesDieta = { "Vegano", "Vegetariano", "Alguns Dias da Semana", "Praticamente todos os dias"};
	// true = daily basis, then add 10 points. || false = few times per week, then add 8 points.
	String[] opcoesProcedenciaAlimentos= { "Somente comida fresca, plantada localmente.", "Um balanco entre comida fresca e industrializada.", "Apenas comida industrializada."};
	private String procedenciaAlimentos; 
	
	// 0 = 12 points if most of the food you eat is prepackaged || 1 = 6 points good balance of fresh and convenience food. || 2 = 2 points only eat fresh, locally grown
	
	public Dieta(String dieta, String procedencia) {
		this.procedenciaAlimentos = procedencia;
		this.dieta =  dieta;

		
		pontos+= pontosDieta();
		
	}
	
	public int pontosDieta() {
		pontos = 0;
		return (pontosConsumoCarne() + pontosProcedenciaAlimentos());
		
	}	

	public int pontosConsumoCarne() {
		switch(dieta) {
		case "Vegano": 
			return 2;
		case "Vegetariano":
			return 4;
		case "Alguns Dias da Semana":
			return 8;
		case "Praticamente todos os dias":
			return 10;
		default:
			throw new IllegalArgumentException("Unexpected value: " + dieta);
		}
	}
		
	public int pontosProcedenciaAlimentos() {
		switch (procedenciaAlimentos) {
		case "Apenas comida industrializada.": 
			return 12;
		case "Um balanco entre comida fresca e industrializada.":
			return 6;
		case "Somente comida fresca, plantada localmente.":
			return 2;
		default:
			throw new IllegalArgumentException("Unexpected value: " + procedenciaAlimentos);
		}
	}
	
	
	public int getPontos() {
		return pontos;
	}
	public String getProcedenciaAlimentos() {
		return procedenciaAlimentos;
	}
	
	public String getDieta() {
		return dieta;
	}
	public String[] getOpcoesDieta() {
		return opcoesDieta;
	}
	public String[] getOpcoesProcedenciaAlimentos() {
		return opcoesProcedenciaAlimentos;
	}
	
	//  cada uma altera o seu, adm pode alterar de todos. 
	public void setProcedenciaAlimentos(String procedenciaAlimentos) {
		this.procedenciaAlimentos = procedenciaAlimentos;
		pontosDieta();
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
		pontosDieta();
	}
	
	
	
}
