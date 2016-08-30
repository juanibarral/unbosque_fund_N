package modelo;
/**
 * Representa una materia con 3 cortes
 */
public class Materia {
	
	// ****************************************************
	// CONSTANTES
	// ****************************************************
	//TODO B1. Agregue las variables inmutables necesarias
	//TODO B4. Agregue las constantes necesarias
	// ****************************************************
	// ATRIBUTOS
	// ****************************************************
	/**
	 * El nombre de la materia
	 */
	private String nombre;
	/**
	 * El primer corte de la materia
	 */
	private Corte corte1;
	/**
	 * El segundo corte de la materia 
	 */
	private Corte corte2;
	/**
	 * El tercer corte de la materia
	 */
	private Corte corte3;
	//TODO B3. Agregue un nuevo atributo llamado tipoMateria de tipo entero
	
	// ****************************************************
	// METODOS
	// ****************************************************
	/**
	 * Metodo constructor <br>
	 * Crea una nueva materia dado su nombre
	 * @param pNombre nombre de la materia
	 */
	public Materia(String pNombre)
	{
		nombre = pNombre;
		corte1 = null;
		corte2 = null;
		corte3 = null;
	}
	/**
	 * Retorna el nombre de la materia
	 * @return nombre de la materia
	 */
	public String getNombre()
	{
		return nombre;
	}
	/**
	 * Actualiza el nombre de la materia
	 * @param pNombre nombre de la materia
	 */
	public void setNombre(String pNombre)
	{
		nombre = pNombre;
	}
	/**
	 * Actualiza el primer corte de la materia
	 * @param pCorte1 corte de la materia
	 */
	public void setCorte1(Corte pCorte1) {
		corte1 = pCorte1;
	}
	/**
	 * Actualiza el segundo corte de la materia
	 * @param pCorte1 corte de la materia
	 */
	public void setCorte2(Corte pCorte2) {
		corte2 = pCorte2;
	}

	/**
	 * Actualiza el tercer corte de la materia
	 * @param pCorte1 corte de la materia
	 */
	public void setCorte3(Corte pCorte3) {
		corte3 = pCorte3;
	}
	/**
	 * Actualizar la nota del primer corte
	 * @param nota nota del corte
	 */
	public void setNotaCorte1(double nota)
	{
		corte1.setNota(nota);
	}
	/**
	 * Actualizar la nota del segundo corte
	 * @param nota nota del corte
	 */
	public void setNotaCorte2(double nota)
	{
		corte2.setNota(nota);
	}
	/**
	 * Actualizar la nota del tercer corte
	 * @param nota nota del corte
	 */
	public void setNotaCorte3(double nota)
	{
		corte3.setNota(nota);
	}
	
	/**
	 * Retorna la nota final de la materia
	 * @return nota final de la materia
	 */
	public double darNotaFinal()
	{
		double notaTotal1 = corte1.darNotaCorte();
		double notaTotal2 = corte2.darNotaCorte();
		double notaTotal3 = corte3.darNotaCorte();
		double total = notaTotal1 + notaTotal2 + notaTotal3;
		return  total;
	}
	/**
	 * Retorna la nota que se necesita en el tercer corte para obtener la nota ingresada por parámetro 
	 * @param notaDeseada nota que se desea obtener
	 * @return la nota necesaria en el tercer corte
	 */
	public double darNotaNecesaria3Corte(double notaDeseada)
	{
		double notaActual = corte1.darNotaCorte() + corte2.darNotaCorte();
		double notaNecesaria = (notaDeseada - notaActual) / corte3.getPorcentaje();
		
		//TODO B5. 
		return notaNecesaria;
	}
	//B2. Cree el método retornarMensajePorNotaFinal
}
