package Hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome implements ActionListener
{
    Registration b;
	private JFrame frmXyzHotelPvt;

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
					Welcome window = new Welcome();
					window.frmXyzHotelPvt.setVisible(true);
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
	public Welcome() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		frmXyzHotelPvt = new JFrame();
		frmXyzHotelPvt.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME!");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 31, 457, 49);
		frmXyzHotelPvt.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("XYZ Hotel Management System.");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(64, 105, 548, 62);
		frmXyzHotelPvt.getContentPane().add(lblNewLabel_1);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnProceed.setBounds(479, 301, 151, 42);
		btnProceed.addActionListener(this);
		frmXyzHotelPvt.getContentPane().add(btnProceed);
		
		JLabel lblNewLabel_2 = new JLabel(" 16 Cannaut Palace,Opposite Nehru Statue,  Kolkata-700020. Contact: 40717039(+33).");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 207, 627, 84);
		frmXyzHotelPvt.getContentPane().add(lblNewLabel_2);
		frmXyzHotelPvt.setTitle("XYZ Hotel Pvt & Ltd.");
		frmXyzHotelPvt.setBounds(100, 100, 685, 402);
		frmXyzHotelPvt.setVisible(true);
		frmXyzHotelPvt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
	        if(e.getActionCommand().equals("Proceed"))
			{
		       b=new Registration();
			}
		
	}

}
