package ejercicio7;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;

import ejercicio3.Ejercicio3;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Ejercicio7 extends JFrame {
	public Ejercicio7() {
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
			
			JPanel panel2 = new JPanel();
			panel2.setBackground(Color.CYAN);
			panel2.setBounds(0, 111, 226, 234);
			getContentPane().add(panel2);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		panel1.setBounds(0, 0, 226, 115);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblSeleccioneUnaOpcin = new JLabel("Seleccione una Opci\u00F3n:");
		lblSeleccioneUnaOpcin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSeleccioneUnaOpcin.setBounds(30, 21, 186, 27);
		panel1.add(lblSeleccioneUnaOpcin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.GRAY);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		comboBox.setBounds(30, 59, 151, 45);
		panel1.add(comboBox);
	}
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Ejercicio7 frame = new Ejercicio7();
				frame.setVisible(true);
				frame.setSize(250,500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}
