package modelo;

/**
 * Clase que representa un Pokedex 
 */
public class Pokedex {
	/*
	 * ****************************
	 * ATRIBUTOS
	 * ****************************
	 */
	/**
	 * Pokemon 1
	 */
	private Pokemon pokemon1;
	/**
	 * Pokemon 2
	 */
	private Pokemon pokemon2;
	/**
	 * Pokemon 3
	 */
	private Pokemon pokemon3;
	/**
	 * Nombre del dueño del Pokemon
	 */
	private String nombreDuenho;
	/*
	 * ****************************
	 * METODOS
	 * ****************************
	 */
	/**
	 * Método constructor
	 * @param pNombreDuenho nombre del dueño del Pokemon
	 */
	public Pokedex(String pNombreDuenho)
	{
		nombreDuenho = pNombreDuenho;
	}
	/**
	 * Retorna el nombre del nueño
	 * @return nombre del dueño
	 */
	public String darNombreDuenho()
	{
		return nombreDuenho;
	}
	/**
	 * agrega el Pokemon 1 al Pokedex
	 * @param pPokemon nuevo pokemon
	 */
	public void agregarPokemon1(Pokemon pPokemon)
	{
		pokemon1 = pPokemon;
	}
	/**
	 * Agrega el Pokemon 2 al Pokedex
	 * @param pPokemon nuevo pokemon
	 */
	public void agregarPokemon2(Pokemon pPokemon)
	{
		pokemon2 = pPokemon;
	}
	/**
	 * Agrega el Pokemon 3 al Pokedex
	 * @param pPokemon nuevo Pokemon
	 */
	public void agregarPokemon3(Pokemon pPokemon)
	{
		pokemon3 = pPokemon;
	}
	/**
	 * Retorna el Pokemon 1
	 * @return el pokemon
	 */
	public Pokemon darPokemon1()
	{
		return pokemon1;
	}
	/**
	 * Retorna el Pokemon 2
	 * @return el pokemon
	 */
	public Pokemon darPokemon2()
	{
		return pokemon2;
	}
	/**
	 * Retorna el Pokemon 3
	 * @return el pokemon
	 */
	public Pokemon darPokemon3()
	{
		return pokemon3;
	}
	
	public double calcularDanhoPokemon(int pIndicePokemon, int nivel, int ataque)
	{
		double danho = 0;
		if(pIndicePokemon == 1)
		{
			danho = pokemon1.calcularDanho(nivel, ataque);
		}
		else if(pIndicePokemon == 2)
		{
			danho = pokemon2.calcularDanho(nivel, ataque);
		}
		else
		{
			danho = pokemon3.calcularDanho(nivel, ataque);
		}
		return danho;
	}
	public double actualizarVidaPokemon(int pIndicePokemon, double danho)
	{
		if(pIndicePokemon == 1)
		{
			pokemon1.actualizarVida(danho);
		}
		else if(pIndicePokemon == 2)
		{
			pokemon2.actualizarVida(danho);
		}
		else
		{
			pokemon3.actualizarVida(danho);
		}
		return danho;
	}

	
}
