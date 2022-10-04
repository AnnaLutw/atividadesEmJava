package recursão;

import java.util.Scanner;

public class atividade1 {
	
	public static int soma (int a) {
		int  conta = 0;
		
		
		//se o numero for menor que 1 vai retonar ele msm
		if(a<1) {
			
			return(a);
		}
		
		//pega uma variavel que vai ser o resto da divisão e vai fazer ate pegar todos os restos
		conta+=a % 10;

		//depois soma esses restos com uma nova variavel que vai ser a dividido por 10
		return(conta+soma(a/10));
		
	}
		
	
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);	

		int num;
		System.out.println("digite um numero: ");
		num = ent.nextInt();
		
		
		//imprimir o resultado
		System.out.println(soma(num));
		ent.close();

	}
}
