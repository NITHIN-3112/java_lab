import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class TableFile extends JFrame
{
   public TableFile()
	{
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FILES THROW AWT");
		setLayout(new GridLayout(0,3));
		JLabel x = new JLabel();		
		try{
		FileInputStream fs= new FileInputStream("table.txt");
		Scanner s =new Scanner(fs).useDelimiter(",");
		String y;
		String[] arr;
		while(s.hasNextLine())
		{ 

			y = s.nextLine();
			arr = y.split(",");
			for(String i : arr){
				add (new JLabel(i));
			}
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		setVisible(true);
	}
	public static void main(String atgs[])
	{
		new TableFile();
	}
}
		
	