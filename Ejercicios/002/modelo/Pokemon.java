package modelo;

public class Pokemon
{
	private String nombre;
	private String tipo;
	private int ataque;
	private int defensa;

	public Pokemon(String pNombre, String pTipo, int pAtaque, int pDefensa)
	{
		nombre = pNombre;
		tipo = pTipo;
		ataque = pAtaque;
		defensa = pDefensa;
	}

	public String toString()
	{
		return nombre + “ “ + pTipo + “ “ + pAtaque + “ “ + pDefensa;
	}

}