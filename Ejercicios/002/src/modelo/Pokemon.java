package modelo;

public class Pokemon
{
	private String nombre;
	private String tipo;
	private int ataque;
	private int defensa;
	private double puntosDeVida;
	private int nivel;

	public Pokemon(String pNombre, String pTipo, int pAtaque, int pDefensa)
	{
		nombre = pNombre;
		tipo = pTipo;
		ataque = pAtaque;
		defensa = pDefensa;
		puntosDeVida = 100;
		nivel = 1;
	}

	public String toString()
	{
		return nombre + " " + tipo + " " + ataque + " " + defensa;
	}

	public void subirNivel()
	{
		nivel++;
	}

	public double calcularDanho(int pNivel, int pAtaque)
	{
		double danho = ((2 * pNivel + 10) / 250.0) * ((double)pAtaque / (double)defensa);
		return danho;
 	}

 	public void actualizarVida(double danho)
 	{
 		puntosDeVida -= danho;
 	}

 	public double darPuntosDeVida()
 	{
 		return puntosDeVida;
 	}
}