package criarTextos;

import java.util.Scanner;

public class ativi3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);


		System.out.println("data: ");
		//separar o dia, m�s e o ano como tr�s palavras
		String[] arrayData = ent.nextLine().trim().split("/");
		String resultado = "Voc� nasceu em ";
		//todos os meses do ano 
		String[] arrayMeses = {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho", "julho", "agosto","setembro", "outubro", "novembro", "dezembro"};
		
		for(int i=0;i<arrayData.length;i++){
			//chegou no 1 que � o dia
				if(i==0) {		
					//pegar o caracter digitado
					resultado=resultado + arrayData[i];
				}
				//o m�s
				else if(i==1) {
					//converter o I do indice em int
					int indiceMeses = Integer.valueOf(arrayData[i]);
					//pegar o m�s digitado menos 1 para chegar no certo
					resultado=resultado +" de " + arrayMeses[indiceMeses-1];
				}
				//o ano, apenas pegar os caracteres digitados
				else if(i==2) {
					resultado=resultado+ " de " + arrayData[i];
				}
		}
		//imprimir a data em extenso
		System.out.print(resultado);
	}
}
