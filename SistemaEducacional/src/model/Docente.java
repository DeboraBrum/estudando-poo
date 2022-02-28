package model;

public class Docente extends Pessoa{	

	public Docente(String nome, String email) {
		super(nome, email);
	}
	@Override
	public String toString() {
		return "Docente [nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}
