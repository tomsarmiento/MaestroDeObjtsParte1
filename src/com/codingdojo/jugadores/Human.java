package com.codingdojo.jugadores;

public class Human {
	int strength = 3;
	int intelligence = 3;
	int stealth = 3;
	int health = 100;
	
	public void attack(Object human) {
		((Human) human).disminuirSalud(strength);
	}
	
	public void disminuirSalud(int s) {
		health-=s;
	}
	
	public void mostrarSalud() {
		System.out.println("Mi salud es: "+health);
	}
}
