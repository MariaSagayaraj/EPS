package registration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
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
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 457);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Employee Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(249, 24, 203, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(158, 77, 110, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(328, 78, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(236, 124, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(129, 186, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(129, 231, 46, 14);
		contentPane.add(lblDob);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(129, 273, 65, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(129, 314, 46, 14);
		contentPane.add(lblSalary);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(129, 348, 46, 14);
		contentPane.add(label_3);
		
		JButton btnTimesheet = new JButton("Timesheet");
		btnTimesheet.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				public class Timesheet extends JFrame {

					private JPanel contentPane;
					private JTable table;
					private JTextField textField;
					private JTextField textField_1;
					private JTextField textField_2;
					private JTextField textField_3;
					private JTextField textField_4;

					/**
					 * Launch the application.
					 */
					public static void main(String[] args) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Timesheet frame = new Timesheet();
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
					public Timesheet() {
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 740, 371);
						contentPane = new JPanel();
						contentPane.setBackground(Color.PINK);
						contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
						setContentPane(contentPane);
						contentPane.setLayout(null);
						
						JLabel lblNewLabel = new JLabel("WEEKLY EMPLOYEE TIME SHEET");
						lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
						lblNewLabel.setBounds(262, 21, 253, 20);
						contentPane.add(lblNewLabel);
						
						table = new JTable();
						table.setBorder(new LineBorder(new Color(0, 0, 0)));
						table.setModel(new DefaultTableModel(
							new Object[][] {
								{"DAY", "TIME IN", "TIME OUT", "BREAKTIME", "REGULAR HOURS", "OT HOURS", "TOTAL HOURS"},
								{"Monday", null, null, null, null, null, null},
								{"Tuesday", null, null, null, null, null, null},
								{"Wednesday", null, null, null, null, null, null},
								{"Thursday", null, null, null, null, null, null},
								{"Friday", null, null, null, null, null, null},
								{"Saturday", null, null, null, null, null, null},
								{"Sunday", null, null, null, null, null, null},
							},
							new String[] {
								"Day", "Time In", "Time Out", "Breaktime", "Regular Hours", "OT Hours", "Total Hours"
							}
						));
						table.setBounds(10, 178, 698, 128);
						contentPane.add(table);
						
						JLabel lblNewLabel_1 = new JLabel("Employee Name");
						lblNewLabel_1.setBackground(SystemColor.inactiveCaption);
						lblNewLabel_1.setBounds(43, 76, 81, 14);
						contentPane.add(lblNewLabel_1);
						
						textField = new JTextField();
						textField.setBounds(134, 73, 148, 20);
						contentPane.add(textField);
						textField.setColumns(10);
						
						JLabel lblNewLabel_2 = new JLabel("Employee ID");
						lblNewLabel_2.setBounds(43, 101, 81, 14);
						contentPane.add(lblNewLabel_2);
						
						textField_1 = new JTextField();
						textField_1.setBounds(134, 98, 148, 20);
						contentPane.add(textField_1);
						textField_1.setColumns(10);
						
						JLabel lblNewLabel_3 = new JLabel("Department");
						lblNewLabel_3.setBounds(374, 76, 72, 14);
						contentPane.add(lblNewLabel_3);
						
						textField_2 = new JTextField();
						textField_2.setBounds(456, 73, 100, 20);
						contentPane.add(textField_2);
						textField_2.setColumns(10);
						
						JLabel lblNewLabel_4 = new JLabel("Period Start");
						lblNewLabel_4.setBounds(374, 101, 72, 14);
						contentPane.add(lblNewLabel_4);
						
						JLabel lblPeriodEnds = new JLabel("Period Ends");
						lblPeriodEnds.setBounds(374, 126, 72, 14);
						contentPane.add(lblPeriodEnds);
						
						textField_3 = new JTextField();
						textField_3.setColumns(10);
						textField_3.setBounds(456, 98, 100, 20);
						contentPane.add(textField_3);
						
						textField_4 = new JTextField();
						textField_4.setColumns(10);
						textField_4.setBounds(456, 124, 100, 20);
						contentPane.add(textField_4);
					}
				}

			}
		});
		btnTimesheet.setBounds(126, 360, 89, 23);
		contentPane.add(btnTimesheet);
		
		JButton btnNewButton_1 = new JButton("Payroll");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(258, 360, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
