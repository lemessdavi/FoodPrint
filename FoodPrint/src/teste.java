import java.awt.EventQueue;

import front.Home;
import residencia.Lixo;
import residencia.Reciclado;

public class teste {
	
	public static void main(String[] args) {
		
		Home home = new Home();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		home.fieldSacosdeLixoPorSeman
		
		
		
		
	}
}
