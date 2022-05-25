package Pokemon.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Login extends JFrame{


	private JTextField textEntrenador;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Login() {
		getContentPane().setBackground(Color.BLACK);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(100, 100, 317, 460);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Entrenador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(60, 140, 92, 14);
		this.getContentPane().add(lblNewLabel);

		textEntrenador = new JTextField();
		
		textEntrenador.setBounds(57, 165, 178, 20);
		this.getContentPane().add(textEntrenador);
		textEntrenador.setColumns(10);

		JButton IniciarSesion = new JButton("Iniciar Sesion");
		IniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		IniciarSesion.setBounds(57, 291, 178, 23);
		this.getContentPane().add(IniciarSesion);

		JButton Registrarse = new JButton("Resgistrarse");
		Registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro Registro = new Registro();
			
				setVisible(false);
				
				Registro.setVisible(true);

			}
		});
		Registrarse.setBounds(57, 325, 178, 23);
		this.getContentPane().add(Registrarse);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(60, 196, 78, 14);
		this.getContentPane().add(lblNewLabel_1);
		
		JLabel lblError = new JLabel("");
		lblError.setBounds(57, 157, 178, 14);
		getContentPane().add(lblError);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\pokebola.jpg"));
		lblNewLabel_2.setBounds(10, 11, 281, 118);
		getContentPane().add(lblNewLabel_2);
		
		JLabel Error = new JLabel("");
		Error.setBounds(60, 266, 175, 14);
		getContentPane().add(Error);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(60, 224, 175, 20);
		getContentPane().add(textPassword);
	}
}
