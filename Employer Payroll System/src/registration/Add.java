package registration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Add extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblLastName;
	private JLabel lblEmployeeId;
	private JLabel lblDob;
	private JLabel lblGender;
	private JLabel lblContact;
	private JLabel lblAddress;
	private JLabel lblVisaStatus;
	private JLabel lblDateOfHiring;
	private JLabel lblPosition;
	private JLabel lblPassword;
	private JLabel lblConfirmPassword;
	private JLabel lblWelcomeEnterThe;
	private JLabel lblEmployeeRegistration;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_registration frame = new Employee_registration();
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
	public Employee_registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 539, 729);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(202, 97, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 135, 155, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 181, 155, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 227, 155, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 324, 155, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(202, 371, 155, 20);
		contentPane.add(textField_5);
		
		JRadioButton rdbtnNzOrAus = new JRadioButton("NZ or AUS Citizen");
		rdbtnNzOrAus.setBounds(202, 415, 109, 23);
		contentPane.add(rdbtnNzOrAus);
		
		JRadioButton rdbtnPr = new JRadioButton("PR");
		rdbtnPr.setBounds(327, 415, 47, 23);
		contentPane.add(rdbtnPr);
		
		JRadioButton rdbtnWorkVisa = new JRadioButton("Work Visa");
		rdbtnWorkVisa.setBounds(397, 415, 73, 23);
		contentPane.add(rdbtnWorkVisa);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setBounds(202, 451, 73, 23);
		contentPane.add(rdbtnStudent);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(202, 490, 155, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(202, 532, 155, 20);
		contentPane.add(textField_7);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(202, 270, 58, 23);
		contentPane.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(281, 270, 76, 23);
		contentPane.add(rdbtnFemale);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(202, 579, 155, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(202, 620, 155, 20);
		contentPane.add(textField_9);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(370, 656, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(222, 656, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(75, 656, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirstName.setBounds(65, 100, 73, 14);
		contentPane.add(lblFirstName);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLastName.setBounds(65, 138, 73, 14);
		contentPane.add(lblLastName);
		
		lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmployeeId.setBounds(65, 184, 99, 14);
		contentPane.add(lblEmployeeId);
		
		lblDob = new JLabel("D-O-B");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDob.setBounds(65, 230, 73, 14);
		contentPane.add(lblDob);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGender.setBounds(65, 274, 73, 14);
		contentPane.add(lblGender);
		
		lblContact = new JLabel("Contact #");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContact.setBounds(65, 327, 73, 14);
		contentPane.add(lblContact);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(65, 374, 73, 14);
		contentPane.add(lblAddress);
		
		lblVisaStatus = new JLabel("Visa Status");
		lblVisaStatus.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVisaStatus.setBounds(65, 419, 89, 14);
		contentPane.add(lblVisaStatus);
		
		lblDateOfHiring = new JLabel("Date Hired");
		lblDateOfHiring.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfHiring.setBounds(65, 493, 73, 14);
		contentPane.add(lblDateOfHiring);
		
		lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPosition.setBounds(65, 535, 73, 14);
		contentPane.add(lblPosition);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(65, 582, 73, 14);
		contentPane.add(lblPassword);
		
		lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConfirmPassword.setBounds(65, 623, 127, 14);
		contentPane.add(lblConfirmPassword);
		
		lblWelcomeEnterThe = new JLabel("Welcome! Enter the Employee details");
		lblWelcomeEnterThe.setFont(new Font("Elephant", Font.ITALIC, 15));
		lblWelcomeEnterThe.setBounds(129, 61, 341, 25);
		contentPane.add(lblWelcomeEnterThe);
		
		lblEmployeeRegistration = new JLabel("Employee Registration");
		lblEmployeeRegistration.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmployeeRegistration.setBounds(174, 23, 215, 27);
		contentPane.add(lblEmployeeRegistration);
	}
}
