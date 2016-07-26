package modelo;

public class Pokemon
{
	private String nombre;
	private String tipo;
	private int ataque;
	private int defensa;
	private int puntosDeVida;

	public Pokemon(String pNombre, String pTipo, int pAtaque, int pDefensa)
	{
		nombre = pNombre;
		tipo = pTipo;
		ataque = pAtaque;
		defensa = pDefensa;
		puntosDeVida = 100;
	}

	public String toString()
	{
		return nombre + " " + tipo + " " + ataque + " " + defensa;
	}

}