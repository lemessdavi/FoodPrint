package usuario;

import java.util.*;

import residencia.Agua;
import residencia.Residencia;

public class Admin extends Usuario {

	private String senha;
	
	public Admin(String nome, int idade, Transporte transporte, Dieta dieta, Residencia residencia, String senha) {
		this.nome = nome;
		this.dieta = dieta;
		this.idade = idade;
		this.residencia = residencia;
		this.senha = senha;
		this.transporte = transporte;
	}
	
	public boolean autenticaSenha(String senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
}

