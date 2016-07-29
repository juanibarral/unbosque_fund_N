public class Programa_004
{
	public static void main(String[] args)
	{
		Sumadora miPrograma = new Sumadora();
		Interfaz miInterfaz = new Interfaz();
		int resultado = miPrograma.sumar(5,3);
		miInterfaz.imprimirMensajeEnConsola("Resultado: " + resultado);
	}

}