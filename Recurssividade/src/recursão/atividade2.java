package recursão;

import java.util.Scanner;

public class atividade2 {

	public static int num (int numerador, int denominador){
		
		//não tem como fzr se numerador for menor que denominador então só retorna o 0//

		if(numerador<denominador) {
			return(0);
		}
		//se não, pega o numerador e subtrai pelo denominador e soma mais um para cada aba que foi aberta que será o resultado da divisão// 

		else {
			return(num(numerador-denominador,denominador)+1);
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

		System.out.println(num(num1, num2));
		ent.close();
		
	}

}
