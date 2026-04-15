package t13._pruebas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prueba {

	public static void main(String[] args) {
		
		JButton boton = new JButton("PULSA");
		JLabel panel = new JLabel("");
		JTextField texto = new JTextField();
		
		JFrame ventana = new JFrame("Mi aplicación");
		ventana.setSize(300,200);
		ventana.setLayout(new GridLayout(3,1,5,5));
		ventana.add(texto);
		ventana.add(boton);
		ventana.add(panel);
		ventana.setVisible(true);
		
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setText( "HOLA "+ texto.getText() );
			}
		});
		
	}

}
