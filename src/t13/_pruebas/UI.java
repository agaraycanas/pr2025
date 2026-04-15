package t13._pruebas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UI {
	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setLayout(new GridLayout(3,1));
		ventana.add(new JTextField());
		ventana.add(new JButton("Buscar"));
		ventana.add(new JLabel("--"));
		ventana.setSize(400,200);
		ventana.setLocation(400, 200);
		ventana.setVisible(true);
	}
}
