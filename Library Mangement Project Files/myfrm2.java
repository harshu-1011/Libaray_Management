import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class myfrm2 extends JFrame implements ActionListener
{
	//1)Declaration 
	JLabel l1;
		JButton b1,b2,b3,b4;
		
	myfrm2()
	{
		super("LoginForm3");
		setSize(500,500);
		setLocation(100,100);
		setLayout(null);
		
		//2)memory Allocation
		l1=new JLabel("Admin Section ");

		b1=new JButton("Add LIberian");
		b2=new JButton("View Librian");
		b3=new JButton("Delete Librian");
		b4=new JButton("Login Out");
		
		
		//3)add controls on frame
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		//4)setBounds(X,Y,WIDTH,HIGHT);
		
		l1.setBounds(170,50,150,30);
		b1.setBounds(150,100,150,30);
		b2.setBounds(150,140,150,30);
		b3.setBounds(150,180,150,30);
		b4.setBounds(150,220,150,30);
		
		
		
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
	System.exit(0);
			}
		});      
			b1.addActionListener(this);
			b3.addActionListener(this);
		b4.addActionListener(this);
		setVisible(true);
		
	}
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource()==b1)
				{
					new myfrm4();
				dispose();				
				}
					if(e.getSource()==b4)
				{
					new myfrm();
				dispose();				
				}	if(e.getSource()==b3)
				{
					new myfrm5();
				dispose();				
				}
				
				
			}


	public static void main(String args[])
	{
		new myfrm2();
	}	
}