import java.awt.*;
public class Lines extends Frame
{

Lines()
{
    setSize(500,500);
    setVisible(true); 

}
public void paint(Graphics g)
{
    g.drawLine(0,0,500,500);
    g.drawString("Hello",50,50);
}

public static void main(String args[])
{
    Lines l=new Lines();   
    //setVisible(false);                                                                            
}
}
