package db_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class studentreg {

	protected static final String DriveManger = null;
	private JFrame frame;
	private JTextField tb3;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentreg window = new studentreg();
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
	public studentreg() {
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
		
		JLabel lblStudentRegistraion = new JLabel("STUDENT REGISTRAION FORM");
		lblStudentRegistraion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentRegistraion.setBounds(85, 26, 252, 14);
		frame.getContentPane().add(lblStudentRegistraion);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(103, 108, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(103, 68, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BRANCH");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(103, 151, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MARKS");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(103, 192, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "ECE", "EEE", "CIVIL", "MECH", "CSE"}));
		cb1.setBounds(235, 147, 86, 22);
		frame.getContentPane().add(cb1);
		
		tb3 = new JTextField();
		tb3.setBounds(235, 189, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		tb1 = new JTextField();
		tb1.setBounds(235, 67, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(235, 107, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rno=tb1.getText();
				int rollno = Integer.parseInt(rno);
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String m=tb3.getText();
				int marks=Integer.parseInt(m);
				try {
					Connection con=DriverManager.getConnection
							("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into student values('"+rollno+"','"+name+"','"+branch+"','"+marks+"')";
					java.sql.Statement stn=con.createStatement();
					stn.executeUpdate(q);
		              con.close();
					JOptionPane.showConfirmDialog(btnSubmit, "Inserted sucessfully");
					
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
					
				}
				
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setBounds(165, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\2021_dodge_charger_srt_hellcat_redeye_4k_2-HD.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
