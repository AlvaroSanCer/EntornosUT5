package ejercicio6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio6 extends JFrame {

	private JLayeredPane contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblCiudad;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private String nombre, direccion, ciudad, provincia, pago;
	private String[] pagos = new String[] { "PayPal", "Transferencia bancaria" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
					frame.setVisible(true);
					frame.setSize(500, 300);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio6() {
		getContentPane().setLayout(null);

		JLabel lblCompreAlgoAhora = new JLabel("Compre algo ahora");
		lblCompreAlgoAhora.setBounds(149, 11, 191, 20);
		lblCompreAlgoAhora.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblCompreAlgoAhora);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(29, 69, 65, 14);
		getContentPane().add(lblNombre);

		textField_3 = new JTextField();
		textField_3.setBounds(121, 66, 288, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setBounds(28, 94, 65, 14);
		getContentPane().add(lblDireccion);

		textField_4 = new JTextField();
		textField_4.setBounds(121, 91, 288, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblCiudad_1 = new JLabel("Ciudad:");
		lblCiudad_1.setBounds(29, 119, 54, 14);
		getContentPane().add(lblCiudad_1);

		textField_5 = new JTextField();
		textField_5.setBounds(121, 116, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblProvincia = new JLabel("Provincia: ");
		lblProvincia.setBounds(217, 119, 73, 14);
		getContentPane().add(lblProvincia);

		textField_6 = new JTextField();
		textField_6.setBounds(300, 116, 109, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setBounds(27, 144, 94, 14);
		getContentPane().add(lblFormaDePago);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(121, 140, 86, 22);
		comboBox.setModel(new DefaultComboBoxModel(pagos));
		getContentPane().add(comboBox);
		
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(29, 235, 403, 14);
		getContentPane().add(lblNewLabel);
		
		//Creacion del Boton que tendra un Evento Adjunto.
		JButton btnNewButton = new JButton("Aceptar");
		
		//Se crea el evento
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//Si 
				if (e.getButton() == MouseEvent.BUTTON1) {

					nombre = textField_3.getText();
					direccion = textField_4.getText();
					ciudad = textField_5.getText();
					provincia = textField_6.getText();
					int indice_pago = comboBox.getSelectedIndex();
					String pago = pagos[indice_pago];

					lblNewLabel.setText(nombre + " " + direccion
							+ " " + ciudad + " " + provincia + " " + pago);
					
				}
			}
		});
		
		
		btnNewButton.setBounds(136, 189, 89, 23);
		getContentPane().add(btnNewButton);

		
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(263, 189, 94, 23);
		getContentPane().add(btnNewButton_1);



	

	}
}