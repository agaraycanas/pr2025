package t13._pruebas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Persona {
	private int id;
	private String nombre;
	private int estatura;
	public Persona(int id, String nombre, int estatura) {
		this.id = id;
		this.nombre = nombre;
		this.estatura = estatura;
	}
	@Override
	public String toString() {
		return "["+this.id+"] "+this.nombre+" ("+this.estatura+")";
	}
}
public class Main {
	private static Connection conexionBD;

	public static void main(String[] args) {
		conectarBD();
		//versionScanner();
		versionUI();
	}
	private static void versionUI() {
		JButton boton = new JButton("Buscar");
		JTextField tf = new JTextField();
		JLabel etiqueta = new JLabel("");
		
		JFrame ventana = new JFrame();
		ventana.setLayout(new GridLayout(3,1));
		
		ventana.add(tf);
		ventana.add(boton);
		ventana.add(etiqueta);
		
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt( tf.getText() );
				Persona persona= getById(id);
				String textoAImprimir = "";
				if (persona == null) {
					textoAImprimir = "La persona de ID " + id + " no existe";
				}
				else {
					textoAImprimir = persona.toString();
				}
				etiqueta.setText(textoAImprimir);
			}
		});
		
		ventana.setSize(400,200);
		ventana.setLocation(400, 200);
		ventana.setVisible(true);		
	}
	private static void versionScanner() {
		conectarBD();
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.print("Introduce un ID: ");
			int id = s.nextInt();
			Persona persona= getById(id);
			if (persona == null) {
				System.out.println("La persona de ID " + id + " no existe");
			}
			else {
				System.out.println(persona);
			}
			System.out.println();
		}
		s.close();		
	}

	private static Persona getById(int id) {
		Persona personaEncontrada = null;
		String sql = """
				select id,nombre,estatura
				from persona
				where id=?
				""";
		try {
			PreparedStatement ps = conexionBD.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				personaEncontrada = new Persona(id,rs.getString("nombre"),rs.getInt("estatura"));
			}
		} catch (Exception e) {
			System.out.println("Error al ejecutar sentencia SQL");
		}
		return personaEncontrada;
	}

	private static void ejecutarSQL_R() {
		String sql = """
				select id,nombre,estatura
				from persona
				""";
		try {
			PreparedStatement ps = conexionBD.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("ID\tNOMBRE\tESTATURA");
			System.out.println("==============================");
			while (rs.next()) {
				System.out.print(rs.getInt("id") + "\t" + rs.getString("nombre") + "\t" + rs.getInt("estatura"));
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Error al ejecutar sentencia SQL");
		}
	}

	private static void ejecutarSQL_CUD() {
		String sql = """
				update persona
				set nombre=?
				where id=?
				""";
		try {
			PreparedStatement ps = conexionBD.prepareStatement(sql);

			ps.setString(1, "Pablo");
			ps.setInt(2, 11);

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al ejecutar sentencia SQL");
		}

	}

	private static void conectarBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexionBD = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", ""); // MariaDB

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver JDBC");
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la Base de datos");
			System.out.println(e.getMessage());
		}
	}

}
