import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Enunciado
1) Cria um procedimento que receba um ArraList<String>como paraametro e adicione N nomes inseridos
pelo usuario ate que o usuario digite a FLAG “STOP” para encerrar a inserção. 

2) Crie um procedimento que receba como parˆametro um ArraList<String>e imprima todos os valores da
lista.
3) Cria uma funcao booleana que receba como parametro a lista de nomes e uma String e faca o algoritmo
de busca sequencial iterativa na Lista e retorne verdadeiro caso encontre-o ou falso em caso contrario.

4) Cria uma funcao booleana que receba como parametro a lista de nomes e uma String e faca o algoritmo
de busca binaria iterativa na Lista e retorne verdadeiro caso encontre-o ou falso em caso contrario. Voce
deve ordenar a lista com uso da biblioteca nativa JAVA. 

5) Cria um procedimento que receba a lista de String e uma string com um nome, e faca uma busca binaria na
lista e remova a primeira ocorrencia do nome, se caso este seja encontrado. 

6) Cria um procedimento que receba como parametro uma lista de string, um nome, um inteiro que indica
a posicao. Este nome devera ser adiciona se caso exista a posicao na lista. 
*/

public class listaPesquisa {
	public static void inserirPos(ArrayList<String> a, String n, int pos) {
		if(pos< a.size()) {
			a.add(pos, n);
		}
		else {
			System.out.println("erro");
		}
	}
	
	public static boolean binarioRemove(ArrayList<String> a, String n) {
		int inicio = 0, meio=0, fim = a.size() - 1;

		while (inicio <= fim) {
			meio = (fim + inicio) / 2;
			if (a.get(meio).equals(n)) {
				a.remove(meio);
				return true;

			} else if (n.compareTo(a.get(meio)) > 0) {
				inicio = meio + 1;
				
			} else {
				fim = meio - 1;
			}
		}
		return false;
	}	
	public static boolean buscaBinaria(ArrayList<String> a, String n) {
		int inicio = 0, meio=0, fim = a.size() - 1;
		boolean retorno = false;

		while (inicio <= fim) {
			meio = (fim + inicio) / 2;
			if (a.get(meio).equals(n)) {
				retorno = true;
				inicio = a.size();

			} else if (n.compareTo(a.get(meio)) > 0) {
				inicio = meio + 1;

			} else {
				fim = meio - 1;
			}
		}
		return retorno;
	}

	public static boolean buscaSequencial(ArrayList<String> a, String n) {
		boolean retorno = false;
		for (int i = 0; i <= a.size(); i++) {
			if (a.get(i).equals(n)) {
				retorno = true;
				i = a.size();
			}
		}
		return retorno;
	}

	public static void imprime(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + ", ");
		}
		System.out.println();
	}

	public static void adiciona(ArrayList<String> a) {
		Scanner ent = new Scanner(System.in);

		String n = null;
		while (!"stop".equals(n)) {
			System.out.println("Digite um nome: ");
			n = ent.nextLine();
			if (!"stop".equals(n)) {
				a.add(n);
			}
		}
		ent.close();
	}

	public static void main(String[] args) {

		ArrayList<String> x = new ArrayList<>();

		adiciona(x);
		imprime(x);
		System.out.println("Busca Sequencial: " + buscaSequencial(x, "ana"));
		Collections.sort(x);
		System.out.println("Busca Binaria: " + buscaBinaria(x, "ana"));
		binarioRemove(x, "teste");
		imprime(x);
		inserirPos(x, "nome", 1);
		imprime(x);
	}

}
