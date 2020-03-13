package com.codingdojo.jugadores;

public class HumanTest {

	public static void main(String[] args) {
		Human jose = new Human();
		Human pedro = new Human();
		
		jose.attack(pedro);
		jose.attack(pedro);
		System.out.println("Pedro:");
		pedro.mostrarSalud();
		pedro.attack(jose);
		System.out.println("Jose: ");
		jose.mostrarSalud();
		

	}

}
