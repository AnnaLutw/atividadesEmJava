package recurs�o;

import java.util.Scanner;

public class atividade2 {

	public static int num (int numerador, int denominador){
		
		//n�o tem como fzr se numerador for menor que denominador ent�o s� retorna o 0//

		if(numerador<denominador) {
			return(0);
		}
		//se n�o, pega o numerador e subtrai pelo denominador e soma mais um para cada aba que foi aberta que ser� o resultado da divis�o// 

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
