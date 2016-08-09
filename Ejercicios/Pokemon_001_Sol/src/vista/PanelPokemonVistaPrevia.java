package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.JuegoPokemon;
import modelo.Pokemon;

public class PanelPokemonVistaPrevia extends JPanel {

	private JLabel labImagen;
	private JLabel labNombre;
	private JLabel labTipo;
	private JLabel labAtaque;
	private JLabel labDefensa;
	private JLabel labPuntosDeVida;
	private JButton butCalcularDanho;
	
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
		butCalcularDanho.addActionListener(interfaz.darControlador());
		
		
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
	
	public void actualizarPanel(String imagen, String pNombre, int pTipo, int ataque, int defensa, double puntosDeVida, int nivel)
	{
		labImagen.setIcon(new ImageIcon(imagen));
		labNombre.setText(pNombre + " Nivel: " + nivel);
		butCalcularDanho.setActionCommand(JuegoPokemon.CALCULAR_DANHO + "_" + pNombre);
		
		String tipo = "";
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
		labPuntosDeVida.setText(puntosDeVida + "");
	}
}
