package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DialogoAtaque extends JDialog implements ActionListener{

	private static final String ACEPTAR = "Aceptar";
	private static final String CANCELAR = "Cancelar";
	
	private InterfazPokemon interfaz;
	private JTextField txtNivel;
	private JTextField txtAtaque;
	private JButton butAceptar;
	private JButton butCancelar;
	private int indicePokemon;
	
	
	public DialogoAtaque(int pIndicePokemon, InterfazPokemon pInterfaz) {
		indicePokemon = pIndicePokemon;
		interfaz = pInterfaz;
		setLayout(new GridLayout(3, 2));
		setSize(300,150);
		
		txtNivel = new JTextField();
		txtAtaque = new JTextField();
		butAceptar = new JButton(ACEPTAR);
		butAceptar.addActionListener(this);
		butAceptar.setActionCommand(ACEPTAR);
		butCancelar = new JButton(CANCELAR);
		butCancelar.addActionListener(this);
		butCancelar.setActionCommand(CANCELAR);
		
		add(new JLabel("Nivel de Pokemon"));
		add(txtNivel);
		add(new JLabel("Nivel de ataque"));
		add(txtAtaque);
		add(butCancelar);
		add(butAceptar);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if(command.equals(ACEPTAR))
		{
			try
			{
				int nivelPokemon = Integer.parseInt(txtNivel.getText());
				int nivelAtaque = Integer.parseInt(txtAtaque.getText());
				interfaz.atacar(indicePokemon, nivelPokemon, nivelAtaque);
				dispose();
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(this, "El nivel y el ataque deben ser números enteros");
			}
		}
		else if(command.equals(CANCELAR))
		{
			dispose();
		}
		
	}

}
