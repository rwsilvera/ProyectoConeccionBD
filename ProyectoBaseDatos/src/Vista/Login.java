package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblNewLabel.setBounds(130, 11, 111, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		lblNewLabel_1.setBounds(26, 69, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONTRASEÑA");
		lblNewLabel_2.setBounds(26, 94, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(105, 66, 159, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textContraseña = new JPasswordField();
		textContraseña.setBounds(105, 91, 159, 20);
		contentPane.add(textContraseña);
		
		JButton btnIngresarContraseña = new JButton("INGRESAR");
		btnIngresarContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] contraseñaChar = textContraseña.getPassword();
				String contraseñaString = new String(contraseñaChar);
				if(textUsuario.getText().equals("ADMIN")&&contraseñaString.equals("ADMIN")) {
					JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA ");
					Principal principal = new Principal();
					principal.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, " USARIO O CONTRASEÑA INCORRECTA ","ERROR", JOptionPane.ERROR_MESSAGE);
					textUsuario.setText("");
					textContraseña.setText("");
					textUsuario.requestFocus();
				}
						
			}
		});
		btnIngresarContraseña.setBounds(289, 87, 89, 29);
		contentPane.add(btnIngresarContraseña);
	}
}
