package SAMPLE3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METROTICKET {

	private JFrame frame;
	private JTextField tb1;
	protected JComboBox cb1;
	protected JComboBox cb3;
	protected JComboBox cb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METROTICKET window = new METROTICKET();
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
	public METROTICKET() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMertoTicketBooking = new JLabel("MERTO TICKET BOOKING");
		lblMertoTicketBooking.setForeground(new Color(0, 0, 0));
		lblMertoTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMertoTicketBooking.setBounds(131, 23, 220, 14);
		frame.getContentPane().add(lblMertoTicketBooking);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(96, 62, 73, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblSource = new JLabel("SOURCE");
		lblSource.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSource.setBounds(96, 106, 113, 14);
		frame.getContentPane().add(lblSource);
		
		JLabel lblDestination = new JLabel("DESTINATION");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDestination.setBounds(96, 152, 113, 14);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblNumberTickets = new JLabel("NUMBER TICKETS");
		lblNumberTickets.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumberTickets.setBounds(96, 202, 156, 14);
		frame.getContentPane().add(lblNumberTickets);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name= tb1.getText();
				String source = (String) cb1.getSelectedItem();
				
				String destination= (String) cb2.getSelectedItem();
				String tickets = (String) cb3.getSelectedItem();
				int nt= Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination)) {
					JOptionPane.showConfirmDialog(btnSubmit, "Please Check Stations");
					
				}else
				{
					bill+=nt*45;
					JOptionPane.showConfirmDialog(btnSubmit, "NAME :"+ name+ 
							"\n SOURCE :"+ source + "\n DESTINATION :"+ destination + "\n NUMBER TICKETS :"+nt+ "\n AMOUNT :" + bill);
				}

				
				
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setBounds(181, 254, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		tb1 = new JTextField();
		tb1.setBounds(234, 59, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHP", "LB.NAGAR", "SECUNDRABAD WEST", "SECUNDRABAD EAST", "UPPAL", "KOTI", "MIYAPUR", "AMMERPET"}));
		cb1.setBounds(234, 102, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHP", "LB.NAGAR", "SECUNDRABAD WEST", "SECUNDRABAD EAST", "UPPAL", "KOTI", "MIYAPUR", "AMMERPET"}));
		cb2.setBounds(234, 150, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		cb3.setBounds(234, 194, 86, 22);
		frame.getContentPane().add(cb3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\METRO1.jpg"));
		lblNewLabel.setBounds(0, 0, 459, 327);
		frame.getContentPane().add(lblNewLabel);
	}
}
