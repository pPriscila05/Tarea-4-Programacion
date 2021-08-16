import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txttelefono;
	private JTextField txtcorreo;
	private JPasswordField txtpassword;
	private JPasswordField txtpassword2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Principal.frmReg = null;
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Formulario de registro");
		setBounds(100, 100, 514, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(188, 143, 143));
		panel.setBounds(0, 0, 507, 104);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("REGISTER FORM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Rose Cake - Personal Use", Font.BOLD, 58));
		lblNewLabel.setBounds(48, 29, 404, 57);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 104, 507, 426);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel usulabel = new JLabel("Nombre de usuario:");
		usulabel.setFont(new Font("Bittermilk", Font.PLAIN, 19));
		usulabel.setBounds(77, 32, 150, 27);
		panel_1.add(usulabel);

		JLabel nomlabel = new JLabel("Nombre: ");
		nomlabel.setHorizontalAlignment(SwingConstants.TRAILING);
		nomlabel.setFont(new Font("Bittermilk", Font.PLAIN, 19));
		nomlabel.setBounds(122, 75, 105, 19);
		panel_1.add(nomlabel);

		JLabel lblApellido = new JLabel("Apellido:  ");
		lblApellido.setHorizontalAlignment(SwingConstants.TRAILING);
		lblApellido.setFont(new Font("Bittermilk", Font.PLAIN, 19));
		lblApellido.setBounds(150, 118, 83, 19);
		panel_1.add(lblApellido);

		JLabel lblTelfono = new JLabel("Tel\u00E9fono: ");
		lblTelfono.setFont(new Font("Bittermilk", Font.PLAIN, 19));
		lblTelfono.setBounds(151, 155, 76, 19);
		panel_1.add(lblTelfono);

		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico: ");
		lblCorreoElectrnico.setFont(new Font("Bittermilk", Font.PLAIN, 19));
		lblCorreoElectrnico.setBounds(80, 190, 146, 19);
		panel_1.add(lblCorreoElectrnico);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setFont(new Font("Bittermilk", Font.PLAIN, 19));
		lblContrasea.setBounds(128, 226, 94, 19);
		panel_1.add(lblContrasea);

		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a: ");
		lblConfirmarContrasea.setFont(new Font("Bittermilk", Font.PLAIN, 19));
		lblConfirmarContrasea.setBounds(55, 257, 178, 19);
		panel_1.add(lblConfirmarContrasea);

		txtusuario = new JTextField();
		txtusuario.setBounds(235, 32, 195, 25);
		panel_1.add(txtusuario);
		txtusuario.setColumns(10);

		txtnombre = new JTextField();
		txtnombre.setColumns(10);
		txtnombre.setBounds(235, 74, 195, 25);
		panel_1.add(txtnombre);

		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(235, 113, 195, 25);
		panel_1.add(txtapellido);

		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(235, 150, 195, 25);
		panel_1.add(txttelefono);

		txtcorreo = new JTextField();
		txtcorreo.setColumns(10);
		txtcorreo.setBounds(235, 184, 195, 25);
		panel_1.add(txtcorreo);

		txtpassword = new JPasswordField();
		txtpassword.setText("");
		txtpassword.setBounds(235, 220, 195, 25);
		panel_1.add(txtpassword);

		txtpassword2 = new JPasswordField();
		txtpassword2.setText("");
		txtpassword2.setBounds(235, 251, 195, 25);
		panel_1.add(txtpassword2);

		JButton btnCancel = new JButton("CANCELAR");
		btnCancel.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Principal log = new Principal();
				log.setVisible(true);
				Register.this.dispose();
			}
		});
		btnCancel.setFont(new Font("Pumpkin Pancakes", Font.BOLD, 22));
		btnCancel.setBackground(new Color(204, 0, 0));
		btnCancel.setBounds(80, 311, 150, 41);
		panel_1.add(btnCancel);

		JButton btnRegistrar = new JButton("REGISTRARME");
		btnRegistrar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrar();
			}
		});
		btnRegistrar.setFont(new Font("Pumpkin Pancakes", Font.BOLD, 22));
		btnRegistrar.setBackground(new Color(51, 153, 204));
		btnRegistrar.setBounds(268, 311, 150, 41);
		panel_1.add(btnRegistrar);

		JLabel lblregister = new JLabel("\u00BFYa tienes una cuenta? Ingresa ahora");
		lblregister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		lblregister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        Login log = new Login();
		        log.setVisible(true);
		        Register.this.dispose();
		        log.setLocationRelativeTo(null);
		        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});
		lblregister.setHorizontalAlignment(SwingConstants.CENTER);
		lblregister.setFont(new Font("ELEGANT TYPEWRITER", Font.BOLD, 18));
		lblregister.setBounds(77, 368, 351, 27);
		panel_1.add(lblregister);
	}

	protected void registrar() {
		RegisterData rd = new RegisterData();
		UserData mod = new UserData();

		String pass = new String(txtpassword.getPassword());
		String pass2 = new String(txtpassword2.getPassword());

		if (txtusuario.getText().equals("") || txtnombre.equals("") || txtapellido.equals("") || txttelefono.equals("")
				|| txtcorreo.equals("") || pass.equals("") || pass2.equals("")) {

			JOptionPane.showMessageDialog(null, "¡FAVOR DE COMPLETAR TODOS LOS CAMPOS!", "INFO",
					JOptionPane.INFORMATION_MESSAGE);

		} else {

			if (pass.equals(pass2)) {

				if (rd.existeUsuario(txtusuario.getText()) == 0) {
					
					if(rd.validacionEmail(txtcorreo.getText())) {


					mod.setUsuario(txtusuario.getText());
					mod.setContraseña(pass);
					mod.setNombre(txtnombre.getText());
					mod.setApellido(txtapellido.getText());
					mod.setTelefono(txttelefono.getText());
					mod.setCorreo(txtcorreo.getText());

					if (rd.registrar(mod)) {
						JOptionPane.showMessageDialog(null, "BIENVENIDO. HAZ SIDO REGISTRADO.");
						limpiar();
						MAINCRUD mc = new MAINCRUD();
						mc.setVisible(true);
						Register.this.dispose();

					} else {
						JOptionPane.showMessageDialog(contentPane, "NO HAS PODIDO SER REGISTRADO. INTENTA NUEVAMENTE.",
								"ERROR", JOptionPane.ERROR_MESSAGE);

					}
					}else {
						JOptionPane.showMessageDialog(contentPane, "EL CORREO ELECTRÓNICO NO ES VÁLIDO", "ERROR",
							JOptionPane.INFORMATION_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(contentPane, "EL USUARIO YA EXISTE", "ERROR",
							JOptionPane.INFORMATION_MESSAGE);
				}

			} else {
				JOptionPane.showMessageDialog(contentPane, "LAS CONTRASEÑAS NO COINCIDEN.", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void limpiar() {
		txtusuario.setText("");
		txtnombre.setText("");
		txtapellido.setText("");
		txttelefono.setText("");
		txtcorreo.setText("");
		txtpassword.setText("");
		txtpassword2.setText("");

	}

	protected void salir() {
		System.exit(0);
	}

}
