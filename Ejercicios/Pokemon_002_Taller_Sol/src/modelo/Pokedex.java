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
	
	//TODO B1: Cree los aatributos faltantes
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
	/**
	 * Calcula el daño causado a un Pokemon
	 * @param pIndicePokemon indice del pokemon
	 * @param nivel nivel del pokemon atacante
	 * @param ataque nivel de ataque del pokemon atacante
	 * @return
	 */
	public double calcularDanhoPokemon(int pIndicePokemon, int nivel, int ataque)
	{
		double danho = 0;
		
		//TODO B2: Agregue el código para calcular el daño de un Pokemon dependiendo de su indice
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
	/**
	 * Actualiza el nivel de Vida de un Pokemon dependiendo del tipo. 
	 * <ul>
	 * <li> Tipo agua se agrega 15% de daño
	 * <li> Tipo fuego se agrega 20% de daño
	 * <li> Tipo planta se agrega 25% de daño
	 * </ul>
	 * @param pIndicePokemon indice del Pokemon
	 * @param danho daño causado 
	 * @return
	 */
	public double actualizarVidaPokemon(int pIndicePokemon, double danho)
	{
		//TODO B3: Agregue el código para actualizar la vida del Pokemon
		Pokemon pokemon = null;
		if(pIndicePokemon == 1)
		{
			pokemon = pokemon1;
		}
		else if(pIndicePokemon == 2)
		{
			pokemon = pokemon2;
		}
		else if(pIndicePokemon == 3)
		{
			pokemon = pokemon3;
		}
		
		int tipo = pokemon.darTipo();
		switch(tipo)
		{
		case Pokemon.TIPO_AGUA:
			pokemon.actualizarVida(danho * 1.15);
			break;
		case Pokemon.TIPO_FUEGO:
			pokemon.actualizarVida(danho * 1.20);
			break;
		case Pokemon.TIPO_PLANTA:
			pokemon.actualizarVida(danho * 1.25);
			break;
		}
		return danho;
	}

	
}
