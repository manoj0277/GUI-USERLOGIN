package db_project;
// ANSKJDN

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VALIDUSER {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField passwordField;
	private JPasswordField pf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VALIDUSER window = new VALIDUSER();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VALIDUSER() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLoginPage = new JLabel("LOGIN PAGE");
		lblLoginPage.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLoginPage.setBounds(144, 25, 149, 27);
		frame.getContentPane().add(lblLoginPage);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(110, 104, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(110, 149, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(246, 103, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(348, 146, 0, 20);
		frame.getContentPane().add(passwordField);
		
		pf1 = new JPasswordField();
		pf1.setBounds(246, 146, 86, 20);
		frame.getContentPane().add(pf1);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String pwd=pf1.getText();
				try {
					Connection con=DriverManager.getConnection
							("jdbc:mysql://localhost:3306/mydb","root","mrec");
					PreparedStatement stn=con.prepareStatement
							("select name,pwd from users1 where name=? and pwd=?");
					stn.setString(1, name);
					stn.setString(2, pwd);
					ResultSet rs=stn.executeQuery();
					if(rs.next())
					{
						JOptionPane.showConfirmDialog(btnSubmit,"valid user");
						
					}else {
						JOptionPane.showConfirmDialog(btnSubmit,"invalid user");
						
					}
							
					
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}				
			}
		});
		btnSubmit.setBounds(183, 199, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\imagulu.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
