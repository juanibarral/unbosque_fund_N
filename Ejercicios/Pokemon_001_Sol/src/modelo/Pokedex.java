package modelo;

public class Pokedex {
	
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private Pokemon pokemon3;
	
	private String nombreDuenho;
	
	public Pokedex(String pNombreDuenho)
	{
		nombreDuenho = pNombreDuenho;
	}
	
	public String darNombreDuenho()
	{
		return nombreDuenho;
	}
	
	public void agregarPokemon1(Pokemon pPokemon)
	{
		pokemon1 = pPokemon;
	}
	
	public void agregarPokemon2(Pokemon pPokemon)
	{
		pokemon2 = pPokemon;
	}
	
	public void agregarPokemon3(Pokemon pPokemon)
	{
		pokemon3 = pPokemon;
	}
	
	public Pokemon darPokemon1()
	{
		return pokemon1;
	}
	
	public Pokemon darPokemon2()
	{
		return pokemon2;
	}
	
	public Pokemon darPokemon3()
	{
		return pokemon3;
	}

	public double calcularDanhoPokemon1 (int nivel, int ataque)
	{
		return pokemon1.calcularDanho(nivel, ataque);
	}
	
	public double calcularDanhoPokemon2 (int nivel, int ataque)
	{
		return pokemon2.calcularDanho(nivel, ataque);
	}
	
	public double calcularDanhoPokemon3 (int nivel, int ataque)
	{
		return pokemon3.calcularDanho(nivel, ataque);
	}
	
}
