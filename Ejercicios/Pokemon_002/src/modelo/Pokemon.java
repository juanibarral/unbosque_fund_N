package modelo;

public class Pokemon
{
	/*
	 * ****************************
	 * CONSTANTES
	 * ****************************
	 */
	public static final int TIPO_AGUA = 0;
	public static final int TIPO_PLANTA = 1;
	public static final int TIPO_FUEGO = 2;
	
	/*
	 * ****************************
	 * ATRIBUTOS
	 * ****************************
	 */
	
	private String nombre;
	private int tipo;
	private int ataque;
	private int defensa;
	private double puntosDeVida;
	private int nivel;
	private String imagen;
	
	/*
	 * ****************************
	 * METODOS
	 * ****************************
	 */
	
	/**
	 * Método constructor
	 * @param pNombre nombre del pokemon
	 * @param pTipo tipo del Pokemon
	 * @param pAtaque Nivel de ataque del Pokemon
	 * @param pDefensa Nivel de defensa del Pokemon
	 * @param pImagen Imagen del Pokemon
	 */
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
	/**
	 * Representa el Pokemon en un String
	 */
	public String toString()
	{
		return nombre + " " + tipo + " " + ataque + " " + defensa;
	}
	/**
	 * Sube el nivel del Pokemon en 1
	 */
	public void subirNivel()
	{
		nivel++;
	}
	/**
	 * Calcula el daño que tendría el Pokemon si lo atacan
	 * @param pNivel Nivel del atacante
	 * @param pAtaque Nivel de ataque del atacante
	 * @return daño que se causaría al Pokemon
	 */
	public double calcularDanho(int pNivel, int pAtaque)
	{
		double danho = ((2 * pNivel + 10) / 250.0) * ((double)pAtaque / (double)defensa);
		return danho;
 	}
	/**
	 * Actualiza el nivel de vida del Pokemon
	 * @param danho daño al Pokemon
	 */
 	public void actualizarVida(double danho)
 	{
 		puntosDeVida -= danho;
 	}

	/**
	 * Retorna el nombre del Pokemon
	 * @return nombre del Pokemon
	 */
	public String darNombre() {
		return nombre;
	}

	/**
	 * Retorna el tipo del Pokemon
	 * @return tipo del Pokemon
	 */
	public int darTipo() {
		return tipo;
	}

	/**
	 * Retorna el nivel de atque del Pokemon
	 * @return nivel de ataque del Pokemon
	 */
	public int darAtaque() {
		return ataque;
	}

	/**
	 * Retorna el nivel de defensa del Pokemon
	 * @return Nivel de defensa del Pokemon
	 */
	public int darDefensa() {
		return defensa;
	}

	/**
	 * Retorna los puntos de vida del Pokemon
	 * @return Puntos de vida del Pokemon
	 */
	public double darPuntosDeVida() {
		return puntosDeVida;
	}

	/**
	 * Retorna el nivel del Pokemon
	 * @return nivel del Pokemon
	 */
	public int darNivel() {
		return nivel;
	}

	/**
	 * Retorna el path de la imagen del Pokemon
	 * @return path de la imagen
	 */
	public String darImagen() {
		return imagen;
	}
 	
 	
}