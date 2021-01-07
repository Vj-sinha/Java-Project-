package Hotel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

public class Billing implements ActionListener
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	JLabel lblNewLabel_3,lblNewLabel_11,lblNewLabel_16,lblNewLabel_18;
	JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Billing window = new Billing();
					window.frame.setVisible(true);
				}
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Billing() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1033, 752);
		frame.setTitle("XYZ Hotel Billing Page");
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Billing Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(379, 10, 175, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Booking ID:");
		lblNewLabel_1.setBounds(10, 72, 103, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(165, 126, 78, 26);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Room No. :");
		lblNewLabel_2.setBounds(10, 168, 93, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(165, 168, 78, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Days Resided:");
		lblNewLabel_4.setBounds(10, 220, 103, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(165, 221, 78, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 76, 78, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Room Type");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(10, 265, 115, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Check-In Date:");
		lblNewLabel_6.setBounds(10, 329, 109, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Check-Out Date:");
		lblNewLabel_7.setBounds(10, 382, 115, 32);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 335, 93, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(165, 386, 93, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Meals Ordered (Veg.) :");
		lblNewLabel_8.setBounds(545, 329, 137, 32);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Meals Ordered (Non-Veg.) :");
		lblNewLabel_9.setBounds(545, 382, 137, 32);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setBounds(747, 329, 56, 32);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(747, 382, 56, 32);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Housing Charges:");
		lblNewLabel_10.setBounds(10, 485, 103, 26);
		frame.getContentPane().add(lblNewLabel_10);
		
	    lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(165, 485, 93, 26);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Booking Name :");
		lblNewLabel_12.setBounds(545, 179, 137, 32);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_6 = new JTextField();
		textField_6.setBounds(692, 180, 144, 32);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Quantity");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(721, 277, 115, 32);
		frame.getContentPane().add(lblNewLabel_13);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.setBounds(395, 435, 103, 32);
		btnNewButton_1.addActionListener(this);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_14 = new JLabel("VAT/GST :");
		lblNewLabel_14.setBounds(10, 531, 93, 32);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Advance Payed: ");
		lblNewLabel_15.setBounds(10, 573, 115, 32);
		frame.getContentPane().add(lblNewLabel_15);
		
		textField_7 = new JTextField();
		textField_7.setBounds(165, 574, 93, 32);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBounds(165, 528, 93, 26);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Net Amount :");
		lblNewLabel_17.setBounds(10, 626, 103, 32);
		frame.getContentPane().add(lblNewLabel_17);
		
		JButton btnNewButton_2 = new JButton("Calculate Bill");
		btnNewButton_2.setBounds(395, 674, 109, 32);
		btnNewButton_2.addActionListener(this);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Gross Bill");
		btnNewButton_3.setBounds(555, 674, 109, 32);
		btnNewButton_3.addActionListener(this);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Kitchen Bill");
		btnNewButton_4.setBounds(710, 674, 115, 32);
		btnNewButton_4.addActionListener(this);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.setBounds(860, 674, 103, 32);
		btnNewButton_5.addActionListener(this);
		frame.getContentPane().add(btnNewButton_5);
		
		rdbtnNewRadioButton = new JRadioButton("Executive");
		rdbtnNewRadioButton.setBounds(165, 271, 115, 26);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Premium");
		rdbtnNewRadioButton_1.setBounds(307, 271, 126, 26);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setBounds(165, 631, 93, 27);
		frame.getContentPane().add(lblNewLabel_18);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String g;
		double g6 = 0.0,g7 = 0.0;
		double g1=0,g0,g8;
		double g9,g10,g11=0.0,g12,g13;
		double g4,g5;
		
		if(e.getActionCommand().equals("Search"))
		{
			try
			{
				int k=Integer.parseInt(textField_1.getText());
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","root");
				PreparedStatement ps=con.prepareStatement("select * from customerinfo where bid = ?");
				ps.setInt(1, k);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
			    lblNewLabel_3.setText(rs.getString("rno"));
				textField_2.setText(rs.getString("date"));
				textField_6.setText(rs.getString("bname"));
				}
			
				
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			} 
		}
		
		else if(e.getActionCommand().equals("Confirm"))
		{
			g=textField_6.getText();
			g0=Double.parseDouble(textField.getText());
			
			if(rdbtnNewRadioButton.isSelected())
			{
				g1=2500;
			}
			else if(rdbtnNewRadioButton_1.isSelected())
			{
				g1=4100;
			}
		
			g1=g1*g0;
			g8= (18.0/100)*g1; 
			lblNewLabel_11.setText(String.valueOf(g1));
			lblNewLabel_16.setText(String.valueOf(g8));
			
		}
		else if(e.getActionCommand().equals("Calculate Bill"))
		{
			g9=Double.parseDouble(lblNewLabel_11.getText());
		    g10=Double.parseDouble(lblNewLabel_16.getText());
			g11=g10+g9;
			g12=Double.parseDouble(textField_7.getText());
			
			g11=g11-g12;
			lblNewLabel_18.setText(String.valueOf(g11)); 
			
		}
		else if(e.getActionCommand().equals("Gross Bill"))
		{
			
			
			g9=Double.parseDouble(lblNewLabel_11.getText());
		    g10=Double.parseDouble(lblNewLabel_16.getText());
			g11=g10+g9;
			g12=Double.parseDouble(textField_7.getText());
			
			g11=g11-g12;
		    
			g4=Double.parseDouble(textField_4.getText());
			g5=Double.parseDouble(textField_5.getText());
			
			g6=g4*199;
			g7=g5*249;
			
			g13=g11+g6+g7;
			
			JOptionPane.showMessageDialog(frame," Your Gross Bill is: "+g13);
		}
		else if(e.getActionCommand().equals("Kitchen Bill"))
		{
			g4=Double.parseDouble(textField_4.getText());
			g5=Double.parseDouble(textField_5.getText());
			
			g6=g4*199;
			g7=g5*249;
			
			double g14=g6+g7;
			JOptionPane.showMessageDialog(frame,"Your Kitchen Bill is: "+g14);
			
		}
		else if(e.getActionCommand().equals("Exit"))
		{
			frame.setVisible(false);
		}
			
	}
}
