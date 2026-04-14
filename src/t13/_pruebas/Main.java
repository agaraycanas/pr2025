package t13._pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Connection conexionBD = conectarBD();
		ejecutarSQL_CUD(conexionBD);
		System.out.println("FIN");
	}

	private static void ejecutarSQL_CUD(Connection conexionBD) {
		String sql ="""
				insert into persona(id,nombre,estatura)
				values(?,?,?)
				""";
		try {
			PreparedStatement ps = conexionBD.prepareStatement(sql);
			
			ps.setInt(1,		10);
			ps.setString(2, 	"Ramón");
			ps.setInt(3, 		189);
			
			ps.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("Error al ejecutar sentencia SQL");
		}
	
	}

	private static Connection conectarBD() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test","root",""); //MariaDB
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver JDBC");
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la Base de datos");
			System.out.println(e.getMessage());
		} 
		return con;
	}

}
