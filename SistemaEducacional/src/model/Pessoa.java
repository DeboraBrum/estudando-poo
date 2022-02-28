package model;

public abstract class Pessoa {
	protected String nome;
	protected String email;
	
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	

}
