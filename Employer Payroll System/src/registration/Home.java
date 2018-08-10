package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		JLabel lblNewLabel = new JLabel("EMPLOYER PAYROLL SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(170, 11, 271, 29);
		frame.getContentPane().add(lblNewLabel);

		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// here we have called the class Add and made it visible
				new Add().frame.setVisible(true);

			}
		});
		btnNewButton.setBounds(220, 79, 89, 23);
		frame.getContentPane().add(btnNewButton);

		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Delete().frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(220, 138, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		
		JButton btnNewButton_3 = new JButton("View");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new View().frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(220, 256, 89, 23);
		frame.getContentPane().add(btnNewButton_3);

		
		JButton btnNewButton_4 = new JButton("search");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Search().frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(220, 196, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
