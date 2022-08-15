import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPanel;    
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener; 
class TrafficLights extends JFrame implements ItemListener
{
	JRadioButton r1,r2,r3;
	JPanel p1,p2;
	JLabel l1,l2;
	public TrafficLights()
	{
		setSize(900,500);
		setTitle("TRAFFIC LIGHTS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		p1 = new JPanel(new FlowLayout());
		Font f = new Font("Arial",Font.BOLD,20);
		l1 = new JLabel();
		l1.setFont(f);
		p1.add(l1);
		add(p1);
		p2 = new JPanel(new FlowLayout());
		l2 = new JLabel("select lights");
		p2.add(l2);
		ButtonGroup bg  = new ButtonGroup();
		r1=new JRadioButton("Red");
		r2=new JRadioButton("Yellow");
		r3=new JRadioButton("Green");
		p2.add(r1);
		p2.add(r2);
	    p2.add(r3);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		r1.setBackground(Color.red);
		r2.setBackground(Color.yellow);
		r3.setBackground(Color.green);
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		add(p2);
		setVisible(true);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
	   JRadioButton r =	(JRadioButton)e.getSource();
	   switch(r.getText())
	   {
		   case  "Red":  
		   l1.setText("STOP");
		    l1.setForeground(Color.red);
		break;
		case "Yellow":
		
	     l1.setText("READY");
		 l1.setForeground(Color.yellow);
		 break;
		 case  "Green":
		  l1.setText("GO");
		  l1.setForeground(Color.green);
		  break;
	   }
		
	}

	public static void main(String args[])
	{
		new TrafficLights();
	}
	
}