package criarTextos;

import java.util.Scanner;

public class ativi1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//pedir paraq digitar o nome
		System.out.println("nome: ");
		
		//colocar esse nome no vetor em maiusculo, tirar os espa�os antes e 
		//depois e separar as palavras com split
		String[] arrayTexto = ent.nextLine().toUpperCase().trim().split(" ");
		
		String iniciais = "";
		//fazer um for desse nome
		for(int i=0;i<arrayTexto.length;i++){
			//quando o i n�o for igual aos conectores vai salvar 
			if(!arrayTexto[i].equals("E") && !arrayTexto[i].equals("DO") && !arrayTexto[i].equals("DA") && !arrayTexto[i].equals( "DAS") && !arrayTexto[i].equals("DE") && !arrayTexto[i].equals( "DI")&& !arrayTexto[i].equals( "DU")) {
				
				//pegar sempre o primeiro caracter da palavra
				iniciais=iniciais + arrayTexto[i].charAt(0);

			}
		}
		//imprimir
		System.out.print(iniciais);

	}
}

