import java.awt.*;
import java.applet.*;
public class Load extends Applet
{

        image image;
        public void init()
        {
            image=getImage(getCodeBase,"logo.PNG");
        }
        public void panit(Graphics g)
        {
           g.drawImage(image,10,10);
        }



}