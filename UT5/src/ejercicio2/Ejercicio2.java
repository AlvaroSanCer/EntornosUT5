package ejercicio2;

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

public class Ejercicio2 extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
					frame.setVisible(true);
					frame.setSize(500,300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{85, 136, 58, 109, 0};
		gridBagLayout.rowHeights = new int[]{20, 36, 20, 20, 20, 22, 44, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCompreAlgoAhora = new JLabel("COMPRE ALGO AHORA");
		lblCompreAlgoAhora.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblCompreAlgoAhora = new GridBagConstraints();
		gbc_lblCompreAlgoAhora.anchor = GridBagConstraints.NORTH;
		gbc_lblCompreAlgoAhora.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCompreAlgoAhora.insets = new Insets(0, 0, 5, 5);
		gbc_lblCompreAlgoAhora.gridwidth = 2;
		gbc_lblCompreAlgoAhora.gridx = 1;
		gbc_lblCompreAlgoAhora.gridy = 0;
		getContentPane().add(lblCompreAlgoAhora, gbc_lblCompreAlgoAhora);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		getContentPane().add(lblNombre, gbc_lblNombre);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridwidth = 3;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 2;
		getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion: ");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.WEST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 3;
		getContentPane().add(lblDireccion, gbc_lblDireccion);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.gridwidth = 3;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 3;
		getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCiudad_1 = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad_1 = new GridBagConstraints();
		gbc_lblCiudad_1.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad_1.gridx = 0;
		gbc_lblCiudad_1.gridy = 4;
		getContentPane().add(lblCiudad_1, gbc_lblCiudad_1);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 4;
		getContentPane().add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia: ");
		GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
		gbc_lblProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia.gridx = 2;
		gbc_lblProvincia.gridy = 4;
		getContentPane().add(lblProvincia, gbc_lblProvincia);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.anchor = GridBagConstraints.NORTH;
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 4;
		getContentPane().add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		GridBagConstraints gbc_lblFormaDePago = new GridBagConstraints();
		gbc_lblFormaDePago.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFormaDePago.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormaDePago.gridx = 0;
		gbc_lblFormaDePago.gridy = 5;
		getContentPane().add(lblFormaDePago, gbc_lblFormaDePago);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PayPal", "Transferencia bancaria"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 5;
		getContentPane().add(comboBox, gbc_comboBox);
		
		JButton btnNewButton = new JButton("Aceptar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 7;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 7;
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);

}

}