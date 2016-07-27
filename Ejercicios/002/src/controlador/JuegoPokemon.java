package controlador;

import modelo.*;
import vista.*;

public class JuegoPokemon
{
	private Pokedex pokedex;
	private InterfazPokemon interfaz;
	public JuegoPokemon()
	{
		pokedex = new Pokedex("Ash Ketchum");
		interfaz = new InterfazPokemon();
		String lista = pokedex.listarPokemones();
		interfaz.imprimirEnConsola(lista);

		pokedex.subirNivelPokemon1();

		double puntos = pokedex.atacarPokemon1(1, 50);
		interfaz.imprimirEnConsola("Vida Pokemon1: " + puntos);
		puntos = pokedex.atacarPokemon2(1, 50);
		interfaz.imprimirEnConsola("Vida Pokemon2: " + puntos);
		puntos = pokedex.atacarPokemon3(1, 50);
		interfaz.imprimirEnConsola("Vida Pokemon3: " + puntos);
	}

	public static void main(String[] args)
	{
		JuegoPokemon jp = new JuegoPokemon();
	}
}