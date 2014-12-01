package com.example.meurancho;

public class Dados {
	private String nome;
	private boolean check;
	
	public Dados(String nome, boolean check) {
		super();
		this.nome = nome;
		this.check = check;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}

}
