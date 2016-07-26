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
	}

	public static void main(String[] args)
	{
		JuegoPokemon jp = new JuegoPokemon();
	}
}