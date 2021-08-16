import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Principal extends JFrame {
	
	public static Login frmLog;
	public static Register frmReg;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Principal");
		setBounds(100, 100, 713, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLogin.setBounds(64, 529, 232, 82);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//USO DE SINGLETON
			//Cuando una instancia ya está creada no vuelve a crear.
			//En este caso, el formulario de Login ya está creado.
				
				if (frmLog == null) {
					frmLog = new Login();
					frmLog.setVisible(true);
				}
				
			}
		});
		contentPane.setLayout(null);
		btnLogin.setFont(new Font("Pumpkin Pancakes", Font.BOLD, 58));
		btnLogin.setBackground(new Color(102, 102, 102));
		contentPane.add(btnLogin);
		
		JButton btnRegistrarme = new JButton("REGISTRARME");
		btnRegistrarme.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRegistrarme.setBounds(322, 528, 312, 82);
		btnRegistrarme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//USO DE SINGLETON
			//Cuando una instancia ya está creada no vuelve a crear.
			//En este caso, el formulario de Registro ya está creado.
				
				
				if (frmReg == null) {
					frmReg = new Register();
					frmReg.setVisible(true);
				}
			}
		});
		btnRegistrarme.setFont(new Font("Pumpkin Pancakes", Font.BOLD, 54));
		btnRegistrarme.setBackground(new Color(153, 102, 153));
		contentPane.add(btnRegistrarme);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(87, 84, 520, 417);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\prisc\\OneDrive\\Escritorio\\images\\user.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BIENVENIDO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("ELEGANT TYPEWRITER", Font.BOLD, 48));
		lblNewLabel_1.setBounds(93, 24, 489, 60);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\prisc\\OneDrive\\Escritorio\\images\\exit.png"));
		btnNewButton.setBounds(578, 24, 99, 49);
		contentPane.add(btnNewButton);
	}

}
