package listaHeranca;

public class Cao extends Animal {

	String fala = "au-au";
	
	Cao(String nome){
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
