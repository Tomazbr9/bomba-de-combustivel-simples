package aplication;


class Animal {
	
	protected String nome;
	
	public Animal() {
		
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String mostrar() {
		return "Ola mundo";
	}
	
	
}

class Cachorro extends Animal {
	
	private String atributo;
	
	public Cachorro(String nome, String atributo) {
		super(nome);
		this.atributo = atributo;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
}

public class Program {

	public static void main(String[] args) {
	    Animal c = new Animal("Bruno");
	    
	    System.out.println(c.mostrar());
		
	}
}
