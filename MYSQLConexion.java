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
			String CONTRASE�A = "priscilapolanco05";
				
			con = DriverManager.getConnection(URL,USUARIO,CONTRASE�A);
				
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR EN LA CARGA DEL DRIVER");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("ERROR EN LA CONEXI�N");
			e.printStackTrace();
		}
		
		return con;
	}
	
	}

