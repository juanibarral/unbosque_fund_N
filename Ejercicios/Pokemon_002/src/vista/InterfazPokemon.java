package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controlador.JuegoPokemon;

/**
 * Clase que representa la interfaz de usuario del juego Pokemon 
 */
public class InterfazPokemon extends JFrame implements ActionListener{
	
	/*
	 * ****************************
	 * CONSTANTES
	 * ****************************
	 */
	/**
	 * Constante para manejar el evento de calcular el danho de un Pokemon
	 */
	public static final String CALCULAR_DANHO = "Calcular danho";
	/*
	 * ****************************
	 * ATRIBUTOS
	 * ****************************
	 */
	/**
	 * Etiqueta para mostrar el nombre del duenho del pokedex
	 */
	private JLabel labNombre;
	/**
	 * Vector de vistas previas de los pokemones
	 */
	private ArrayList<PanelPokemonVistaPrevia> vistaPreviaPokemones;
	/**
	 * Panel para mostrar las vistas previas de los pokemones
	 */
	private JPanel panelVistaPrevia;
	/**
	 * Controlador
	 */
	private JuegoPokemon controlador;
	/*
	 * ****************************
	 * METODOS
	 * ****************************
	 */
	/**
	 * Método constructor
	 * @param pControlador controlador
	 */
	public InterfazPokemon(JuegoPokemon pControlador)
	{
		controlador = pControlador;
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labNombre = new JLabel();
		labNombre.setFont(new Font("Verdana", Font.BOLD,24));
		labNombre.setHorizontalAlignment(JLabel.CENTER);
		
		vistaPreviaPokemones = new ArrayList<PanelPokemonVistaPrevia>();
		
		panelVistaPrevia = new JPanel();
		
		JScrollPane panelScroll = new JScrollPane(panelVistaPrevia, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		setLayout(new BorderLayout());
		add(labNombre, BorderLayout.NORTH);
		add(panelVistaPrevia, BorderLayout.CENTER);
		
	}
	/**
	 * Actualiza el nombre del duenho del pokedex
	 * @param nombreDuenho nombre del dueño
	 */
	public void actualizarNombrePokedex(String nombreDuenho)
	{
		labNombre.setText(nombreDuenho);
	}
	/**
	 * Agrega un nuevo Pokemon a la vista previa
	 * @param imagen imagen del Pokemon
	 * @param nombre nombre del Pokemon
	 * @param tipo tipo del Pokemon
	 * @param ataque Nivel de ataque del Pokemon
	 * @param defensa Nivel de defensa del Pokemon
	 * @param puntosDeVida Puntos de vida del Pokemon
	 * @param nivel Nivel del Pokemon
	 */
	public void agregarPokemonAVistaPrevia(String imagen, String nombre, int tipo, int ataque, int defensa, double puntosDeVida, int nivel)
	{
		PanelPokemonVistaPrevia nuevoPokemon = new PanelPokemonVistaPrevia(this);
		nuevoPokemon.inicializarPanel(imagen, nombre, tipo, ataque, defensa, puntosDeVida, nivel);
		vistaPreviaPokemones.add(nuevoPokemon);
		
	}
	/**
	 * Refresca la vista previa del Pokemon
	 */
	public void refrescarVistaPrevia()
	{
		panelVistaPrevia.removeAll();
		panelVistaPrevia.setLayout(new GridLayout(vistaPreviaPokemones.size(), 1));
		panelVistaPrevia.setPreferredSize(new Dimension(0, 250 * vistaPreviaPokemones.size()));
		for(int i = 0; i < vistaPreviaPokemones.size(); i++)
		{
			panelVistaPrevia.add(vistaPreviaPokemones.get(i));
		}
		
		panelVistaPrevia.validate();
		panelVistaPrevia.repaint();
	}
	/**
	 * Retorna el controlador asociado a esta interfaz
	 * @return el controlador
	 */
	public JuegoPokemon darControlador()
	{
		return controlador;
	}
	/**
	 * Muestra el daño causado a un Pokemon
	 * @param danho nivel del daño
	 */
	public void mostrarDanho(double danho, int nivel, int ataque) {
		DecimalFormat f = new DecimalFormat("###.###");
		JOptionPane.showMessageDialog(this, "El daño de un ataque de:\n Nivel: " + nivel + "\n Ataque: "+ ataque+"\n seria de: " + f.format(danho));
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.contains(CALCULAR_DANHO + "_Squirtle"))
		{
			DialogoAtaque dialogo = new DialogoAtaque(1, this);
			dialogo.setVisible(true);
		}
		else if(comando.contains(CALCULAR_DANHO + "_Bulbasaur"))
		{
			DialogoAtaque dialogo = new DialogoAtaque(2, this);
			dialogo.setVisible(true);
		}
		else if(comando.contains(CALCULAR_DANHO + "_Charmander"))
		{
			DialogoAtaque dialogo = new DialogoAtaque(3, this);
			dialogo.setVisible(true);
		}
		
	}
	
	public void atacar(int indicePokemon, int nivelPokemon, int nivelAtaque)
	{
		controlador.atacarPokemon(indicePokemon, nivelPokemon, nivelAtaque);
	}
	
	public void actualizarPokemon(int indice, double puntosDeVida, int nivel)
	{
		vistaPreviaPokemones.get(indice - 1).actualizarPanel(puntosDeVida, nivel); 
	}

}
