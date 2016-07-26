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
		pokemon1 = new Pokemon("Pikachu", "Electrico", 10, 15);
		pokemon2 = new Pokemon("Bulbazur", "Agua", 20, 25);
		pokemon3 = new Pokemon("Charmander", "Fuego", 30, 35);
	}

	public void listPokemons()
	{
		System.out.println(pokemon1.toString());
		System.out.println(pokemon2.toString());
		System.out.println(pokemon3.toString());
	}
}