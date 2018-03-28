package model;

public class Cachorro extends Mamifero {

	private String tamanho;

	public Cachorro(String nome, String tamanho, String raca) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.raca = raca;
	}

	@Override
	public void amamentar() {
		System.out.println("Amamentar Cachorro!");
	}

	@Override
	public void emitirSom() {
		System.out.println("woof woof woof woof !!!");
	}

	@Override
	public String toString() {
		return "Cachorro [tamanho=" + tamanho + ", raca=" + raca + ", nome=" + nome + "]";
	}
}
