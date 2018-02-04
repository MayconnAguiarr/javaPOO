package main;

import java.awt.Label;
import java.sql.Time;
import java.time.LocalTime;

import javax.sql.rowset.CachedRowSet;

import animaisService.Arara;
import animaisService.Cachorro;
import animaisService.Canguru;
import animaisService.Carpa;
import animaisService.Lobo;
import animaisService.Tartaruga;
import especieServices.Ave;
import especieServices.Mamifero;
import especieServices.Peixe;
import especieServices.Reptil;

public class Main {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru c = new Canguru();
		Cachorro ch = new Cachorro();
		Carpa cp = new Carpa();
		Arara ara =  new Arara();
		Tartaruga tg = new Tartaruga();
		Lobo l = new Lobo();	
	}

}
