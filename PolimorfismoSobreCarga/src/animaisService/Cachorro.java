package animaisService;
import java.time.LocalTime;
import especieServices.Mamifero;

public class Cachorro extends Mamifero {

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}

	public void enterrarOsso() {
		System.out.println("Osso enterrado");
	}

	public void abanarRabo() {
		System.out.println("Abanando rabo");
	}

	public void reagir(String frase) {
		if (frase == "comida" || frase == "Ola") {
			System.out.println("Abanar e latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(LocalTime time) {				
		if(time.getHour() < 12) {
			System.out.println("Abanar");
		}else if(time.getHour() > 24 ) {
			System.out.println("Ingorar");
		}else {
			System.out.println("Abanar e latir");
		}
	}

	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}

	public void reagir(int idade, Float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else if (peso < 10) {
			System.out.println("Rosnar");
		} else {
			System.out.println("Ignorar");
		}
	}
}
