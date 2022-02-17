import java.awt.EventQueue;

import front.AddMorador;
import residencia.Agua;
import residencia.Lixo;
import residencia.Reciclado;
import residencia.Residencia;

public class teste {
	
	public static void main(String[] args) {
		
		
		Agua agua = new Agua(2, 5);

		System.out.println(agua.getLavaLouca());
		
		
		System.out.println(agua.getLavaRoupa());
		
		System.out.println("----------");
		System.out.println(agua.getLavaLoucaPontos());
		System.out.println(agua.getLavaRoupaPontos());
		
		System.out.println(agua.getPontos());
		
		
		
		
	}
}
