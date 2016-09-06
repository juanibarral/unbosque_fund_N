package controlador;

import modelo.Pokedex;
import modelo.Pokemon;
import vista.InterfazPokemon;

/**
 * Clase principal del controlador
 */
public class JuegoPokemon{


	/*
	 * ****************************
	 * ATRIBUTOS
	 * ****************************
	 */
	/**
	 * Pokedex (modelo)
	 */
	private Pokedex pokedex;
	/**
	 * GUI (vista)
	 */
	private InterfazPokemon interfaz;
	
	/*
	 * ****************************
	 * METODOS
	 * ****************************
	 */
	/**
	 * Método constructor
	 */
	public JuegoPokemon()
	{
		pokedex = new Pokedex("Ash Ketchum");
		interfaz = new InterfazPokemon(this);
		interfaz.setVisible(true);
		
		//TODO A1: Cree 3 nuevos Pokemones y agreguelos a la pokedex
		
		
	}
	/**
	 * Inicializa la información del Pokedex en la interfaz
	 */
	public void inicializarPokedexEnGUI()
	{
		interfaz.actualizarNombrePokedex(pokedex.darNombreDuenho());
		
		//TODO A2. Escriba el código para inicializar la información del Pokedex.
		// Traiga del pokedex los pokemones
		// agregue la información de los pokemones a la interfaz usando el método de agregarPokemonAVistaPrevia
		
		
		interfaz.refrescarVistaPrevia();
	}
	
	public void actualizarPokedex()
	{
		Pokemon pokemon = pokedex.darPokemon1();
		interfaz.actualizarPokemon(1, pokemon.darPuntosDeVida(), pokemon.darNivel());
		pokemon = pokedex.darPokemon2();
		interfaz.actualizarPokemon(2, pokemon.darPuntosDeVida(), pokemon.darNivel());
		pokemon = pokedex.darPokemon3();
		interfaz.actualizarPokemon(3, pokemon.darPuntosDeVida(), pokemon.darNivel());
	}

	public void atacarPokemon(int pIndicePokemon, int pNivel, int pAtaque)
	{
		double danho =pokedex.calcularDanhoPokemon(pIndicePokemon, pNivel, pAtaque);
		interfaz.mostrarDanho(danho, pNivel, pAtaque);
		pokedex.actualizarVidaPokemon(pIndicePokemon, danho);
		actualizarPokedex();
	}
	/**
	 * Punto inicial del Programa
	 * @param args
	 */
	public static void main(String[] args) {
	
		JuegoPokemon controlador = new JuegoPokemon();
		controlador.inicializarPokedexEnGUI();
	}

}
