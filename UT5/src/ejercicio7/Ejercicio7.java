package ejercicio7;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;

import ejemplos.ejemploMenus.Menus;
import ejercicio3.Ejercicio3;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ejercicio7 extends JFrame {
	public Ejercicio7() {
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
			
			JPanel panel2 = new JPanel();
			panel2.setBackground(Color.CYAN);
			panel2.setBounds(0, 111, 226, 164);
			getContentPane().add(panel2);
			
			final JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNewLabel.setIcon(new ImageIcon(Menus.class.getResource("/ejercicio7/imagenes/man.png")));
			
			panel2.add(lblNewLabel);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		panel1.setBounds(0, 0, 226, 115);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblSeleccioneUnaOpcin = new JLabel("Seleccione una Opci\u00F3n:");
		lblSeleccioneUnaOpcin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSeleccioneUnaOpcin.setBounds(30, 21, 186, 27);
		panel1.add(lblSeleccioneUnaOpcin);
		
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Hombre")){
					lblNewLabel.setIcon(new ImageIcon(Menus.class.getResource("/ejercicio7/imagenes/man1.png")));
				}
				else if (comboBox.getSelectedItem().equals("Mujer") ){
					lblNewLabel.setIcon(new ImageIcon(Menus.class.getResource("/ejercicio7/imagenes/user_female.png")));
				}
			}
		});
		comboBox.setBackground(Color.GRAY);
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-", "Hombre", "Mujer"}));
		comboBox.setBounds(30, 59, 151, 45);
		panel1.add(comboBox);
	}
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Ejercicio7 frame = new Ejercicio7();
				frame.setVisible(true);
				frame.setSize(250,330);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}
