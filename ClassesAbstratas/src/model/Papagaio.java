package model;

public class Papagaio extends Ave{

	public Papagaio(String nome) {
		this.nome = nome;
	}

	@Override
	public void voar() {
		System.out.println("Papagaio voandooooo");		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som papagaio");		
	}

	@Override
	public String toString() {
		return "Papagaio [nome=" + nome + "]";
	}	
}
