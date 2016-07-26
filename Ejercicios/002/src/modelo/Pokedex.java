package modelo;

public class Pokedex
{
	private String nombre;
	private boolean activo;
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private Pokemon pokemon3;

	public Pokedex(String pNombre)
	{
		nombre = pNombre;
		activo = false;
		pokemon1 = new Pokemon("Squirtle", "Agua", 48, 65);
		pokemon2 = new Pokemon("Bulbazur", "Planta", 49, 49);
		pokemon3 = new Pokemon("Charmander", "Fuego", 52, 43);
	}

	public String listarPokemones()
	{
		String lista = "";
		lista += pokemon1.toString() + "\n";
		lista += pokemon2.toString() + "\n";
		lista += pokemon3.toString() + "\n";

		return lista;
	}
}