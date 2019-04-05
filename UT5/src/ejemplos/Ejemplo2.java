package ejemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ejemplo2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 frame = new Ejemplo2();
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
	public Ejemplo2() {
		setTitle("FlowLayout Alvaro SC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));
		
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnBotn = new JButton("Bot\u00F3n 2");
		contentPane.add(btnBotn);
		
		JButton btnBotn_1 = new JButton("Bot\u00F3n 3");
		contentPane.add(btnBotn_1);
		
		JButton btnBotn_2 = new JButton("Bot\u00F3n 4");
		contentPane.add(btnBotn_2);
		
		JButton btnBotn_3 = new JButton("Bot\u00F3n 5");
		contentPane.add(btnBotn_3);
		
		JButton btnBotn_4 = new JButton("Bot\u00F3n 6");
		contentPane.add(btnBotn_4);
		
		JButton btnBotn_5 = new JButton("Bot\u00F3n 7");
		contentPane.add(btnBotn_5);
		
		JButton btnBotn_6 = new JButton("Bot\u00F3n 8");
		contentPane.add(btnBotn_6);
		
		JButton btnBotn_7 = new JButton("Bot\u00F3n 9");
		contentPane.add(btnBotn_7);
		
		JButton btnBotn_8 = new JButton("Bot\u00F3n 10");
		contentPane.add(btnBotn_8);
	}

}
