package usuario;

import java.util.*;

import residencia.Agua;
import residencia.Residencia;

public class Admin extends Usuario {

	private char[] senha;
	
	public Admin(String nome, int idade, Transporte transporte, Dieta dieta, Residencia residencia, char[] senha) {
		this.nome = nome;
		this.dieta = dieta;
		this.idade = idade;
		this.residencia = residencia;
		this.senha = senha;
		this.transporte = transporte;
	}
	public Admin(String nome, Transporte transporte, Dieta dieta, Residencia residencia, char[] senha) {
		this.nome = nome;
		this.dieta = dieta;
		this.residencia = residencia;
		this.senha = senha;
		this.transporte = transporte;
	}
	
	public boolean autenticaSenha(char[] senha) {
		if (this.senha.length == senha.length) {
			int posicao = 0;
			for (char c : senha) {
				if(c != this.senha[posicao]) {
					return false;
				}
				posicao ++;
				return true;
			}
		}
		return false;
		
	}
	
	public char[] getSenha() {
		return senha;
	}
	
}

