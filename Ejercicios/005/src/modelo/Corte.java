package modelo;
/**
 * Clase que representa un corte de una materia
 */
public class Corte {
	
	// ****************************************************
	// 	ATRIBUTOS
	// ****************************************************
	
	/**
	 * la nota del corte. Su valor debe estar entre 0.0 y 5.0
	 */
	private double nota;
	/**
	 * Porcentaje en la nota final. Su valor debe estar entre 0.0 y 1.0
	 */
	private double porcentaje;
	// ****************************************************
	// METODOS
	// ****************************************************
	/**
	 * Metodo constructor <br>
	 * Crea un nuevo corte con un porcentaje
	 * @param pPorcentaje porcentaje del corte
	 */
	public Corte(double pPorcentaje)
	{
		nota = 0;
		porcentaje = pPorcentaje;
	}
	/**
	 * Actualiza la nota del corte
	 * @param pNota nota del corte
	 */
	public void setNota(double pNota)
	{
		nota = pNota;
	}
	/**
	 * Retorna el porcentaje del corte
	 * @return procentaje del corte
	 */
	public double getPorcentaje()
	{
		return porcentaje;
	}
	/**
	 * Retorna la nota real del corte<br>
	 * La nota real es la nota multiplicada por su porcentaje
	 * @return nota real
	 */
	public double darNotaCorte()
	{
		return nota * porcentaje;
	}
}
