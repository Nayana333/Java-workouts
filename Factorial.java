import java.awt.event.*;
import javax.swing.*;
public class Factorial extends JApplet implements ActionListener
{
    JLabel l1,l2;
    JButton b;
    JTextField t1,t2;
    public void init()
    {
        setLayout(null);
        l1=new JLabel("number");
        l1.setBounds(100,50,200,50);
        t1=new JTextField();
         t1.setBounds(100,50,200,50);
         b=new JButton("result");
         b.setBounds(150,150,100,50);
         l2=new JLabel("factorial");
         l2.setBounds(100,250,200,50);
         t2=new JTextField();
         t2.setBounds(2000,150,200,50);
         add(l1);
         add(l2);
         add(t1);
         add(t2);
         add(b);
         b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)

{
    int x=Integer.parseInt(t1.getText());
    int f=1;
    for(int i=x;i>1;i--)
    {
       f= f*i;
    
    }
    t2.setText(Integer.toString(f));
}
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    
