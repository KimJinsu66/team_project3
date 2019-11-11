import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
/**
 * listener event 
 *
 * @author (2014671038 김진수, 2018315005 유제훈 )
 * @version (2019.11.11)
 */
public class MyHelloListener extends MouseAdapter implements KeyListener 
{
    public JLabel lm;
    int FLYING_UNIT = 10;
    public MyHelloListener(JPanel jp ,JLabel lm){
        this.lm = lm;
        
    }
    
    public void mouseClicked(MouseEvent e){
        Component c = (Component)e.getSource();
        int x = e.getX();
        int y = e.getY();
        lm.setLocation(x,y);
        
    }
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        
        switch(keyCode){
            case KeyEvent.VK_UP:
                lm.setLocation(lm.getX(),lm.getY() -FLYING_UNIT); break;
            case KeyEvent.VK_DOWN:
                lm.setLocation(lm.getX(),lm.getY() -FLYING_UNIT); break;
            case KeyEvent.VK_LEFT:
                lm.setLocation(lm.getX() - FLYING_UNIT ,lm.getY()); break;
            case KeyEvent.VK_RIGHT:
                lm.setLocation(lm.getX() +FLYING_UNIT ,lm.getY()); break;
                
        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
