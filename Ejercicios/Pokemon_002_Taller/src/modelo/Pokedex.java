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
	// Revise el diagrama de clases y actualice la clase
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
		// si el indice es 1, se calcula el daño de pokemon1, si es 2 de pokemon2 y si es 3 de pokemon3
		
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
		//La vida del Pokemon se actualiza dependiendo de su tipo
		// Si es tipo agua se multiplica por 1.15
		// Si es tipo fuego se multiplica por 1.20
		// Si es tipo planta se multiplica por 1.25
		
	}

	
}
