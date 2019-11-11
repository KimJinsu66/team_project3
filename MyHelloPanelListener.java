import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
/**
 * Jpanel과 KeyListener,MouseListener을 사용하는 MyHelloListener 클래스  
 *
 * @author (2014671038 김진수, 2018315005 유제훈 )
 * @version (2019.11.11)
 */
public class MyHelloPanelListener extends JPanel implements KeyListener,MouseListener
{
    private JLabel lm ;
    public final int FLYING_UNIT = 10;
    
    public MyHelloPanelListener(){
        lm = new JLabel("Hello");
        this.add(lm);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setFocusable(true);
    }

    public void mouseClicked(MouseEvent e){
        Component c = (Component)e.getSource();
        int x = e.getX();
        int y = e.getY();
        lm.setLocation(x,y);

    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();

        switch(keyCode){
            case KeyEvent.VK_UP:
            lm.setLocation(lm.getX(),lm.getY() -FLYING_UNIT); break;
            case KeyEvent.VK_DOWN:
            lm.setLocation(lm.getX(),lm.getY() +FLYING_UNIT); break;
            case KeyEvent.VK_LEFT:
            lm.setLocation(lm.getX() - FLYING_UNIT ,lm.getY()); break;
            case KeyEvent.VK_RIGHT:
            lm.setLocation(lm.getX() +FLYING_UNIT ,lm.getY()); break;

        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
