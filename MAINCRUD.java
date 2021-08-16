import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;

public class MAINCRUD extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTable tabla;
	
	
	MYSQLConexion cc = new MYSQLConexion();
	Connection con = cc.getConexion();
	Statement st;
	
	int idUsuario;
	private JLabel lblidusuario;
	private JLabel lblusuario;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JTextField txtidusuario;
	private JTextField txtusuario;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txttelefono;
	private JTextField txtcorreo;
	private JTextField txtcontraseña;
	private JButton btguardar;
	private JButton btModificar;
	private JButton btEliminar;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	


	
	public MAINCRUD() {
		setBackground(new Color(153, 153, 204));
		
		this.setLocationRelativeTo(null);
		this.setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(204, 204, 153));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(37, 87, 757, 201);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblidusuario = new JLabel("idUsuario: ");
		lblidusuario.setHorizontalAlignment(SwingConstants.TRAILING);
		lblidusuario.setFont(new Font("Bittermilk", Font.PLAIN, 21));
		lblidusuario.setBounds(28, 29, 99, 30);
		panel.add(lblidusuario);
		
		lblusuario = new JLabel("Usuario: ");
		lblusuario.setHorizontalAlignment(SwingConstants.TRAILING);
		lblusuario.setFont(new Font("Bittermilk", Font.PLAIN, 21));
		lblusuario.setBounds(35, 72, 91, 30);
		panel.add(lblusuario);
		
		lblnombre = new JLabel("Nombre:");
		lblnombre.setHorizontalAlignment(SwingConstants.TRAILING);
		lblnombre.setFont(new Font("Bittermilk", Font.PLAIN, 21));
		lblnombre.setBounds(35, 113, 84, 30);
		panel.add(lblnombre);
		
		lblapellido = new JLabel("Apellido:");
		lblapellido.setHorizontalAlignment(SwingConstants.TRAILING);
		lblapellido.setFont(new Font("Bittermilk", Font.PLAIN, 21));
		lblapellido.setBounds(35, 151, 91, 32);
		panel.add(lblapellido);
		
		txtidusuario = new JTextField();
		txtidusuario.setFont(new Font("HOLLYWOOD STARFIRE", Font.PLAIN, 14));
		txtidusuario.setEnabled(false);
		txtidusuario.setEditable(false);
		txtidusuario.setBackground(SystemColor.inactiveCaptionBorder);
		txtidusuario.setBounds(131, 31, 187, 25);
		panel.add(txtidusuario);
		txtidusuario.setColumns(10);
		
		txtusuario = new JTextField();
		txtusuario.setFont(new Font("HOLLYWOOD STARFIRE", Font.PLAIN, 14));
		txtusuario.setColumns(10);
		txtusuario.setBackground(SystemColor.inactiveCaptionBorder);
		txtusuario.setBounds(131, 115, 187, 25);
		panel.add(txtusuario);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("HOLLYWOOD STARFIRE", Font.PLAIN, 14));
		txtnombre.setColumns(10);
		txtnombre.setBackground(SystemColor.inactiveCaptionBorder);
		txtnombre.setBounds(131, 73, 187, 25);
		panel.add(txtnombre);
		
		txtapellido = new JTextField();
		txtapellido.setFont(new Font("HOLLYWOOD STARFIRE", Font.PLAIN, 14));
		txtapellido.setColumns(10);
		txtapellido.setBackground(SystemColor.inactiveCaptionBorder);
		txtapellido.setBounds(131, 155, 187, 25);
		panel.add(txtapellido);
		
		JLabel lbltelefono = new JLabel("Tel\u00E9fono:");
		lbltelefono.setFont(new Font("Bittermilk", Font.PLAIN, 21));
		lbltelefono.setBounds(402, 28, 91, 30);
		panel.add(lbltelefono);
		
		JLabel lblcorreo = new JLabel("E-mail:");
		lblcorreo.setFont(new Font("Bittermilk", Font.PLAIN, 21));
		lblcorreo.setBounds(419, 70, 66, 30);
		panel.add(lblcorreo);
		
		JLabel lblcontraseña = new JLabel("Contrase\u00F1a: ");
		lblcontraseña.setFont(new Font("Bittermilk", Font.PLAIN, 21));
		lblcontraseña.setBounds(385, 114, 105, 30);
		panel.add(lblcontraseña);
		
		txttelefono = new JTextField();
		txttelefono.setFont(new Font("HOLLYWOOD STARFIRE", Font.PLAIN, 14));
		txttelefono.setColumns(10);
		txttelefono.setBackground(SystemColor.inactiveCaptionBorder);
		txttelefono.setBounds(489, 31, 187, 25);
		panel.add(txttelefono);
		
		txtcorreo = new JTextField();
		txtcorreo.setFont(new Font("HOLLYWOOD STARFIRE", Font.PLAIN, 14));
		txtcorreo.setColumns(10);
		txtcorreo.setBackground(SystemColor.inactiveCaptionBorder);
		txtcorreo.setBounds(489, 73, 187, 25);
		panel.add(txtcorreo);
		
		txtcontraseña = new JTextField();
		txtcontraseña.setFont(new Font("HOLLYWOOD STARFIRE", Font.PLAIN, 14));
		txtcontraseña.setColumns(10);
		txtcontraseña.setBackground(SystemColor.inactiveCaptionBorder);
		txtcontraseña.setBounds(489, 119, 187, 25);
		panel.add(txtcontraseña);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		scrollPane.setBounds(37, 418, 757, 215);
		contentPane.add(scrollPane);
		
		tabla = new JTable();
		tabla.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabla.setFont(new Font("HOLLYWOOD STARFIRE", Font.BOLD, 12));
		tabla.setBackground(SystemColor.inactiveCaptionBorder);
		tabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int filaSeleccionada = tabla.getSelectedRow();
				
				if(filaSeleccionada==-1) {
					JOptionPane.showMessageDialog(null, "Usuario no seleccionado");
				}else {
					idUsuario= Integer.parseInt((String)tabla.getValueAt(filaSeleccionada, 0));
					String usuario = (String)tabla.getValueAt(filaSeleccionada, 1);
					String nombre = (String)tabla.getValueAt(filaSeleccionada, 2);
					String apellido = (String)tabla.getValueAt(filaSeleccionada, 3);
					String telefono = (String)tabla.getValueAt(filaSeleccionada, 4);
					String correo = (String)tabla.getValueAt(filaSeleccionada, 5);
					String contra = (String)tabla.getValueAt(filaSeleccionada, 6);
					
					txtidusuario.setText(""+idUsuario);
					txtusuario.setText(usuario);
					txtnombre.setText(nombre);
					txtapellido.setText(apellido);
					txttelefono.setText(telefono);
					txtcorreo.setText(correo);
					txtcontraseña.setText(contra);
				
				}
			}		
		});
		tabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane.setViewportView(tabla);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 153));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 0, 0)));
		panel_1.setBounds(37, 299, 757, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btguardar = new JButton("GUARDAR");
		btguardar.setHorizontalAlignment(SwingConstants.LEADING);
		btguardar.setFont(new Font("HOLLYWOOD STARFIRE", Font.BOLD, 14));
		btguardar.setBackground(new Color(204, 153, 102));
		btguardar.setIcon(new ImageIcon("C:\\Users\\prisc\\OneDrive\\Escritorio\\images\\saved.png"));
		btguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarDatos();
				mostrarDatos();
			}
		});
		btguardar.setBounds(42, 32, 155, 51);
		panel_1.add(btguardar);
		
		JButton btnuevo = new JButton("NUEVO");
		btnuevo.setForeground(new Color(0, 0, 0));
		btnuevo.setBackground(new Color(204, 153, 102));
		btnuevo.setFont(new Font("HOLLYWOOD STARFIRE", Font.BOLD, 14));
		btnuevo.setIcon(new ImageIcon("C:\\Users\\prisc\\OneDrive\\Escritorio\\images\\new.png"));
		btnuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCajas();
			}
		});
		btnuevo.setBounds(207, 32, 145, 51);
		panel_1.add(btnuevo);
		
		btModificar = new JButton("MODIFICAR");
		btModificar.setForeground(new Color(0, 0, 0));
		btModificar.setBackground(new Color(204, 153, 102));
		btModificar.setIcon(new ImageIcon("C:\\Users\\prisc\\OneDrive\\Escritorio\\images\\edit.png"));
		btModificar.setFont(new Font("HOLLYWOOD STARFIRE", Font.BOLD, 14));
		btModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar();
				mostrarDatos();
			}
		});
		btModificar.setBounds(362, 32, 170, 51);
		panel_1.add(btModificar);
		
		btEliminar = new JButton("ELIMINAR");
		btEliminar.setForeground(new Color(0, 0, 0));
		btEliminar.setBackground(new Color(204, 153, 102));
		btEliminar.setIcon(new ImageIcon("C:\\Users\\prisc\\OneDrive\\Escritorio\\images\\delete.png"));
		btEliminar.setFont(new Font("HOLLYWOOD STARFIRE", Font.BOLD, 14));
		btEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
				mostrarDatos();
			}
		});
		btEliminar.setBounds(542, 32, 161, 51);
		panel_1.add(btEliminar);
		
		lblNewLabel = new JLabel("CRUD APPLICATION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("ELEGANT TYPEWRITER", Font.BOLD, 47));
		lblNewLabel.setBounds(172, 25, 501, 40);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login pr = new Login();
				pr.setVisible(true);
				MAINCRUD.this.dispose();
			}
		});
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\prisc\\OneDrive\\Escritorio\\images\\logout.png"));
		btnNewButton.setBounds(732, 13, 62, 63);
		contentPane.add(btnNewButton);
		mostrarDatos();
	}
	
	
public void modificar() {
	int g = tabla.getSelectedRow();

	String usuario =txtusuario.getText();
	String nombre =txtnombre.getText();
	String apellido =txtapellido.getText();
	String telefono =txttelefono.getText();
	String correo = txtcorreo.getText();
	String contraseña = txtcontraseña.getText();

	String sql = "UPDATE usuarios SET usuario ='" + usuario + "',nombre = '" + nombre +"',apellido ='" + apellido + "', telefono = '" + telefono + "',correo = '" + correo + "',contraseña = '" + contraseña +"'WHERE idUsuario = " +idUsuario;
	
	if(g==-1) {
		JOptionPane.showMessageDialog(null, "Para modificar datos, debe seleccionar una fila.");
	}else {
		try {
			if(usuario!=null || nombre!= null || apellido!= null || telefono!= null || correo!= null || contraseña!= null ) {
				
				con =cc.getConexion();
				st = con.createStatement();
				st.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Usuario Actualizado");
				limpiarCajas();
						
			
			}else {
				JOptionPane.showMessageDialog(null, "ERROR. Debe registrar datos");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	}
	

public void mostrarDatos() {
	String[] columnas ={"idUsuario", "Usuario", "Nombre", "Apellido", "Teléfono", "Correo", "Contraseña"};
	String [] registros = new String[7];
	
	DefaultTableModel modelo = new DefaultTableModel(null, columnas);
	
	String sql ="SELECT * FROM usuarios";
	try {
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			
			registros[0]=rs.getString("idUsuario");
			registros[1]=rs.getString("usuario");
			registros[2]=rs.getString("nombre");
			registros[3]=rs.getString("apellido");
			registros[4]=rs.getString("telefono");
			registros[5]=rs.getString("correo");
			registros[6]=rs.getString("contraseña");
			
			modelo.addRow(registros);
			
		}
		
		tabla.setModel(modelo);
		
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Error al mostrar datos: " +e.getMessage());
	}
	
	
}

public void limpiarCajas() {
	
	txtidusuario.setText("");
	txtusuario.setText("");
	txtnombre.setText("");
	txtapellido.setText("");
	txttelefono.setText("");
	txtcorreo.setText("");
	txtcontraseña.setText("");
	
}

public void eliminar() {
	int rg = tabla.getSelectedRow();
	
	if(rg==-1) {
		JOptionPane.showMessageDialog(null, "Para eliminar, debe seleccionar una fila.");
		
	}else {
		String sql = "DELETE FROM usuarios WHERE idUsuario ="+idUsuario;
		
		try {
			con=cc.getConexion();
			st=con.createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Usuario eliminado.");
			limpiarCajas();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
	
public void insertarDatos() {
	String pass = new String(txtcontraseña.getText());


	if (txtusuario.getText().equals("") || txtnombre.equals("") || txtapellido.equals("") || txttelefono.equals("")
			|| txtcorreo.equals("") || pass.equals("")) {

		JOptionPane.showMessageDialog(null, "¡FAVOR DE COMPLETAR TODOS LOS CAMPOS!", "INFO",
				JOptionPane.INFORMATION_MESSAGE);
	}else {
		
		
	
	try {
		
		String SQL ="INSERT INTO usuarios (usuario, nombre,apellido,telefono,correo,contraseña) VALUES (?,?,?,?,?,?)";
		
		PreparedStatement pst = con.prepareStatement(SQL);
		pst.setString(1, txtusuario.getText());
		pst.setString(2, txtnombre.getText());
		pst.setString(3, txtapellido.getText());
		pst.setString(4, txttelefono.getText());
		pst.setString(5, txtcorreo.getText());
		pst.setString(6, txtcontraseña.getText());
		pst.execute();
		JOptionPane.showMessageDialog(null, "REGISTRO ALMACENADO");
		limpiarCajas();
		
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "REGISTRO NO GUARDADO: " +e.getMessage());

	}
	
}
}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAINCRUD frame = new MAINCRUD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
