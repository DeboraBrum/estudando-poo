package model;


public class Disciplina {
	private String nome;
	private int[] notas;
	private Docente professor;
	
	public Disciplina(String nome, int qtdProvas, Docente professor) {
		this.nome = nome;
		this.notas = new int[qtdProvas];
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNota(int index, int nota) {
		this.notas[index] = nota;
	}
	
	public Docente getProfessor() {
		return professor;
	}
	
	public double getMedia() {
		int total=0;
		for(int n: this.notas) {
			total += n;
		}
		return total/this.notas.length;
	}
	
	public boolean isAprovado() {
		if(this.getMedia()>=70) {
			return true;
		}
		return false;
	}
	
	public String notasToString() {
		String text="";
		for(int i: this.notas) {
			text += i+" ";
		}
		return text;
	}

	@Override
	public String toString() {
		return "Nome " + nome + ", notas= [" + this.notasToString() + "] - " + (this.isAprovado() ? "APROVADO" : "REPROVADO")+ "\tProfessor: " + professor.getNome() ;
	}
	
}
