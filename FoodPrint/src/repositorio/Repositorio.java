package repositorio;
import java.util.ArrayList;

import residencia.Residencia;
import usuario.Usuario;

public class Repositorio extends ArrayList {

	public ArrayList<Residencia> listaResidenicas = new ArrayList<>();
	public ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	
	@Override
	public boolean add(Object e) {
	
		return super.add(e);
	}
	
	
}
