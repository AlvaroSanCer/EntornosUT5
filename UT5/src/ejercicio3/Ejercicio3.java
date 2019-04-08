package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ejercicio3.Ejercicio3;



public class Ejercicio3 extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	public Ejercicio3() {
		getContentPane().setLayout(null);
		
		JLabel lblGuardarEn = new JLabel("Guardar en: ");
		lblGuardarEn.setBounds(17, 11, 76, 14);
		getContentPane().add(lblGuardarEn);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(103, 7, 144, 22);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(257, 7, 27, 23);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("...");
		button.setBounds(294, 7, 27, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("...");
		button_1.setBounds(331, 7, 27, 23);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("...");
		button_2.setBounds(368, 7, 27, 23);
		getContentPane().add(button_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 41, 375, 134);
		getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(140, 186, 144, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 217, 144, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Nombre del Fichero");
		lblNewLabel.setBounds(17, 189, 100, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo");
		lblNewLabel_1.setBounds(17, 220, 100, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(304, 186, 91, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(304, 217, 91, 23);
		getContentPane().add(btnCancelar);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
					frame.setSize(450,300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
}
