package Usuarios;

import java.util.*;

import Residencia.Agua;
import Residencia.Residencia;
import Usuarios.Dieta.Dieta;

public class Admin extends Usuario {
	private String nome;
	private int idade;
	private int pontosTotais;
	private Residencia residencia;
	private Dieta dieta;
	private Agua consumoAgua; //acho que nao precisa disso aqui, da pra acessar com residencia.agua.getPontos.
	private String senha;
	
}

