package recurs�o;

import java.util.Scanner;

public class atividade4 {

	public static int resto (int x, int y){
		
		//n�o tem como fzr se x for menor que y ent�o s� retorna o x//
		
		if(x<y) {
			return(x);
		}
		//se n�o pega o x e subtrai pelo y ate aparecer o resto dessa divis�o// 
		else {
			return(resto(x-y,y));
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
		System.out.println(resto(num1, num2));
		ent.close();

	}
}