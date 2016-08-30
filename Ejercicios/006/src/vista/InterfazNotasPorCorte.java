package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.AplicacionNotasPorCorte;
/**
 * Clase que representa la interfaz de la aplicación
 */
public class InterfazNotasPorCorte extends JFrame{

	// ****************************************************
	// CONSTANTES
	// ****************************************************
	/**
	 * Comando para el boton de calcular nota final	
	 */
	public final static String CALCULAR_FINAL = "Calcular nota final";
	/**
	 * Comando para el boton calcular la nota necesaria
	 */
	public final static String CALCULAR_NECESARIA = "Calcular nota necesaria";
	/**
	 * Comando para el boton de borrar
	 */
	public final static String BORRAR = "Borrar";
	// ****************************************************
	// ATRIBUTOS
	// ****************************************************
	/**
	 * Boton para calcular la nota final
	 */
	private JButton butCalcularFinal;
	/**
	 * Boton para calcular la nota necesaria en el 3er corte
	 */
	private JButton butCalcularNecesaria;
	/**
	 * Boton para borrar
	 */
	private JButton butBorrar;
	/**
	 * Campo de texto para el corte 1
	 */
	private JTextField txtCorte1;
	/**
	 * Campo de texto para el corte 2
	 */
	private JTextField txtCorte2;
	/**
	 * Campo de texto para el corte 3
	 */
	private JTextField txtCorte3;
	/**
	 * Etiqueta para el porcentaje 1
	 */
	private JLabel labCorte1Porcentaje;
	/**
	 * Etiqueta para el porcentaje 2
	 */
	private JLabel labCorte2Porcentaje;
	/**
	 * Etiqueta para el porcentaje 3
	 */
	private JLabel labCorte3Porcentaje;
	/**
	 * Etiqueta para la nota final
	 */
	private JLabel labFinal;
	/**
	 * Etiqueta para el nombre de la materia
	 */
	private JLabel labMateria;
	
	// ****************************************************
	// METODOS
	// ****************************************************
	/**
	 * Metodo constructor <br>
	 * Crea una nueva interfaz para la aplicacion
	 * @param pControlador controlador de la aplicacion
	 */
	public InterfazNotasPorCorte(AplicacionNotasPorCorte pControlador)
	{
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labMateria = new JLabel();
		labMateria.setHorizontalAlignment(JLabel.CENTER);
		labMateria.setFont(new Font("Verdana", Font.BOLD, 20));
		
		txtCorte1 = new JTextField();
		txtCorte1.setHorizontalAlignment(JLabel.RIGHT);
		txtCorte2 = new JTextField();
		txtCorte2.setHorizontalAlignment(JLabel.RIGHT);
		txtCorte3 = new JTextField();
		txtCorte3.setHorizontalAlignment(JLabel.RIGHT);
		
		labFinal = new JLabel();
		labFinal.setFont(new Font("Verdana", Font.BOLD, 14));
		labFinal.setHorizontalAlignment(JLabel.RIGHT);
		labCorte1Porcentaje = new JLabel();
		labCorte1Porcentaje.setHorizontalAlignment(JLabel.CENTER);
		labCorte2Porcentaje = new JLabel();
		labCorte2Porcentaje.setHorizontalAlignment(JLabel.CENTER);
		labCorte3Porcentaje = new JLabel();
		labCorte3Porcentaje.setHorizontalAlignment(JLabel.CENTER);
		
		butBorrar = new JButton(BORRAR);
		butBorrar.setActionCommand(BORRAR);
		butBorrar.addActionListener(pControlador);
		
		JPanel panelCortes = new JPanel(new GridLayout(4, 3));
		panelCortes.add(new JLabel("Corte 1: "));
		panelCortes.add(txtCorte1);
		panelCortes.add(labCorte1Porcentaje);
		panelCortes.add(new JLabel("Corte 2: "));
		panelCortes.add(txtCorte2);
		panelCortes.add(labCorte2Porcentaje);
		panelCortes.add(new JLabel("Corte 3: "));
		panelCortes.add(txtCorte3);
		panelCortes.add(labCorte3Porcentaje);
		panelCortes.add(new JLabel("Final: "));
		panelCortes.add(labFinal);
		panelCortes.add(butBorrar);
		
		
		butCalcularNecesaria = new JButton(CALCULAR_NECESARIA);
		butCalcularNecesaria.setActionCommand(CALCULAR_NECESARIA);
		butCalcularNecesaria.addActionListener(pControlador);
		
		butCalcularFinal = new JButton(CALCULAR_FINAL);
		butCalcularFinal.setActionCommand(CALCULAR_FINAL);
		butCalcularFinal.addActionListener(pControlador);
		
		JPanel panelBotones = new JPanel(new GridLayout(2, 1));
		panelBotones.add(butCalcularFinal);
		panelBotones.add(butCalcularNecesaria);
		
		setLayout(new BorderLayout());
		add(labMateria, BorderLayout.NORTH);
		add(panelCortes, BorderLayout.CENTER);
		add(panelBotones, BorderLayout.SOUTH);
		
	}
	/**
	 * Actualiza el nombre de la materia
	 * @param nombreMateria nombre de la materia
	 */
	public void setMateria(String nombreMateria)
	{
		labMateria.setText(nombreMateria);
	}
	/**
	 * Actualiza el valor del procentaje del corte 1
	 * @param porcentaje valor del procentaje
	 */
	public void setPorcentajeCorte1(double porcentaje)
	{
		labCorte1Porcentaje.setText((porcentaje * 100) + " %");
	}
	/**
	 * Actualiza el valor del procentaje del corte 2
	 * @param porcentaje valor del procentaje
	 */
	public void setPorcentajeCorte2(double porcentaje)
	{
		labCorte2Porcentaje.setText((porcentaje * 100) + " %");
	}
	/**
	 * Actualiza el valor del procentaje del corte 3
	 * @param porcentaje valor del procentaje
	 */
	public void setPorcentajeCorte3(double porcentaje)
	{
		labCorte3Porcentaje.setText((porcentaje * 100) + " %");
	}
	/**
	 * Retorna la nota que se encuentra en el campo de la nota 1
	 * @return la nota ingresada en el campo
	 * @throws Exception si la nota ingresada no es un número
	 */
	public double getNota1() throws Exception
	{
		double nota = Double.parseDouble(txtCorte1.getText());
		return nota;
	}
	/**
	 * Retorna la nota que se encuentra en el campo de la nota 2
	 * @return la nota ingresada en el campo
	 * @throws Exception si la nota ingresada no es un número
	 */	
	public double getNota2() throws Exception
	{
		double nota = Double.parseDouble(txtCorte2.getText());
		return nota;
	}
	/**
	 * Retorna la nota que se encuentra en el campo de la nota 3
	 * @return la nota ingresada en el campo
	 * @throws Exception si la nota ingresada no es un número
	 */
	public double getNota3() throws Exception
	{
		double nota = Double.parseDouble(txtCorte3.getText());
		return nota;
	}
	/**
	 * Borra los campos de texto de las notas
	 */
	public void borrarNotas()
	{
		txtCorte1.setText("");
		txtCorte2.setText("");
		txtCorte3.setText("");
		labFinal.setText("");
	}
	/**
	 * Actualiza la nota final
	 * @param notaFinal nota final
	 */
	public void setNotaFinal(double notaFinal)
	{
		labFinal.setText(notaFinal + "");
	}
	/**
	 * Muestra el dialogo para ingresar la nota deseada
	 * @return la nota que se desea
	 * @throws Exception si la nota ingresada no es válida
	 */
	public double mostrarDialogoNotaRequerida() throws Exception
	{
		double notaRequerida = -1.0;
		String notaNecesaria = JOptionPane.showInputDialog(this, "Ingrese la nota que quiere sacar en el corte 3", "");
		if(notaNecesaria != null)
		{
			notaRequerida = Double.parseDouble(notaNecesaria);
		}
		
		return notaRequerida;
	}
	/**
	 * Muestra el dialogo de la nota necesaria
	 * @param notaNecesaria la nota necesaria
	 */
	public void mostrarDialogoNotaNecesaria(double notaNecesaria)
	{
		JOptionPane.showMessageDialog(this, "La nota necesaria es: " + notaNecesaria);
	}
	/**
	 * Muestra un mensaje de excepción
	 * @param mensaje el mensaje de excepción
	 */
	public void mostrarExcepcion(String mensaje)
	{
		JOptionPane.showMessageDialog(this, mensaje);
	}
}
