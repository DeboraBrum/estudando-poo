import java.util.Scanner;

import services.Operations;

public class Main {
	
	public static int fibonacci(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * ALFORITMO PARA CALCULAR FIBONACCI
		int number;
		System.out.println("Digite um numero inteiro positivo");
		number = Integer.parseInt(keyboard.nextLine());
		System.out.println("Fibonacci: "+fibonacci(number));
		
		*/
		/*
		 * ALGORITMO PARA SOMAR ITENS DE ARRAY COM RECURSIVIDADE
		 * 
		int[] array = new int[5];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
		
		Operations o = new Operations();
		
		System.out.println(o.sum(array));
		*/
		keyboard.close();

	}

}
