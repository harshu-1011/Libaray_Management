import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class myfrm_3 extends JFrame implements ActionListener
{
	//1)Declaration 
	JLabel l1,l2,l3;
	JTextField t1;
	JButton b1,b2;
	JPasswordField p1;
	int ch=3;
		
	myfrm_3()
	{
		super("Login Form2");
		setSize(500,500);
		setLocation(400,200);
		setLayout(null);
		
		//2)memory Allocation
		l3=new JLabel("Liberian Login");
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField();
		b1=new JButton("LOGIN");
		b2=new JButton("EXIT");
		p1=new JPasswordField();
		
		//3)add controls on frame
		
		add(l1);add(l3);		add(l2);
		add(t1);
		add(b1);
		add(b2);
		add(p1);
		
		//4)setBounds
		l3.setBounds(170,50,100,30);
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		t1.setBounds(220,100,150,30);
		p1.setBounds(220,150,150,30);
		b1.setBounds(100,200,100,30);
		b2.setBounds(250,200,100,30);
		//5)Add controls on Listener
		
		b1.addActionListener(this);
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
					if(e.getSource()==b2)
				{
					System.exit(0);
				}
				
				
			
			if(e.getSource() == b1)
			{
				
				String s1 = t1.getText();
				String s2 = p1.getText();
				if(s1.equals("") && s2.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Enter UserName & PassWord.");
				}
					else if(s1.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Enter UserName");
					}
						else if(s2.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter PassWord.");
						}
							else if(ch != 0)
								{ if(s1.equals("Harsh") && s2.equals("test2"))
								{
										JOptionPane.showMessageDialog(null,"Successfully Login...!!!");
										new myfrm3();
				                           dispose();
								}
									else
									{
										JOptionPane.showMessageDialog(null,"Please Try Again..! we have"+(ch-1)+"Chance!!!","Invalid PassWord !!!",JOptionPane.WARNING_MESSAGE);
										ch--;
									}
										if(ch == 0)
											{
												JOptionPane.showMessageDialog(null,"Sorry Can't Login","Invalid PassWord!!!",JOptionPane.ERROR_MESSAGE);
												System.exit(0);
											}}
												t1.setText("");
												p1.setText("");
												
											
											}
											
										}
									


	public static void main(String args[])
	{
		new myfrm_3();
	}	
}



