public class Sumadora
{
	private int memoria;
	private int operaciones;

	public Sumadora()
	{
		memoria = 0;
		operaciones = 0;
	}

	public void reiniciar()
	{
		memoria = 0;
		operaciones = 0;
	}

	public int darMemoria()
	{
		return memoria;
	}

	public void sumar(int numero)
	{
		operaciones++;
		memoria += numero;
	}

	public void restar(int numero)
	{
		operaciones++;
		memoria -= numero;
	}

	public void multiplicar(int numero)
	{
		operaciones++;
		memoria *= numero;
	}

	public void dividir(int numero)
	{
		operaciones++;
		memoria /= numero;
	}

	public int darOperaciones()
	{
		return operaciones;
	}

	public void ingresarNumero(int numero)
	{
		memoria = numero;
	}

	public double calcularPromedioOperaciones()
	{
		double promedio = (double)memoria / (double)operaciones;
		return promedio;
	}
}