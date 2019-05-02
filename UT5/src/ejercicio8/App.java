package ejercicio8;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import ejercicio7.Ejercicio7;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame {
	private String c = "-";
	private String g = "-";
	private String h = "-";
	private String t = "-";

	// private JLabel lmuñeco;

	public App() {
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);

		final JCheckBox cvchin = new JCheckBox("Barbilla");
		cvchin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cvchin.isSelected()) {
					c = "c";
				} else {
					c = "-";
				}
				repintar();
			}
		});
		cvchin.setBounds(49, 52, 97, 23);
		getContentPane().add(cvchin);

		final JCheckBox cvglasses = new JCheckBox("Gafas");
		cvglasses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cvchin.isSelected()) {
					g = "g";
				} else {
					g = "-";
				}
				repintar();
			}

		});

		cvglasses.setBounds(49, 89, 97, 23);
		getContentPane().add(cvglasses);

		final JCheckBox cvhair = new JCheckBox("Pelo");
		cvhair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cvhair.isSelected()) {
					h = "h";
				} else {
					h = "-";
				}
				repintar();
			}

		});

		cvhair.setBounds(49, 131, 97, 23);
		getContentPane().add(cvhair);

		final JCheckBox cvteeth = new JCheckBox("Dientes");
		cvteeth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cvteeth.isSelected()) {
					t = "t";
				} else {
					t = "-";
				}
				repintar();
			}

		});

		cvteeth.setBounds(49, 172, 97, 23);
		getContentPane().add(cvteeth);

		final JLabel lmuñeco = new JLabel("");
		lmuñeco.setIcon(new ImageIcon(App.class
				.getResource("/ejercicio8/imagenes/geek-----.gif")));
		lmuñeco.setBounds(233, 87, 83, 100);
		getContentPane().add(lmuñeco);

	}

//	private void repintar() {
//		String nombre = "/ejercicio8/imagenes/geek-" + c + g + h + t + ".gif";
//		ImageIcon muñeco = new javax.swing.ImageIcon(getClass().getResource(
//				nombre));
//		lmuñeco.setIcon(muñeco);
//		lmuñeco.repaint();
//	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
					frame.setSize(400, 300);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
