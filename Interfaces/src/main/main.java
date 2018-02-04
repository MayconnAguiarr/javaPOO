package main;

import model.Carro;

public class main {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setId(2);
		carro.setNome("Amarok");
		carro.setModelo("2018");
		carro.setFabricante("Volkswagen");
		carro.listar();
		
		Carro carro2 = new Carro(4, "Picape Toro", "2018", "Fiat");
		carro2.listar();		
				
	}

}
