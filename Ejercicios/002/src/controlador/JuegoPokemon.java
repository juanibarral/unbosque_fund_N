package controlador;

import modelo.*;

public class JuegoPokemon
{
	private Pokedex pokedex;
	public JuegoPokemon()
	{
		pokedex = new Pokedex("Ash Ketchum");
		String lista = pokedex.listarPokemones();
		System.out.println(lista);
	}

	public static void main(String[] args)
	{
		JuegoPokemon jp = new JuegoPokemon();
	}
}