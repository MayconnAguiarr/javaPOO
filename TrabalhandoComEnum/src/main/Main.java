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
			System.out.println(dia.toString() +" - "+ dia.getValor());
			break;
		case TERCA:
			System.out.println(dia.toString() +" - "+ dia.getValor());
			break;
		case QUARTA:
			System.out.println(dia.toString() +" - "+ dia.getValor());
			break;
		case QUINTA:
			System.out.println(dia.toString() +" - "+ dia.getValor());
			break;
		case SEXTA:
			System.out.println(dia.toString() +" - "+ dia.getValor());
			break;
		case SABADO:
			System.out.println(dia.toString() +" - "+ dia.getValor());
			break;
		case DOMINGO:
			System.out.println(dia.toString() +" - "+ dia.getValor());
			break;
		}
	}
}
