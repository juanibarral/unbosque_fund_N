package modelo;

public class Corte {

	private double nota;
	private double porcentaje;
	
	public Corte(double pPorcentaje)
	{
		nota = 0;
		porcentaje = pPorcentaje;
	}
	
	public void setNota(double pNota)
	{
		nota = pNota;
	}
	
	public double getPorcentaje()
	{
		return porcentaje;
	}
	
	public double darNotaCorte()
	{
		return nota * porcentaje;
	}
}
