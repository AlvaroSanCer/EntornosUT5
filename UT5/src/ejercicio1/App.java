package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1338904930546292000L;

	private JPanel contentPane;
	private JTextField textField;
	final JComboBox comboBox;
	final CardLayout gestorCar;
	JPanel panelAbajo;
	JPanel panel1;
	JPanel panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JPanel panelArriba = new JPanel();
		panelArriba.setAlignmentY(Component.TOP_ALIGNMENT);
		panelArriba.setBackground(Color.GREEN);
		contentPane.add(panelArriba);
		panelArriba.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		comboBox = new JComboBox();
		comboBox.addActionListener(new OyenteActionEvent());

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Pagina 1",
				"Pagina 2" }));
		panelArriba.add(comboBox);

		panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.MAGENTA);
		contentPane.add(panelAbajo);
		gestorCar = new CardLayout(0, 0);
		panelAbajo.setLayout(gestorCar);

		panel1 = new JPanel();
		panel1.setBackground(Color.PINK);
		panelAbajo.add(panel1, "panel1");

		JButton btnNewButton = new JButton("Boton1");
		panel1.add(btnNewButton);

		panel2 = new JPanel();
		panel2.setBackground(Color.MAGENTA);
		panelAbajo.add(panel2, "panel2");

		JLabel lblNewLabel = new JLabel("Etiqueta 1");
		panel2.add(lblNewLabel);

		textField = new JTextField();
		panel2.add(textField);
		textField.setColumns(10);

	}

	private final class OyenteActionEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (comboBox.getSelectedItem().equals("Pagina 1")) {
				gestorCar.show(panelAbajo, "panel1");

			}

			else if (comboBox.getSelectedItem().equals("Pagina 2")) {
				gestorCar.show(panelAbajo, "panel2");
			}

		}
	
		

	}
}
