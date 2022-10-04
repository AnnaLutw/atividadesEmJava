package listaHeranca;

public class Gato extends Animal {

	String fala = "miau";
	
	Gato(String nome){
		super(nome);
	}

	@Override
	public String fala() {
		return this.fala;
	}
	
	public void setFala(String muda) {
		this.fala = muda;
	}
	public String getFala() {
		return this.fala;
	}
}
