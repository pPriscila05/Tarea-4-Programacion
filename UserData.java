
public class UserData {

	private int idUsuario;
	private String usuario, nombre, apellido, telefono, correo, contrase�a;

	public UserData(int idUsuario, String usuario, String nombre, String apellido, String telefono, String correo,
			String contrase�a) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.contrase�a = contrase�a;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public UserData(String string, String string2, String string3, String string4, String string5, String string6,
			String string7) {
		// TODO Auto-generated constructor stub
	}

	public UserData() {
		// TODO Auto-generated constructor stub
	}



}
