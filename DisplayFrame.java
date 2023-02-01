import javax.swing.*;
import java.awt.*;

public class DisplayFrame extends JFrame 
{
  public DisplayFrame()
  {
    //title, add panel, pack, set visible
    setTitle("Soccer");
    add(new DisplayPanel());
    pack();
    setVisible(true);
    setResizable(false);
  }
}