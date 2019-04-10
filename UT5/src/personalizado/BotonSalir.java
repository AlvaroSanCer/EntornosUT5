package personalizado;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class BotonSalir extends JButton {

	private static final long serialVersionUID = 2846914603691691519L;

	public BotonSalir() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		setBackground(Color.BLACK);
		setForeground(Color.YELLOW);
		setText("Salirr");
	}

	public Font getThisFont() {
		return getFont();
	}
	public void setThisFont(Font font) {
		setFont(font);
	}
	public String getThisText() {
		return getText();
	}
	public void setThisText(String text) {
		setText(text);
	}
}
