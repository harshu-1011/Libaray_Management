import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class myfrm3 extends JFrame implements ActionListener
{
	//1)Declaration 
	JLabel l1;
		JButton b1,b2,b3,b4,b5,b6;
		
	myfrm3()
	{
		super("LoginForm4");
		setSize(500,500);
		setLocation(100,100);
		setLayout(null);
		
		//2)memory Allocation
		l1=new JLabel("Librian Section ");

		b1=new JButton("Add Books");
		b2=new JButton("View Books");
		b3=new JButton("Issue Book");
		b4=new JButton("View Issue Book");
		b5=new JButton("Return Book");
		b6=new JButton("Login Out");
		
		
		//3)add controls on frame
		
		add(l1);
		add(b1);add(b5);add(b6);
		add(b2);
		add(b3);
		add(b4);
		
		
		//4)setBounds(X,Y,WIDTH,HIGHT);
		
		l1.setBounds(170,50,150,30);
		b1.setBounds(150,100,150,30);
		b2.setBounds(150,140,150,30);
		b3.setBounds(150,180,150,30);
		b4.setBounds(150,220,150,30);
		b5.setBounds(150,260,150,30);
		b6.setBounds(150,300,150,30);
		
		b1.addActionListener(this);
		b6.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
	System.exit(0);
			}
		});      
		
		setVisible(true);
		b6.addActionListener(this);
		
	}
			public void actionPerformed(ActionEvent e)
			{	
				if(e.getSource()==b1)
				{
					new myfrm33();
				dispose();				
				}
				
				if(e.getSource()==b6)
				{
					new myfrm();
				dispose();				
				}
				
			}


	public static void main(String args[])
	{
		new myfrm3();
	}	
}