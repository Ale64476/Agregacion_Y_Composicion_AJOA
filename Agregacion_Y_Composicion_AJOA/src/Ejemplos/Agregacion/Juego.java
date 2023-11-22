package Ejemplos.Agregacion;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mago mago = new Mago();
		Bruja bruja = new Bruja();
		Caballero caballero = new Caballero();
		Campesino campesino = new Campesino();
		Guerrero guerrero = new Guerrero();
		GuerreroAcorazado gAcorazado = new GuerreroAcorazado();
		MagoOscuro magoOscuro = new MagoOscuro();
		Ninja ninja = new Ninja();
		Paladin paladin = new Paladin();
		Sanadora sanadora = new Sanadora();
		
		System.out.println("Oh no! Estan atacando nuestra aldea! Mira! Los habitantes se defienden!");
		mago.atacar();
		bruja.atacar();
		caballero.atacar();
		campesino.atacar();
		guerrero.atacar();
		gAcorazado.atacar();
		magoOscuro.atacar();
		ninja.atacar();
		paladin.atacar();
		sanadora.atacar();
	}

}
