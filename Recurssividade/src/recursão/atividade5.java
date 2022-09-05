package recursão;

import java.util.Scanner;

public class atividade5 {
		//resolver o fatorial
	public static double fat (double n) {
		//apos n ser igual a 1, envia para soma
		if(n==1) {
			return(1);
		}
//enquanto n for maior que um subtrai
		return(fat(n-1)*n);
		
	}
	//vai somar todas as vezes que fez a conta
	public static double soma (int n) {
		
		if(n==1) {
			return(1);
		}	
		return(soma(n-1)+ (1/fat(n)));
	}


	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);	

		int numero;
		//imprimir o resultado
		System.out.println("digite um numero: ");
		numero = ent.nextInt();
		
		//chama para o main
		System.out.println(fat(numero));
		ent.close();

	}

}
