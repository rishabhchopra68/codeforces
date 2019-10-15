import java.applet.*;
import java.awt.*;

public class applet extends Applet{
    public static void main(String[] args){
        System.out.print("5");
    }
    public void paint(Graphics g){
        g.drawString("MyApplet", 100,100);
    }
}