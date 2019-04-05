package ejemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Ejemplo1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 frame = new Ejemplo1();
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
	public Ejemplo1() {
		setTitle("Absolute(null) Alvaro Santillana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(89, 11, 222, 20);
		contentPane.add(textPane);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(33, 17, 46, 14);
		contentPane.add(lblTexto);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(341, 11, 91, 23);
		contentPane.add(btnAceptar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(48, 48, 322, 165);
		contentPane.add(textArea);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(295, 223, 91, 23);
		contentPane.add(btnBorrar);
	}
}
