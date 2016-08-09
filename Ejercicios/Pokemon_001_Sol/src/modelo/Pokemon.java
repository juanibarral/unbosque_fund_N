package modelo;

public class Pokemon
{
	public static final int TIPO_AGUA = 0;
	public static final int TIPO_PLANTA = 1;
	public static final int TIPO_FUEGO = 2;
	
	private String nombre;
	private int tipo;
	private int ataque;
	private int defensa;
	private double puntosDeVida;
	private int nivel;
	private String imagen;
	
	

	public Pokemon(String pNombre, int pTipo, int pAtaque, int pDefensa, String pImagen)
	{
		nombre = pNombre;
		tipo = pTipo;
		ataque = pAtaque;
		defensa = pDefensa;
		puntosDeVida = 100;
		nivel = 1;
		imagen = pImagen;
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

	/**
	 * @return the nombre
	 */
	public String darNombre() {
		return nombre;
	}

	/**
	 * @return the tipo
	 */
	public int darTipo() {
		return tipo;
	}

	/**
	 * @return the ataque
	 */
	public int darAtaque() {
		return ataque;
	}

	/**
	 * @return the defensa
	 */
	public int darDefensa() {
		return defensa;
	}

	/**
	 * @return the puntosDeVida
	 */
	public double darPuntosDeVida() {
		return puntosDeVida;
	}

	/**
	 * @return the nivel
	 */
	public int darNivel() {
		return nivel;
	}

	/**
	 * @return the imagen
	 */
	public String darImagen() {
		return imagen;
	}
 	
 	
}