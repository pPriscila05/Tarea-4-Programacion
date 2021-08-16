import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class GestionUsuario extends MYSQLConexion{

public static UserData obtenerUsu(UserData usu) {
	
	UserData prs = null;
	Connection con = null;
	PreparedStatement pt = null;
	ResultSet result = null;
	
	try {
		con = MYSQLConexion.getConexion();
		String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
		
		pt = con.prepareStatement(sql);
		pt.setString(1, usu.getUsuario());
		pt.setString(2, usu.getContraseña());
		
		result= pt.executeQuery();
		
		while(result.next()) {
			prs = new UserData(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7));

		}
			
		
	} catch (Exception e) {
		System.out.println("ERROR EN OBTENER USUARIO");
	}
		
	return prs;
	
	
	
}



}
