package filhaPilhaLista;

public class Pilha {
	private int vetor[];
	private int tam;

	Pilha() {
		this(6);
	}

	Pilha(int x) {
		vetor = new int[x];
		tam = 0;
	}

	// inserindo no inicio da lista
		public void InserirInicio(int x) {
			if (tam == vetor.length) {
				System.out.println("Vetor cheio");
			} else {
				for (int i = tam; i > 0; i--) {
					vetor[i] = vetor[i - 1];
				}
				vetor[0] = x;
				tam++;
			}
		}

		// inserindo no final da lista
		public void InserirFim(int x) {
			if (tam == vetor.length) {
				System.out.println("Vetor cheio");
			} else {
				vetor[tam] = x;
				tam++;
			}
		}

		// inserindo em um posição especifica
		public void InserirPos(int x, int pos) {
			if (tam == vetor.length) {
				System.out.println("Vetor cheio");
			} else if (pos > vetor.length || pos < 0) {
				System.out.println("posição invalida");
			} else {
				for (int i = tam; i > pos; i--) {
					vetor[pos] = vetor[i - 1];
				}
				vetor[pos] = x;
				tam++;
			}
		}

		// removendo elemento do fim da lista
		public int removeFim() {
			int retorno = 0;
			if (tam == 0) {
				System.out.println("Lista vazia");
			} else {
				retorno = vetor[tam];
				tam--;
			}
			return retorno;
		}

		public int removeInicio (int x) {
			int retorno = 0;
			if(tam ==0) {
				System.out.println("Lista vazia");
			}
			else {
				retorno = vetor[0];
				tam--;
				for(int i=0; i<tam; i++) {
					vetor[i] = vetor[i+1];
				}
			}
			return retorno;
		}
		public int removePos(int x, int pos) {
			int retorno=0;
			if(tam ==0 ) {
				System.out.println("Lista vazia");
			}
			else {
				retorno = vetor[pos];
				tam--;
				for(int i=pos; i<tam; i++) {
					vetor[i] = vetor[i+1];
				}
			}
			return retorno;
		}
		public void mostrar() {
			if(tam ==0) {
				System.out.println("Lista vazia");
			}
			else {
				for(int i =0; i<tam; i++) {
					System.out.print(vetor[i] + " ");				
				}
			}
		}
		
	}
