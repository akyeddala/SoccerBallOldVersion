import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
public class DisplayPanel extends JPanel 
{
  private int x = 535;
  private int y = 323;
  public DisplayPanel()
  {
    //set the preferred size of the panel
    setPreferredSize(new Dimension(1080,650));
    setBackground(Color.green.darker());
    this.addKeyListener(new KeyEventListener());
    setFocusable(true);
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.drawRect(1,280,19,100);
    g.drawRect(0,280,19,99);
    g.drawRect(1061,280,19,100);
    g.drawRect(1060,280,19,99);
    g.setColor(Color.white);
    g.drawRect(20,25,1040,600);
    g.setColor(Color.white);
    g.drawRect(19,24,1040,600);
    g.setColor(Color.white);
    g.drawRect(18,23,1040,600);
    g.setColor(Color.white);
    g.drawLine(545, 25, 545, 620);
    g.setColor(Color.white);
    g.drawOval(445,230,200,200);
    g.setColor(Color.white);
    g.drawRect(910,130,150,400); 
    g.setColor(Color.white);
    g.drawRect(990,230,70,200);
    g.setColor(Color.white);
    g.drawRect(20,130,150,400);
    g.setColor(Color.white);
    g.drawRect(20,230,70,200);
    g.drawArc(80,230,150,200,80,-160);
    g.drawArc(840,230,150,200,95,170);
    g.fillOval(130,330,7,7);
    g.fillOval(950,330,7,7);
    g.setColor(Color.blue.brighter().brighter().brighter());
    g.fillOval(x,y,20,20);
  }
  //create a private inner class
  private class KeyEventListener implements KeyListener
  {
     public void keyTyped(KeyEvent e){}
     public void keyPressed(KeyEvent e) 
     {
        if ((x <= 21 || x >= 1038) && (y >= 280 && y <= 360))
        {
            x += 10;
            y += 10;
            repaint();
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            x = 535;
            y = 323;
            repaint();
        }
        else if (x > 20 && x < 1040 && y > 25 && y < 600)
         {
            if (e.getKeyCode() == KeyEvent.VK_UP)
            {
                y -= 3;
                repaint();
            }
            else if (e.getKeyCode() == KeyEvent.VK_DOWN)
            {
                y += 3;
                repaint();
            }
            else if (e.getKeyCode() == KeyEvent.VK_LEFT)
            {
                x -= 3;
                repaint();
            }
            else
            {
                x += 3;
                repaint();
            }
        }
        else if (x <= 20)
            x++;
        else if (x >= 1040)
            x--;
        else if (y >= 600)
            y--;
        else if (y <= 25)
            y++;
    }
     public void keyReleased(KeyEvent e){}
  }
}