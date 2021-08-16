import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLConexion {
	public static Connection getConexion() {
		Connection con = null;
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3306/bdforms";
			String USUARIO = "root";
			String CONTRASEÑA = "priscilapolanco05";
				
			con = DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
				
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR EN LA CARGA DEL DRIVER");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("ERROR EN LA CONEXIÓN");
			e.printStackTrace();
		}
		
		return con;
	}
	
	}

