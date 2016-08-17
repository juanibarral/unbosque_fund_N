package modelo;

public class Materia {

	private String nombre;
	
	private Corte corte1;
	private Corte corte2;
	private Corte corte3;
	
	public Materia(String pNombre)
	{
		nombre = pNombre;
		corte1 = null;
		corte2 = null;
		corte3 = null;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String pNombre)
	{
		nombre = pNombre;
	}

	public void setCorte1(Corte pCorte1) {
		corte1 = pCorte1;
	}

	
	public void setCorte2(Corte pCorte2) {
		corte2 = pCorte2;
	}


	public void setCorte3(Corte pCorte3) {
		corte3 = pCorte3;
	}
	
	public void setNotaCorte1(double nota)
	{
		corte1.setNota(nota);
	}
	
	public void setNotaCorte2(double nota)
	{
		corte2.setNota(nota);
	}
	
	public void setNotaCorte3(double nota)
	{
		corte3.setNota(nota);
	}
	
	public double darNotaFinal()
	{
		double notaTotal1 = corte1.darNotaCorte();
		double notaTotal2 = corte2.darNotaCorte();
		double notaTotal3 = corte3.darNotaCorte();
		double total = notaTotal1 + notaTotal2 + notaTotal3;
		return  total;
	}
	
	public double darNotaNecesaria3Corte(double notaDeseada)
	{
		double notaActual = corte1.darNotaCorte() + corte2.darNotaCorte();
		double notaNecesaria = (notaDeseada - notaActual) / corte3.getPorcentaje();
		return notaNecesaria;
	}
	
}
