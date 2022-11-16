package shop.graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class MyWindow extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MyWindow frame = new MyWindow();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	
	//CONSTRUCTOR
	
	
	public MyWindow() {
		
		
		
		createEvents();
		initComponents();
		
		
	}

	
	//////////////////////////////////////////////////////////
	//This method contains all the code for creating and
	//initializing components.
	//////////////////////////////////////////////////////////
	private void initComponents()
	{	
		setAlwaysOnTop(true);
		setTitle("L.A. Computer Accessories Shop");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(MyWindow.class.getResource("/shop/graphics/myIcon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 495);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String x = JOptionPane.MESSAGE_PROPERTY;
	}
	
	
	///////////////////////////////////////////////////////////////
	//This method contains all of the code for creating events
	///////////////////////////////////////////////////////////////
	
	private void createEvents() 
	{
		
	
	}
}

