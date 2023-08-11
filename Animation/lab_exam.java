// animation of a moving car

import java.awt.*;
import java.awt.event.*;
public class labExam extends Frame implements ActionListener
{
Button b;
int STATE = 1;
labExam()
{
b = new Button("START/STOP");
b.setFont(new Font("Times New Roman", Font.BOLD, 40));
b.addActionListener(this);
add(b);
repaint();
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
setSize(1000, 800);
setVisible(true);
setLayout(new FlowLayout());
}
@Override
public void actionPerformed(ActionEvent e)
{
if (STATE == 3)
STATE = 1;
else
STATE++;
repaint();
}
public void paint(Graphics g)

{
if (STATE == 1) // INITIAL STATE CAR MOVING
{
// Change button color
b.setBackground(Color.GREEN);
b.setForeground(Color.BLACK);
// CAR Keeps on Moving
for (int i = -50; i < 1200; i++)
{
g.setColor(Color.RED);
g.clearRect(i, 300, 200, 100);
g.fillRect(i + 1, 300, 200, 100);
g.setColor(Color.CYAN);
g.clearRect(i, 600, 200, 100);
g.fillRect(i + 1, 600, 200, 100);
try
{
Thread.sleep(1);
}
catch (Exception e)
{
}
}
repaint();
}
else if (STATE == 2) // Car stops at line. Train moves
{
// Change button color
b.setBackground(Color.RED);
b.setForeground(Color.WHITE);
// STOP LINE
g.setColor(Color.BLACK);
g.drawLine(700, 150, 700, 750);
// CAR STOPS AT LINE
for (int i = -50; i < 450; i++)
{
g.setColor(Color.RED);
g.clearRect(i, 300, 200, 100);
g.fillRect(i + 1, 300, 200, 100);
g.setColor(Color.CYAN);
g.clearRect(i, 600, 200, 100);
g.fillRect(i + 1, 600, 200, 100);
try
{
Thread.sleep(1);
}
catch (Exception e)
{
}
}

// Train Moves
for (int i = -200; i < 1200; i++)
{
g.setColor(Color.ORANGE);
g.clearRect(800, i, 100, 150);
g.fillRect(800, i + 1, 100, 150);
try
{
Thread.sleep(1);
}
catch (Exception e)
{
}
}
STATE = 3;
repaint();
}
else // Move car after train passes
{
// Change button color
b.setBackground(Color.GREEN);
b.setForeground(Color.BLACK);
// CAR STOPS AT LINE
for (int i = 451; i < 1000; i++)
{
g.setColor(Color.RED);
g.clearRect(i, 300, 200, 100);
g.fillRect(i + 1, 300, 200, 100);
g.setColor(Color.CYAN);
g.clearRect(i, 600, 200, 100);
g.fillRect(i + 1, 600, 200, 100);
try
{
Thread.sleep(1);
}
catch (Exception e)
{
}
}
STATE = 1;
repaint();
}
}
public static void main(String[] args)
{
new labExam();
  }
}
