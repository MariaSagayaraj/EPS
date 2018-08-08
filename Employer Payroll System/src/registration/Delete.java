package registration;

public class Delete {
	
	import javax.swing.JFrame;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.awt.event.ActionEvent;
import java.awt.Color;


public JFrame frame;
private JTextField textField;
public void delete(int id) {
			String url = "jdbc:mysql://localhost:3306/mydatabase";
			String user_name = "root";
			String pass = "";

			String query ="DELETE FROM `payroll` WHERE id="+id+" ";
			try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user_name, pass);
			Statement st = con.createStatement();
			
			int rs = st.executeUpdate(query);
			System.out.println(rs);
			JOptionPane.showMessageDialog(frame, "Record Deleted Succesfully");
			}catch(Exception e){
				JOptionPane.showMessageDialog(frame, "ID not present in the table");
			}
		

		/**
		 * Create the application.
		 */
		public Delete() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.PINK);
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(163, 61, 86, 20);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("ID");
			lblNewLabel.setBounds(87, 61, 46, 14);
			frame.getContentPane().add(lblNewLabel);
			
			
			JLabel lblNewLabel_1 = new JLabel("Delete Record");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_1.setBounds(158, 21, 105, 14);
			frame.getContentPane().add(lblNewLabel_1);
			
			JButton duttonDelete = new JButton("delete");
			duttonDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
						int id = Integer.parseInt(textField.getText());
						delete(id);
					}catch(Exception exception){
						JOptionPane.showMessageDialog(frame, "Invalid ID");
					}
				}
			});
			duttonDelete.setBounds(163, 92, 89, 23);
			frame.getContentPane().add(duttonDelete);
		}
	}

