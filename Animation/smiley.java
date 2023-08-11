import java.awt.*;
import java.awt.event.*;

public class Smiley extends Frame implements ActionListener {

    Button b1,b2;
    int x1;
    
    Smiley() {
        x1 = 0;
       
        b1 = new Button("Good Attitude");

        b1.addActionListener(this);
        
        add(b1);

        b2 = new Button("Bad Attitude");

        b2.addActionListener(this);
        
        add(b2);

        setSize(500, 500);

        setLayout(new FlowLayout());

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawOval(180, 100, 150, 150); // For face
        g.setColor(Color.black);
        g.fillOval(210, 140, 15, 25); // Left Eye
        g.fillOval(280, 140, 15, 25); // Right Eye

        g.drawArc(210, 180, 80, 52, 3, x1); // Smile or sad
    }

    public void actionPerformed(ActionEvent e) {

        if ((e.getActionCommand()) == "Good Attitude") {
            x1 = -180;
        }
        if ((e.getActionCommand()) == "Bad Attitude") {
            x1 = 180;
        }
        repaint();
       
    }

    public static void main(String args[]) {
        Smiley f = new Smiley();

    }
}
