import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class start extends JFrame implements ActionListener
{
	//1)Declaration 
	JLabel l1,l2;
	JTextField t1;
		JButton b1,b2;
		
	start()
	{
		super("LoginForm11");
		setSize(500,500);
		setLocation(200,200);
		setLayout(null);
		
		//2)memory Allocation
		
		b1=new JButton("Start");
		l1=new JLabel(" Hii I am Rushikesh You are Enter In ");
		l2=new JLabel("     Libery Management System  ");
		

		
		
		//3)add controls on frame
		
		add(b1);add(l1);add(l2);
		
		
		//4)setBounds

		l1.setBounds(120,100,250,30);
		l2.setBounds(120,150,250,30);
				
		b1.setBounds(150,220,100,30);
		
		b1.addActionListener(this);
		
		
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
	System.exit(0);
			}
		});      
		
		setVisible(true);
		
	}
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==b1)
				{
				
				new myfrm();
				dispose();
				}
			
			}
				
	public static void main(String args[])
	{
		new start();
	}	
}
