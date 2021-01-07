package Hotel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registration implements ActionListener 
{
    Billing b;
	private JFrame frmBillingPage;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtDdmmyyyy;
	private JTextField textField_7;
	private JTextField textField_8;
	JComboBox<String> comboBox,comboBox_1,comboBox_2;
    JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1;
    public int s;
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
					Registration window = new Registration();
					window.frmBillingPage.setVisible(true);
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
	Registration() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmBillingPage = new JFrame();
		frmBillingPage.setTitle("Registration Page");
		frmBillingPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Booking ID:");
		lblNewLabel.setBounds(10, 26, 118, 40);
		frmBillingPage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Booking Name:");
		lblNewLabel_1.setBounds(10, 76, 118, 40);
		frmBillingPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setBounds(10, 126, 137, 40);
		frmBillingPage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adult Heads:");
		lblNewLabel_3.setBounds(10, 188, 118, 40);
		frmBillingPage.getContentPane().add(lblNewLabel_3);
		
		String t[]= {"Select","1","2","3","4","5"};
		comboBox = new JComboBox(t);
		comboBox.setBounds(196, 192, 76, 33);
		frmBillingPage.getContentPane().add(comboBox);
		
        JLabel lblNewLabel_4 = new JLabel("Infants (Below Age 6):");
		lblNewLabel_4.setBounds(10, 247, 137, 40);
		frmBillingPage.getContentPane().add(lblNewLabel_4);
		
		String g[]= {"Select","0","1","2","3","4"};
		
		comboBox_1 = new JComboBox(g);
		comboBox_1.setBounds(196, 251, 76, 33);
		frmBillingPage.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Address:");
		lblNewLabel_5.setBounds(10, 310, 118, 40);
		frmBillingPage.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PIN CODE:");
		lblNewLabel_6.setBounds(10, 371, 118, 33);
		frmBillingPage.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Contact No. :");
		lblNewLabel_7.setBounds(10, 414, 112, 33);
		frmBillingPage.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Alt. Phone Number :");
		lblNewLabel_8.setBounds(10, 457, 118, 28);
		frmBillingPage.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Age :");
		lblNewLabel_9.setBounds(557, 134, 93, 31);
		frmBillingPage.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Verified ID(Type) :");
		lblNewLabel_10.setBounds(4, 509, 124, 40);
		frmBillingPage.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(557, 591, 118, 43);
		btnNewButton.addActionListener(this);
		frmBillingPage.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Proceed to Billing");
		btnNewButton_1.setBounds(744, 591, 148, 40);
		btnNewButton_1.addActionListener(this);
		frmBillingPage.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(296, 43, 86, 28);
		frmBillingPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 76, 186, 32);
		frmBillingPage.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(741, 133, 93, 34);
		frmBillingPage.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(196, 314, 346, 34);
		frmBillingPage.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(196, 371, 118, 34);
		frmBillingPage.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(196, 414, 118, 35);
		frmBillingPage.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(196, 457, 118, 33);
		frmBillingPage.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		String []v= {"Select","Aadhar Card","PAN Card","Voter ID","Driver License"};
		comboBox_2 = new JComboBox(v);
		comboBox_2.setBounds(196, 515, 118, 28);
		frmBillingPage.getContentPane().add(comboBox_2);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.setBounds(381, 591, 112, 43);
		btnNewButton_2.addActionListener(this);
		frmBillingPage.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_11 = new JLabel("Date:");
		lblNewLabel_11.setBounds(557, 79, 93, 34);
		frmBillingPage.getContentPane().add(lblNewLabel_11);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setHorizontalAlignment(SwingConstants.CENTER);
		Date dt=new Date();
		DateFormat df=new SimpleDateFormat("d-M-y");
		String j=df.format(dt);
		txtDdmmyyyy.setText(j);
		txtDdmmyyyy.setBounds(722, 76, 112, 33);
		frmBillingPage.getContentPane().add(txtDdmmyyyy);
		txtDdmmyyyy.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Room Alloted :");
		lblNewLabel_12.setBounds(557, 199, 137, 41);
		frmBillingPage.getContentPane().add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(722, 194, 112, 34);
		frmBillingPage.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("E-mail ID  :");
		lblNewLabel_13.setBounds(557, 371, 86, 33);
		frmBillingPage.getContentPane().add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setBounds(707, 374, 196, 28);
		frmBillingPage.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(196, 136, 112, 29);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(330, 136, 112, 30);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		
		frmBillingPage.getContentPane().add(rdbtnNewRadioButton);
		frmBillingPage.getContentPane().add(rdbtnNewRadioButton_1);
		
		frmBillingPage.setBounds(100, 100, 1019, 724);
		frmBillingPage.setVisible(true);
		//frmBillingPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
    
	if(e.getActionCommand().equals("Proceed to Billing"))
    {
    	b=new Billing();
    }
   
	if(e.getActionCommand().equals("Home"))
    {
    	frmBillingPage.setVisible(false);
    }
    
	if(e.getActionCommand().equals("Submit"))
    {
    	
       try 
       {
    	    
    	    s=Integer.parseInt(textField.getText());                          //id
        	String s0=textField_1.getText();                                     //name
        	String s1=txtDdmmyyyy.getText();									 //date
        	String s2="";
        	if(rdbtnNewRadioButton.isSelected())
    		{
    		    s2="Male";
    		}
    		else if(rdbtnNewRadioButton_1.isSelected())                          //gender
    		{
    			s2="Female";
    		}
        	
        	int s3=Integer.parseInt(textField_2.getText());									 //age
        	String s4=comboBox.getItemAt(comboBox.getSelectedIndex());           //heads
        	String s5=comboBox_1.getItemAt(comboBox_1.getSelectedIndex());      //infants
        	String s6=textField_7.getText();									 //room no.
        	
        	
        	String s7=textField_3.getText();									//address									 
        	String s8=textField_4.getText();									//pin code
        	String s9=textField_8.getText();                                   //email
        	String s10=textField_5.getText();									//contact
        	String s11=textField_6.getText();									//alternate contact
        	String s12=comboBox_2.getItemAt(comboBox_2.getSelectedIndex());      //id proof
        	

        	
        	//SQL Connection and Database Query
        	Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","root");
    	   
			PreparedStatement ps=con.prepareStatement("insert into customerinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, s);
			ps.setString(2,s0);
			ps.setString(3,s1);
			ps.setString(4,s2);
			ps.setInt(5,s3);
			ps.setString(6,s4);
			ps.setString(7,s5);
			ps.setString(8,s6);
			ps.setString(9,s7);
			ps.setString(10,s8);
			ps.setString(11,s9);
			ps.setString(12,s10);
			ps.setString(13,s11);
			ps.setString(14,s12);
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				JOptionPane.showMessageDialog(frmBillingPage,"Record Submitted Successfully!");
			}
		}
    	catch (ClassNotFoundException e1) 
    	{
		
			e1.printStackTrace();
		} 
    	catch (SQLException e1) 
    	{
		
			e1.printStackTrace();
		}
    	
    }
    /*if(e.getActionCommand().equals("Confirm"))
    {
    	int s=Integer.parseInt(textField.getText());                          //id
    	String s0=textField_1.getText();                                     //name
    	String s1=txtDdmmyyyy.getText();									 //date
    	String s2="";
    	if(rdbtnNewRadioButton.isSelected())
		{
		    s2="Male";
		}
		else if(rdbtnNewRadioButton_1.isSelected())                          //gender
		{
			s2="Female";
		}
    	
    	String s3=textField_2.getText();									 //age
    	String s4=comboBox.getItemAt(comboBox.getSelectedIndex());           //heads
    	String s5=textField_7.getText();									 //room no.
    	String s6=comboBox_1.getItemAt(comboBox_1.getSelectedIndex());      //infants
    	
    	String s7=textField_3.getText();									//address									 
    	String s8=textField_4.getText();									//pin code
    	String s9=textField_8.getText();                                   //email
    	String s10=textField_5.getText();									//contact
    	String s11=textField_6.getText();									//alternate contact
    	String s12=comboBox_2.getItemAt(comboBox_2.getSelectedIndex());      //id proof
    	System.out.println(s+"   "+s0+"   "+s1+"    "+s2+"   "+s3+"    "+s4+"    "+s5+"   "+s6+"	"+s7+"	 "+s8+"	"+s9+"	"+s10+"	   "+s11+"   "+s12);
    	
    	
    	
    }
    */
		
	}
}
