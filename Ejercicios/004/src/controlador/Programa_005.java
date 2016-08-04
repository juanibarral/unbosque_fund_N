package controlador;

import modelo.*;
import vista.*;

public class Programa_005
{
	public static void main(String[] args)
	{
		Sumadora miPrograma = new Sumadora();
		Interfaz miInterfaz = new Interfaz();
		int resultado = miPrograma.sumar(5,3);
		miInterfaz.imprimirMensajeEnConsola("Resultado: " + resultado);
	}

}