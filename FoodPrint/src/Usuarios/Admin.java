package Usuarios;

import java.util.*;

import Residencia.Agua;
import Residencia.Residencia;
import Usuarios.Dieta.Dieta;

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

