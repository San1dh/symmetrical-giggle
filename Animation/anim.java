import java.awt.*;

public class Anim extends Frame 
{
 int x1, y1;

 Anim() 
{
 x1 = 50;
 y1 = 50;
 setSize(900, 300);
 setVisible(true);
}

public void paint(Graphics g) 
{
 g.drawOval(x1, y1, 50, 50);
 g.setColor(Color.red);
 g.fillOval(x1, y1, 50, 50);
 if(x1>150 || x1<50) 
  y1 = y1 - 1;
else
   y1 = y1 + 1;
  
if(y1>150 || y1<50)  
  x1 = x1 - 1;
 else
  x1 = x1 + 1;

  try 
 {
 Thread.sleep(10);
 g.clearRect(0,0,500,500);
 repaint();
 } 

catch (Exception e) 
  {
System.out.println("Error");
  }

  
 }
 public static void main(String args[]) 
{
 Anim a = new Anim();
}
}
