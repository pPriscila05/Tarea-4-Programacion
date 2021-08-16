import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/bdforms";
	public static final String USUARIO = "root";
	public static final String CONTRASEÑA = "priscilapolanco05";

	
	static {
		try {
			Class.forName(DRIVER);

		} catch (ClassNotFoundException e) {
			System.out.println("ERROR EN LA CARGA DEL DRIVER");
			e.printStackTrace();
		}
	}
	public Connection conectar() {
		Connection conex = null;
			
		try {			
			conex = DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
			System.out.println("CONEXIÓN OK");
			
		} catch (SQLException e) {
			System.out.println("ERROR EN LA CONEXIÓN");
			e.printStackTrace();
		}
		
		return conex;
	}
}
