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

	public double atacarPokemon1(int nivel, int pAtaque)
	{
		double danho = pokemon1.calcularDanho(pAtaque);
		pokemon1.actualizarVida(danho);
		return pokemon1.darPuntosDeVida();
	}

	public double atacarPokemon2(int nivel, int pAtaque)
	{
		double danho = pokemon2.calcularDanho(pAtaque);
		pokemon2.actualizarVida(danho);
		return pokemon2.darPuntosDeVida();
	}

	public double atacarPokemon3(int nivel, int pAtaque)
	{
		double danho = pokemon3.calcularDanho(pAtaque);
		pokemon3.actualizarVida(danho);
		return pokemon3.darPuntosDeVida();
	}

	public void subirNivelPokemon1()
	{
		pokemon1.subirNivel();
	}
}