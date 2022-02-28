package model;

import java.io.FileWriter;

import services.GeneratorHistory;

public class Estudante extends Pessoa implements GeneratorHistory {
	private int numeroMatricula;
	private String curso;
	private Disciplina[] disciplinas;

	public Estudante(String nome, String email, int numeroMatricula, String curso, Disciplina[] disciplinas) {
		super(nome, email);
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public void generate() {

		try (FileWriter escritor = new FileWriter("historico.txt", true)) {

			escritor.write("Historico\n\n\n");
			for(Disciplina d: this.disciplinas) {
				escritor.write(d.toString()+"\n");				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
