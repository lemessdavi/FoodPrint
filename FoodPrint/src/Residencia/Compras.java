package Residencia;

public class Compras {
	private int pontos;
	private int comprasPorAno; 
	
	
	public Compras(int comprasPorAno) {
		this.comprasPorAno = comprasPorAno;
		
		pontos+= getPontosComprasPorAno();
	}


	private int getPontosComprasPorAno() {
		pontos =0;
		if (comprasPorAno >= 7) {
			return 10;
		}else {
			if (comprasPorAno < 7 && comprasPorAno >= 5) {
				return 8;
			}else {
				if (comprasPorAno < 5 && comprasPorAno >= 3) {
					return 6;
				}else {
					if (comprasPorAno<3 && comprasPorAno >=1) {
						return 4;
					} else {
						if (comprasPorAno == 0) {
							return 2;
						}
					}
				}
			}
		}
		throw new IllegalArgumentException("Unexpected value: " + comprasPorAno);
	}
	
	public int getPontos() {
		return pontos;
	}
	public int getComprasPorAno() {
		return comprasPorAno;
	}
	
	//somente o admin pode alterar
	
	public void setComprasPorAno(int comprasPorAno) {
		this.comprasPorAno = comprasPorAno;
		pontos += getPontosComprasPorAno();
	}
}
