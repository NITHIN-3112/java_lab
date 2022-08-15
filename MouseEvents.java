import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
class MouseEvents extends JFrame implements MouseListener,MouseMotionListener
{
	JLabel x;
	public MouseEvents()
	{
		
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("MOUSE EVENT");
	x = new JLabel();
	Font f =new Font("Arial",Font.BOLD,20);
	setFont(f);
	setForeground(Color.blue);
	add(x);
	
    setLayout(null);
	x.setBounds(100,55,200,100);
	addMouseListener(this);
	addMouseMotionListener(this);
	setVisible(true);
}
@Override
public void mouseClicked(MouseEvent m)
{
	x.setText("Mouse Clicked");
}
@Override
public void mouseEntered(MouseEvent m)
{
	x.setText("Mouse Entered");
}
@Override
public void mouseExited(MouseEvent m)
{
	x.setText("mouse exited");
}
@Override
public void mousePressed(MouseEvent m)
{
	x.setText("mouse pressed");
}
@Override
public void mouseReleased(MouseEvent m)
{
	x.setText("mouse released");
}
@Override
public void mouseMoved(MouseEvent m)
{
	x.setText("mouse moved");
}
@Override
public void mouseDragged(MouseEvent m)
{
	x.setText("mouse dragged");
}

	public static void main(String args[])
	{
		new MouseEvents();
	}
}