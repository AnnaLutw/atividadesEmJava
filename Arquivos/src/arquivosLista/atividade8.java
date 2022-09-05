package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade8 {

	public static double fat() {
		//selecionei o arquivo 
		File arq = new File("C:\\temp\\exer8.txt");
		double valo = 0;
		try {
			int som = 0, res = 0;
			String valor;
			Scanner ent = new Scanner(arq);
			while (ent.hasNextLine()) {
				valor = ent.nextLine();
				if (valor.contains("Valor")) {
					String[] part = valor.split(" ");
					String val = part[1];
					som = Integer.parseInt(val);
					res += som;
				}
			}

			valo = res * 0.33;
			valo *= 12;
			ent.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inv�lido");
			e.printStackTrace();
		}

		try {
			FileWriter resultado = new FileWriter("C:\\temp\\resultado.txt", true);
			resultado.write("O valor de aluguel anual �: " + valo + "\n");
			resultado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return valo;
	}

	public static double juros() {
		File arq = new File("C:\\temp\\exer8.txt");
		double valo = 0, juros;
		try {
			int som = 0, res = 0;
			String valor;
			Scanner ent = new Scanner(arq);
			while (ent.hasNextLine()) {
				valor = ent.nextLine();
				if (valor.contains("Valor")) {
					String[] part = valor.split(" ");
					String val = part[1];
					som = Integer.parseInt(val);
					res += som;
				}
			}

			valo = res * 0.1;
			juros = valo * 0.2;
			valo *= juros;
			ent.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inv�lido");
			e.printStackTrace();
		}
		
		try {
			FileWriter resultado = new FileWriter("C:\\temp\\resultado.txt",true);
			resultado.write("O valor de meses atrasados �: " + valo + "\n");
			resultado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return valo;
	}

	public static double man() {
		File arq = new File("C:\\temp\\exer8.txt");
		double cont = 0;
		try {
			String str;
			Scanner ent = new Scanner(arq);
			while (ent.hasNextLine()) {
				str = ent.nextLine();
				if (str.contains("Carro")) {
					cont++;
				}
			}
			cont *= 600;
			cont *= 0.02;
			ent.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inv�lido");
			e.printStackTrace();
		}
		
		try {
			FileWriter resultado = new FileWriter("C:\\temp\\resultado.txt",true);
			resultado.write("O valor de meses atrsados �: " + cont + "\n");
			resultado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cont;
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		try {
			int qt, vl, j = 1;
			//selecionei o arquivo
			FileWriter arqes = new FileWriter("C:\\temp\\exer8.txt");
			//pedi para digitar quant de carros
			System.out.println("Digite a quantidade de carros:");
			qt = ent.nextInt();
			//digitar valor do alugal para cada carro
			for (int i = 0; i < qt; i++) {
				System.out.println("Digite o valor de aluguel do carro");
				vl = ent.nextInt();
				arqes.write("Carro " + j + "\n");
				arqes.write("Valor " + vl + "\n" + "\n");

				j++;
			}
			arqes.close();
		} catch (IOException e) {
			System.out.println("Inv�lido.");
		}
		//printei todos
		System.out.printf("O valor das vendas anual �: %.2f", fat());
		System.out.println();
		System.out.printf("O valor recebido dos atrasos mensais �: %.2f", juros());
		System.out.println();
		System.out.printf("O valor de manuten��o anual � de: %.2f", man());

		ent.close();
	}
}