package listaHeranca;

public abstract class Animal {

	private String nome;
	
	 Animal(String nome){
		 this.nome = nome;
	 }
	 
	 public abstract String fala();
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
}
