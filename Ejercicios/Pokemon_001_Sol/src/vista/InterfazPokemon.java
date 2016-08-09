package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controlador.JuegoPokemon;

public class InterfazPokemon extends JFrame {
	
	private JLabel labNombre;
	private ArrayList<PanelPokemonVistaPrevia> vistaPreviaPokemones;
	private JPanel panelVistaPrevia;
	private JuegoPokemon controlador;
	
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
		add(panelScroll, BorderLayout.CENTER);
		
	}
	
	public void actualizarNombrePokedex(String nombreDuenho)
	{
		labNombre.setText(nombreDuenho);
	}
	
	public void agregarPokemonAVistaPrevia(String imagen, String nombre, int tipo, int ataque, int defensa, double puntosDeVida, int nivel)
	{
		PanelPokemonVistaPrevia nuevoPokemon = new PanelPokemonVistaPrevia(this);
		nuevoPokemon.actualizarPanel(imagen, nombre, tipo, ataque, defensa, puntosDeVida, nivel);
		vistaPreviaPokemones.add(nuevoPokemon);
		
	}
	
	public void actualizarVistaPrevia()
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
	
	public JuegoPokemon darControlador()
	{
		return controlador;
	}

	public void mostrarDanho(double danho) {
		JOptionPane.showMessageDialog(this, "El daño de un ataque de:\n Nivel: 1\n Ataque: 40\n seria de: " + danho);
		
	}
	

}
