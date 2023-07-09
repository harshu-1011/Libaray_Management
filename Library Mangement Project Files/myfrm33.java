import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class myfrm33 extends JFrame implements ActionListener
{
	//1)Declaration 
	JLabel l1,l2,l3,l4,l5,l6;
		JButton b1,b2;
		JTextField p1,t1,t2,t3,t4;
		int ch=3;
		
	myfrm33()
	{
		super("LoginForm4");
		setSize(500,500);
		setLocation(100,100);
		setLayout(null);
		
		//2)memory Allocation
		l1=new JLabel("book Section ");
		l2=new JLabel("No");
		l3=new JLabel("Name");
		l4=new JLabel("Aurthor");
		l5=new JLabel("Publisher");
		l6=new JLabel("Quantity");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		p1=new JTextField();
		
		b1=new JButton("Add Book");
		b2=new JButton("Back");



		
	//	b6=new JButton("Login Out");
		
		
		//3)add controls on frame
		
		add(l1);			
		add(l2);    add(l3);add(l4);add(l5);add(l6);    add(t1);add(t2);add(t3);add(t4);
		add(p1); add(b1);add(b2);
		
		
		
		//4)setBounds(X,Y,WIDTH,HIGHT);
		
		l1.setBounds(170,50,150,30);
		l2.setBounds(130,100,150,30);
		t1.setBounds(250,100,150,30);
		t2.setBounds(250,180,150,30);
		t3.setBounds(250,220,150,30);
		t4.setBounds(250,260,150,30);

		l3.setBounds(130,140,150,30);
		l4.setBounds(130,180,150,30);
		l5.setBounds(130,220,150,30);
		l6.setBounds(130,260,150,30);
		p1.setBounds(250,140,150,30);
		
		b1.setBounds(170,350,150,30);
		b2.setBounds(320,390,150,30);

	
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
               if(e.getSource() == b1)
			{
				
				String s1 = t1.getText();
				String s2 = p1.getText();
				String s3 = t2.getText();
				String s4 = t3.getText();
				String s5 = t4.getText();
				if(s1.equals("") && s2.equals("") && s3.equals("")&& s4.equals("")&& s5.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Enter No & Name & Aurthor & Publisher & Quantity   .");
				}
					else if(s1.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Enter No");
					}
						else if(s2.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter Name.");
						}
						else if(s3.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter Aurthor.");
						}
						else if(s4.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter Publisher.");
						}
						else if(s5.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter Quantity.");
						}
						else 
							if(s1==("") && s2==("")&& s3==("")&& s4==("")&& s5==(""))
								{
									System.out.println("\n Enter a Data");
								}
								else
								{
										JOptionPane.showMessageDialog(null,"Successfully Insert Data...!!!");
										new myfrm3();
				                           dispose();
								}
									
												t1.setText("");
										        p1.setText("");
												t2.setText("");
												t3.setText("");
												t4.setText("");
												
								
				}
				if(e.getSource()==b2)
				{
				new myfrm3();
				dispose();
				}
				
			}


	public static void main(String args[])
	{
		new myfrm33();
	}	
}