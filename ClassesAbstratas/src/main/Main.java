package main;

import model.Cachorro;
import model.Gato;
import model.Papagaio;

public class Main {

	public static void main(String[] args) {

		Papagaio papagaio = new Papagaio("Jack");
		System.out.println(papagaio.toString());
		papagaio.emitirSom();
		papagaio.voar();
		System.out.println();

		Cachorro cachorro = new Cachorro("Rocky", "1.20", "Pastor-alemão");
		System.out.println(cachorro.toString());
		cachorro.amamentar();
		cachorro.emitirSom();
		System.out.println();

		Gato gato = new Gato("Mex", "Siamês");
		System.out.println(gato.toString());
		gato.amamentar();
		gato.emitirSom();
	}

}
