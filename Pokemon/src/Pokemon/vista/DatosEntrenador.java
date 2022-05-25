package Pokemon.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosEntrenador extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosEntrenador frame = new DatosEntrenador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DatosEntrenador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Datos del entrenador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 180, 22);
		getContentPane().add(lblNewLabel);

		JButton btnNuevoPokemon = new JButton("NUEVO POKEMON");
		btnNuevoPokemon.setBounds(29, 197, 161, 23);
		getContentPane().add(btnNuevoPokemon);

		JButton btnModificarEntrenador = new JButton("MODIFICAR ENTRENADOR");
		btnModificarEntrenador.setBounds(29, 227, 161, 23);
		getContentPane().add(btnModificarEntrenador);

		JButton Salir = new JButton("SALIR");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Salir salir = new Salir ();
			salir.setVisible(true);
					

	
			}
		});
		Salir.setBounds(290, 227, 134, 23);
		getContentPane().add(Salir);
	}
}
