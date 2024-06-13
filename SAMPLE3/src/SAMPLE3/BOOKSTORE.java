package SAMPLE3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class BOOKSTORE {
	
	int items=0;
	int amount=0;

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JLabel lblNewLabel_1;
	private JButton button_1;
	private JButton button_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BOOKSTORE window = new BOOKSTORE();
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
	public BOOKSTORE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 738, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblItem = new JLabel("ITEM");
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblItem.setBounds(430, 12, 86, 14);
		frame.getContentPane().add(lblItem);
		
		JLabel lblNewLabel = new JLabel("AMOUNT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(430, 46, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(562, 11, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(562, 45, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		lblNewLabel_1 = new JLabel("BOOKSTORE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(131, 34, 172, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\IMG1.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items+=1;
				amount+=300;
				tb1.setText(""+ items);
				tb2.setText(""+ amount);
				
				
				
				
			}
		});
		button.setBounds(62, 89, 165, 185);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\IMG3.jpg"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				items+=1;
				amount+=500;
				tb1.setText(""+ items);
				tb2.setText(""+ amount);
				
				
				
				
			}
		});
		button_1.setBounds(282, 100, 172, 174);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\WATCH.jpg"));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				items+=1;
				amount+=800;
				tb1.setText(""+ items);
				tb2.setText(""+ amount);
				
				
				
				
				
			}
		});
		button_2.setBounds(520, 101, 179, 161);
		frame.getContentPane().add(button_2);
		
		lblNewLabel_2 = new JLabel("300 /-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(116, 286, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("500 /-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(361, 285, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("800 /-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(581, 285, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
