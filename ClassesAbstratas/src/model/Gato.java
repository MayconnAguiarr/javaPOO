package model;

public class Gato extends Mamifero{

	
	public Gato(String nome, String raca) {
		this.nome =nome;
		this.raca = raca;		
	}
	
	@Override
	public void amamentar() {
		System.out.println("Amamentar gato");		
	}

	@Override
	public void emitirSom() {
		System.out.println("meow meow meow meow !!!");		
	}

	@Override
	public String toString() {
		return "Gato [raca=" + raca + ", nome=" + nome + "]";
	}	
}
