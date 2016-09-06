package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		pokedex.agregarPokemon1(new Pokemon("Squirtle", Pokemon.TIPO_AGUA, 48, 65, "data/imagenes/squirtle.jpeg"));
		pokedex.agregarPokemon2(new Pokemon("Bulbasaur", Pokemon.TIPO_PLANTA, 49, 49, "data/imagenes/bulbasaur.jpeg"));
		pokedex.agregarPokemon3(new Pokemon("Charmander", Pokemon.TIPO_FUEGO, 52, 43, "data/imagenes/charmander.jpeg"));
	
		
		
	}
	/**
	 * Actualiza la información del Pokedex
	 */
	public void inicializarPokedex()
	{
		interfaz.actualizarNombrePokedex(pokedex.darNombreDuenho());
		
		Pokemon pokemon1 = pokedex.darPokemon1();
		Pokemon pokemon2 = pokedex.darPokemon2();
		Pokemon pokemon3 = pokedex.darPokemon3();
		
		interfaz.agregarPokemonAVistaPrevia(pokemon1.darImagen(), pokemon1.darNombre(), pokemon1.darTipo(), pokemon1.darAtaque(), pokemon1.darDefensa(), pokemon1.darPuntosDeVida(), pokemon1.darNivel());
		interfaz.agregarPokemonAVistaPrevia(pokemon2.darImagen(), pokemon2.darNombre(), pokemon2.darTipo(), pokemon2.darAtaque(), pokemon2.darDefensa(), pokemon2.darPuntosDeVida(), pokemon2.darNivel());
		interfaz.agregarPokemonAVistaPrevia(pokemon3.darImagen(), pokemon3.darNombre(), pokemon3.darTipo(), pokemon3.darAtaque(), pokemon3.darDefensa(), pokemon3.darPuntosDeVida(), pokemon3.darNivel());
		
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
		controlador.inicializarPokedex();
	}

}
