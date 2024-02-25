import java.awt.*;
import java.applet.*;
public class Pass extends Applet
{
public void paint(Graphics g)
{
    String name=getParameter("name");
    String rollno=getParameter("rollno");
    g.drawString("name="+name,25,20);
    g.drawString("rollno="+rollno,20,40);
    
}
}