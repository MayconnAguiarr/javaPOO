package main;

import trabalhandoComEnum.DiaSemana;

public class Main {

	public static void main(String[] args) {

		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;

		imprimeEnum(segunda);
		imprimeEnum(terca);
		imprimeEnum(quarta);
		imprimeEnum(quinta);
		imprimeEnum(sexta);
		imprimeEnum(sabado);
		imprimeEnum(domingo);

	}

	private static void imprimeEnum(DiaSemana dia) {
		switch (dia) {

		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}

}
