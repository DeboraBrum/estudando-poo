package userinterface;

import model.Disciplina;
import model.Docente;
import model.Estudante;

public class Main {
	public static void main(String[] args) {
		
		Disciplina d1 = new Disciplina("Fisica", 4, new Docente("Rubens", "rub@email.com"));
		Disciplina d2 = new Disciplina("MecFlu", 3, new Docente("Leo", "leo@email.com"));
		Disciplina d3 = new Disciplina("Termo", 5, new Docente("Fabiana", "fab@email.com"));
		
		Disciplina[] lista = new Disciplina[3];
		lista[0] = d1;
		lista[1] = d2;
		lista[2] = d3;
		
		Estudante e1 = new Estudante("Joao", "joao@email.com", 20223, "Engenharia", lista);
		
		e1.generate();
		
		
	}
}
