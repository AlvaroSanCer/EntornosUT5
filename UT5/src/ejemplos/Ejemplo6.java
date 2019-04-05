package ejemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;

public class Ejemplo6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo6 frame = new Ejemplo6();
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
	public Ejemplo6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 4, 6));
		
		JButton boton1 = new JButton("Boton 1");
		boton1.setForeground(Color.DARK_GRAY);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Boton 2");
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("Boton 3");
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("Boton 4");
		contentPane.add(boton4);
	}

}
