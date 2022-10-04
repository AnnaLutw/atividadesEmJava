package recursão;

import java.util.Scanner;

public class atividade3 {

	public static int divisao (int numerador, int denominador){
		
		//não tem como fzr se numerador for menor que denominador então só retorna o numerador//
		
		if(numerador<denominador) {
			return(numerador);
		}
		//se não pega o numerador e subtrai pelo denominador ate aparecer o resto dessa divisão// 
		else {
			return(divisao(numerador-denominador,denominador));
		}
	}

	
	
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);	

		
		int num1, num2;
		
		//pedir os numeros//
		System.out.println("digite um numero: ");
		num1 = ent.nextInt();
		
		System.out.println("digite outro numero: ");
		num2 = ent.nextInt();

		
		//mandar para o main imprimir//
		System.out.println(divisao(num1, num2));
		ent.close();

		
	}

}
