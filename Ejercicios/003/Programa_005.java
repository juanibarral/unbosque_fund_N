package controlador;

import modelo.*;
import vista.*;

public class Programa_005

{
	public static void main(String[] args)
	{
		Sumadora miPrograma = new Sumadora();
		Interfaz miInterfaz = new Interfaz();
		
		miPrograma.ingresarNumero(38);
		miPrograma.sumar(3);
		miPrograma.multiplicar(2);
		miPrograma.restar(8);
		miPrograma.dividir(2);
		miPrograma.sumar(1);

		miInterfaz.imprimirMensajeEnConsola("El numero inicial fue: " + miPrograma.darMemoria());
		miInterfaz.imprimirMensajeEnConsola("El promedio es: " + miPrograma.calcularPromedioOperaciones());
	}

}