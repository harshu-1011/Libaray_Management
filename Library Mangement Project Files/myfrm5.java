import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class myfrm5 extends JFrame implements ActionListener
{
	//1)Declaration 
	JLabel l1;
	JTextField t1;
		JButton b1,b2;
		
	myfrm5()
	{
		super("LoginForm5");
		setSize(500,500);
		setLocation(200,200);
		setLayout(null);
		
		//2)memory Allocation
		
		b2=new JButton("Back");
		b1=new JButton("Delete");
		l1=new JLabel("Enter Id");
		t1=new JTextField();
		

		
		
		//3)add controls on frame
		
		add(b1);add(l1);
		add(b2);add(t1);
		
		
		//4)setBounds

		l1.setBounds(120,100,150,30);
		t1.setBounds(240,100,150,30);
				
		b1.setBounds(180,200,100,30);
		b2.setBounds(310,350,100,30);
		
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
				if(e.getSource()==b1)
				{
					String s1 = t1.getText();
				     if(s1.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Enter id.");
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Delete Successfully ...!!!");
				new myfrm2();
				dispose();
				}
				t1.setText("");
				}
			
				
			if(e.getSource() == b2)
			{
				new myfrm2();
				dispose();
			}
			}
				
		
				
			

	

	public static void main(String args[])
	{
		new myfrm5();
	}	
}
