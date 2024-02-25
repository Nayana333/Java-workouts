import java .applet.*;
import java .awt.*;
public class Face extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.yellow);
g.fillOval(80,70,150,150);
g.setColor(Color.black);
g.fillOval(120,120,15,15);
g.fillOval(170,120,15,15);
g.setColor(Color.red);
g.fillArc(130,180,50,15,180,180);
}
}