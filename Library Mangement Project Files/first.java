import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class myfrm extends JFrame implements ActionListener
{
	//1)Declaration 
		JButton b1,b2,b3;
		
	myfrm()
	{
		super("LoginForm");
		setSize(500,500);
		setLocation(200,200);
		setLayout(null);
		
		//2)memory Allocation
		
		b1=new JButton("Librian login");
		
		b2=new JButton("admin login");
		b3=new JButton("Exit");
		
		
		//3)add controls on frame
		
		add(b1);
		add(b2);
		add(b3);
		
		
		//4)setBounds
		
		b2.setBounds(100,150,150,30);
		b1.setBounds(280,150,150,30);
		b3.setBounds(180,200,150,30);

		
		b1.addActionListener(this);
		b3.addActionListener(this);
		b2.addActionListener(this);
		
		
		
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
					new myfrm_3();
				dispose();				
				}
				
			if(e.getSource() == b2)
			{
				new myfrm1();
				        dispose();	
			}
				
			if(e.getSource() == b3)
			{
				System.exit(0);
				}
			
				
				
			}
}
class first
{
	

	public static void main(String args[])
	{
		new myfrm();
	}	
}
