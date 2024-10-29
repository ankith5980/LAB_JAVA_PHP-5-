package Java;

import java.applet.*;
import java.awt.*;

public class REC_20_AppletPro extends Applet {

    int x, y, width, height;
    String color;

    @Override
    public void paint(Graphics g) {
        x = Integer.parseInt(this.getParameter("x"));
        y = Integer.parseInt(this.getParameter("y"));
        width = Integer.parseInt(this.getParameter("width"));
        height = Integer.parseInt(this.getParameter("height"));

        String color = getParameter("color");

        if(color.equals("blue")){
            g.setColor(color.BLUE);
        }
        else if(color.equals("red")){
            g.setColor(color.RED);
        }

        g.fillRect(x,y,width, height);
    }
}