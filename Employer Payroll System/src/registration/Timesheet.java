import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;

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
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WEEKLY EMPLOYEE TIME SHEET");
		lblNewLabel.setBounds(262, 21, 168, 14);
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
