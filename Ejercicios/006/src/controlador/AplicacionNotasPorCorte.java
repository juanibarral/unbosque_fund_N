package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Corte;
import modelo.Materia;
import vista.InterfazNotasPorCorte;
/**
 * Clase que controla la comunicación entre la vista y el modelo
 */
public class AplicacionNotasPorCorte implements ActionListener{
	
	// ****************************************************
	// ATRIBUTOS
	// ****************************************************
	private Materia materia;
	private InterfazNotasPorCorte interfaz;
	
	// ****************************************************
	// METODOS
	// ****************************************************
	/**
	 * Metodo constructor<br>
	 * Crea una nueva aplicacion para administrar las notas de una materia
	 */
	public AplicacionNotasPorCorte()
	{
		materia = new Materia("Fundamentos");
		interfaz = new InterfazNotasPorCorte(this);
		
		double porcentajeCorte1 = 0.3;
		double porcentajeCorte2 = 0.3;
		double porcentajeCorte3 = 0.4;
		
		materia.setCorte1(new Corte(porcentajeCorte1));
		materia.setCorte2(new Corte(porcentajeCorte2));
		materia.setCorte3(new Corte(porcentajeCorte3));
		
		interfaz.setMateria(materia.getNombre());
		interfaz.setPorcentajeCorte1(porcentajeCorte1);
		interfaz.setPorcentajeCorte2(porcentajeCorte2);
		interfaz.setPorcentajeCorte3(porcentajeCorte3);
		
		interfaz.setVisible(true);
	}
	
	/**
	 * Metodo main
	 * @param args
	 */
	public static void main(String[] args)
	{
		new AplicacionNotasPorCorte();
	}


	/**
	 * Metodo para atrapar eventos enviados por la interfaz
	 * @param actionEvent evento enviado por la interfaz
	 */
	public void actionPerformed(ActionEvent actionEvent) 
	{
		String actionCommand = actionEvent.getActionCommand();
		if(actionCommand.equals(InterfazNotasPorCorte.CALCULAR_FINAL))
		{
			try {
				double nota1 = interfaz.getNota1();
				double nota2 = interfaz.getNota2();
				double nota3 = interfaz.getNota3();
				materia.setNotaCorte1(nota1);
				materia.setNotaCorte2(nota2);
				materia.setNotaCorte3(nota3);
				double notaFinal = materia.darNotaFinal();
				interfaz.setNotaFinal(notaFinal);
			} catch (Exception e) {
				interfaz.mostrarExcepcion("Algunos de los campos no son números");
			}
		}
		else if(actionCommand.equals(InterfazNotasPorCorte.CALCULAR_NECESARIA))
		{
			try {
				double nota1 = interfaz.getNota1();
				double nota2 = interfaz.getNota2();
				materia.setNotaCorte1(nota1);
				materia.setNotaCorte2(nota2);
				double notaRequerida = interfaz.mostrarDialogoNotaRequerida();
				double notaNecesaria = materia.darNotaNecesaria3Corte(notaRequerida);
				interfaz.mostrarDialogoNotaNecesaria(notaNecesaria);
			}
			catch(Exception e)
			{
				interfaz.mostrarExcepcion("Debe ingresar un número");
			}
		}
		else if(actionCommand.equals(InterfazNotasPorCorte.BORRAR))
		{
			interfaz.borrarNotas();
		}
	}
}
