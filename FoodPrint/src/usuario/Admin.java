package usuario;

import java.util.*;

import residencia.Agua;
import residencia.Residencia;

public class Admin extends Usuario {

	private String senha;
	
	public Admin(String nome, int idade, Residencia residencia, Dieta dieta, String senha) {
		this.nome = nome;
		this.dieta = dieta;
		this.idade = idade;
		this.residencia = residencia;
		this.senha = senha;
	}
	
	public boolean autenticaSenha(String senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
}

