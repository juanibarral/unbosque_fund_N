package controlador;

import modelo.*;

public class JuegoPokemon
{
	private Pokedex pokedex;
	public JuegoPokemon()
	{
		pokedex = new Pokedex("Ash Ketchum");
		pokedex.listPokemons();
	}

	public static void main(String[] args)
	{
		JuegoPokemon jp = new JuegoPokemon();
	}
}