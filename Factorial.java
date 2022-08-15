import java.applet.*;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Factorial extends JApplet implements ActionListener{
	
	JLabel l1,l2;
	JTextField n1,n2;
	JButton b1;
	@Override
	public void init()
	
	{
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("enter number");
		add(l1);
		JTextField n1 = new JTextField(10);
		add(n1);
		JButton b1 = new JButton("compute");
		add(b1);
		b1.addActionListener(this);
		JLabel l2 = new JLabel("Factorial");
         add(l2);
        JTextField n2 = new JTextField(10);
      add(n2);
	}
  @Override	 
     public void actionPerformed(ActionEvent e)
	 {  
        int a = Integer.parseInt(n1.getText());
       int i,fact = i;
        for( i = 1;i <=a ; i++)
		{
      fact = fact*i;
		}
       n2.setText(String.valueOf(fact));
	 }
}	 

