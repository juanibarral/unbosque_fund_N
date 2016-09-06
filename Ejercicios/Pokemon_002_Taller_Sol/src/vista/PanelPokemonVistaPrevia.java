package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.JuegoPokemon;
import modelo.Pokemon;

/**
 * Panel para mostrar la información de un Pokemon 
 */
public class PanelPokemonVistaPrevia extends JPanel {
	/*
	 * ****************************
	 * ATRIBUTOS
	 *****************************
	 */
	/**
	 * Etiquetas de la interfaz
	 */
	private JLabel labImagen;
	private JLabel labNombre;
	private JLabel labTipo;
	private JLabel labAtaque;
	private JLabel labDefensa;
	private JLabel labPuntosDeVida;
	private JButton butCalcularDanho;
	private String nombre;
	/*
	 * ****************************
	 * METODOS
	 * ****************************
	 */
	/**
	 * Método constructor
	 * @param interfaz Interfaz padre
	 */
	public PanelPokemonVistaPrevia(InterfazPokemon interfaz)
	{
		setPreferredSize(new Dimension(0, 250));
		labImagen = new JLabel();
		
		JPanel panelInfo = new JPanel();
		
		labNombre = new JLabel();
		labNombre.setFont(new Font("Verdana", Font.BOLD,24));
		labNombre.setHorizontalAlignment(JLabel.CENTER);
		
		labTipo = new JLabel();
		labAtaque = new JLabel();
		labDefensa = new JLabel();
		labPuntosDeVida = new JLabel();
		
		butCalcularDanho = new JButton("Calcular Danho");
		butCalcularDanho.addActionListener(interfaz);
		
		
		JPanel panelTexto = new JPanel(new GridLayout(4, 2));
		
		panelTexto.add(new JLabel("Tipo: "));
		
		panelTexto.add(labTipo);
		panelTexto.add(new JLabel("Ataque: "));
		panelTexto.add(labAtaque);
		panelTexto.add(new JLabel("Defensa: "));
		panelTexto.add(labDefensa);
		panelTexto.add(new JLabel("Puntos de vida: "));
		panelTexto.add(labPuntosDeVida);
		
		
		panelInfo.add(labNombre, BorderLayout.NORTH);
		panelInfo.add(panelTexto, BorderLayout.CENTER);
		panelInfo.add(butCalcularDanho, BorderLayout.SOUTH);
		
		setLayout(new BorderLayout());
		add(labImagen, BorderLayout.WEST);
		add(panelInfo, BorderLayout.CENTER);
	}
	
	public void inicializarPanel(String imagen, String pNombre, int pTipo, int ataque, int defensa, double puntosDeVida, int nivel)
	{
		nombre = pNombre;
		labImagen.setIcon(new ImageIcon(imagen));
		labNombre.setText(nombre + " Nivel: " + nivel);
		butCalcularDanho.setActionCommand(InterfazPokemon.CALCULAR_DANHO + "_" + pNombre);
		
		String tipo = pTipo + "";
		//TODO D1: Agregue el código para mostrar el tipo del Pokemon un la interfaz
		switch(pTipo)
		{
		case Pokemon.TIPO_AGUA : 
			tipo = "Agua";
			break;
		case Pokemon.TIPO_PLANTA : 
			tipo = "Planta";
			break;
		case Pokemon.TIPO_FUEGO : 
			tipo = "Fuego";
			break;
		}
		labTipo.setText(tipo);
		labAtaque.setText(ataque + "");
		labDefensa.setText(defensa + "");
		DecimalFormat f = new DecimalFormat("###.###");
		labPuntosDeVida.setText(f.format(puntosDeVida) + "");
	}
	
	/**
	 * Actualiza el panel con la información de un Pokmon
	 * @param imagen imagen del Pokemon
	 * @param pNombre nombre del Pokemon
	 * @param pTipo tipo del Pokemon
	 * @param ataque Nivel de ataque del Pokemon
	 * @param defensa Nivel de defensa del Pokemon
	 * @param puntosDeVida Puntos de vida del Pokemon
	 * @param nivel Nivel del Pokemon
	 */
	public void actualizarPanel(double puntosDeVida, int nivel)
	{
		labNombre.setText(nombre + " Nivel: " + nivel);
		DecimalFormat f = new DecimalFormat("###.###");
		labPuntosDeVida.setText(f.format(puntosDeVida) + "");
		
	}
}
