package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Pokedex;
import modelo.Pokemon;
import vista.InterfazPokemon;

public class JuegoPokemon implements ActionListener{
	
	private Pokedex pokedex;
	private InterfazPokemon interfaz;
	
	public static final String CALCULAR_DANHO = "Calcular danho";
	
	public JuegoPokemon()
	{
		pokedex = new Pokedex("Ash Ketchum");
		interfaz = new InterfazPokemon(this);
		interfaz.setVisible(true);
		
		pokedex.agregarPokemon1(new Pokemon("Squirtle", Pokemon.TIPO_AGUA, 48, 65, "data/imagenes/squirtle.jpeg"));
		pokedex.agregarPokemon2(new Pokemon("Bulbasaur", Pokemon.TIPO_PLANTA, 49, 49, "data/imagenes/bulbasaur.jpeg"));
		pokedex.agregarPokemon3(new Pokemon("Charmander", Pokemon.TIPO_FUEGO, 52, 43, "data/imagenes/charmander.jpeg"));
	
		
		
	}
	
	public void actualizarPokedex()
	{
		interfaz.actualizarNombrePokedex(pokedex.darNombreDuenho());
		
		Pokemon pokemon1 = pokedex.darPokemon1();
		Pokemon pokemon2 = pokedex.darPokemon2();
		Pokemon pokemon3 = pokedex.darPokemon3();
		
		interfaz.agregarPokemonAVistaPrevia(pokemon1.darImagen(), pokemon1.darNombre(), pokemon1.darTipo(), pokemon1.darAtaque(), pokemon1.darDefensa(), pokemon1.darPuntosDeVida(), pokemon1.darNivel());
		interfaz.agregarPokemonAVistaPrevia(pokemon2.darImagen(), pokemon2.darNombre(), pokemon2.darTipo(), pokemon2.darAtaque(), pokemon2.darDefensa(), pokemon2.darPuntosDeVida(), pokemon2.darNivel());
		interfaz.agregarPokemonAVistaPrevia(pokemon3.darImagen(), pokemon3.darNombre(), pokemon3.darTipo(), pokemon3.darAtaque(), pokemon3.darDefensa(), pokemon3.darPuntosDeVida(), pokemon3.darNivel());
		
		interfaz.actualizarVistaPrevia();
	}
	
	

	public static void main(String[] args) {
	
		JuegoPokemon controlador = new JuegoPokemon();
		controlador.actualizarPokedex();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.contains(CALCULAR_DANHO + "_Squirtle"))
		{
			double danho = pokedex.calcularDanhoPokemon1(1, 40);
			interfaz.mostrarDanho(danho);
		}
		else if(comando.contains(CALCULAR_DANHO + "_Bulbasaur"))
		{
			double danho = pokedex.calcularDanhoPokemon2(1, 40);
			interfaz.mostrarDanho(danho);
		}
		else if(comando.contains(CALCULAR_DANHO + "_Charmander"))
		{
			double danho = pokedex.calcularDanhoPokemon3(1, 40);
			interfaz.mostrarDanho(danho);
		}
		
	}

}
