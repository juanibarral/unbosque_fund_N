public class Programa_002
{
	public int sumar(int sumando1, int sumando2)
	{
		return sumando1 + sumando2;
	}
	public static void main(String[] args)
	{
		Programa_002 miPrograma = new Programa_002();
		int resultado = miPrograma.sumar(5,3);
		System.out.println("Resultado: " + resultado);
	}

}
