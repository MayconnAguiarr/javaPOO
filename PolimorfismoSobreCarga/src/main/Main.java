package main;

import services.Ave;
import services.Mamifero;
import services.Peixe;
import services.Reptil;

public class Main {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		
		r.locomover();
		

	}

}
