package listaHeranca;

public class Homem extends Animal {

	String fala = "Oi";
	
	Homem(String nome){
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
