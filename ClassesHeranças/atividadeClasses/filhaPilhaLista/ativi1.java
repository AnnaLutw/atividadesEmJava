package filhaPilhaLista;

public class ativi1 {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Pilha pilha = new Pilha();
		Fila fila = new Fila();
		
		lista.InserirInicio(2);
		lista.InserirInicio(1);
		lista.InserirInicio(4);
		lista.InserirInicio(6);
		lista.InserirInicio(9);		
		lista.mostrar();
		
		System.out.println("\n");
		pilha.InserirInicio(4);
		pilha.InserirInicio(8);
		pilha.InserirInicio(9);
		pilha.InserirInicio(5);
		pilha.InserirInicio(1);
		pilha.mostrar();
		
		System.out.println("\n");

		fila.InserirInicio(6);
		fila.InserirInicio(3);
		fila.InserirInicio(0);
		fila.InserirInicio(7);
		fila.InserirInicio(6);
		fila.mostrar();
		
		System.out.println("\n");
		lista.removeFim();
		lista.removeFim();
		lista.removeFim();
		lista.removeFim();
		lista.removeFim();
		lista.mostrar();
		
		pilha.removeFim();
		pilha.removeFim();
		pilha.removeFim();
		pilha.removeFim();
		pilha.removeFim();		
		pilha.mostrar();
		
		fila.removeFim();
		fila.removeFim();
		fila.removeFim();
		fila.removeFim();
		fila.removeFim();
		fila.mostrar();
	}

}
