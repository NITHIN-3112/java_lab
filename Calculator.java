import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


class Cal extends JFrame implements ActionListener {
    public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    public JTextField t1;
    public String v = "";
    public String v1 = "0";
    public String op = "";

    Cal()
    {
        setTitle("LAB2_Calculator");
        setSize(350,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel ui = new JPanel(new BorderLayout());
        t1 = new JTextField(40); t1.setFont(new Font("Consolas", Font.PLAIN, 30));
        ui.add(t1, BorderLayout.NORTH);
      
        JPanel  p = new JPanel(new GridLayout(5, 3, 5, 5));
        Font f = new Font("Arial", Font.BOLD,18);
        b1 = new JButton("1");b1.setFont(f); b1.addActionListener(this); p.add(b1);
        b2 = new JButton("2");b2.setFont(f); b2.addActionListener(this); p.add(b2);
        b3 = new JButton("3");b3.setFont(f); b3.addActionListener(this); p.add(b3);
        b4 = new JButton("4");b4.setFont(f); b4.addActionListener(this); p.add(b4);
        b5 = new JButton("5");b5.setFont(f); b5.addActionListener(this); p.add(b5);
        b6 = new JButton("6");b6.setFont(f); b6.addActionListener(this); p.add(b6);
        b7 = new JButton("7");b7.setFont(f); b7.addActionListener(this); p.add(b7);
        b8 = new JButton("8");b8.setFont(f); b8.addActionListener(this); p.add(b8);
        b9 = new JButton("9");b9.setFont(f); b9.addActionListener(this); p.add(b9);
        b10 = new JButton("0");b10.setFont(f); b10.addActionListener(this); p.add(b10);
        b11 = new JButton("+");b11.setFont(f); b11.addActionListener(this); p.add(b11);
        b12 = new JButton("-");b12.setFont(f); b12.addActionListener(this); p.add(b12);
        b13 = new JButton("*");b13.setFont(f); b13.addActionListener(this); p.add(b13);
        b14 = new JButton("/");b14.setFont(f); b14.addActionListener(this); p.add(b14);
        b15 = new JButton("=");b15.setFont(f); b15.addActionListener(this); p.add(b15);
        ui.add(p, BorderLayout.CENTER);
        add(ui);
        
        setVisible(true);
    };

    @Override
    public void actionPerformed(ActionEvent ae){
        String b = ae.getActionCommand();
        switch (b) {
            case "1":{v = v + "1"; t1.setText(v);}break;
            case "2":{v = v + "2"; t1.setText(v);}break;
            case "3":{v = v + "3"; t1.setText(v);}break;
            case "4":{v = v + "4"; t1.setText(v);}break;
            case "5":{v = v + "5"; t1.setText(v);}break;
            case "6":{v = v + "6"; t1.setText(v);}break;
            case "7":{v = v + "7"; t1.setText(v);}break;
            case "8":{v = v + "8"; t1.setText(v);}break;
            case "9":{v = v + "9"; t1.setText(v);}break;
            case "0":{v = v + "0"; t1.setText(v);}break;
            case "+":{op = "+"; v1 = t1.getText(); v = "";}break;
            case "-":{op = "-"; v1 = t1.getText(); v = "";}break;
            case "/":{op = "/"; v1 = t1.getText(); v = "";}break;
            case "":{op = ""; v1 = t1.getText(); v = "";}break;
            case "=":{
                switch (op) { case "+":{
                    v = t1.getText(); if (v.equals("")){
                        v = "0";
                    }
                    long i = Long.parseLong(v1) + Long.parseLong(v); t1.setText(String.valueOf(i));
                    v = "";

                }break; 
            case "-":{
                v = t1.getText(); if (v.equals("")){
                    v = "0";
                }
                long i = Long.parseLong(v1) - Long.parseLong(v); t1.setText(String.valueOf(i));
                v = "";
            }
            case "*":{
                v = t1.getText(); if (v.equals("")){
                    v = "0";
                }
                long i = Long.parseLong(v1) * Long.parseLong(v); t1.setText(String.valueOf(i));
                v = "";
            }
			case "%":{
                v = t1.getText(); if (v.equals("")){
                    v = "0";
                }
                long i = Long.parseLong(v1)  % Long.parseLong(v); t1.setText(String.valueOf(i));
                v = "";
			}
            case "/":{
                v = t1.getText(); if (v.equals("")){
                    v = "0";
                }
                try{
                    long i = Long.parseLong(v1) / Long.parseLong(v); t1.setText(String.valueOf(i));
                    v = "";
                }catch (ArithmeticException e){
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
				
                
            }
        }
            }
        }
        
    }

}
    
public class Calculator{
    public static void main(String[] args)
    {
        new Cal();
    }
}