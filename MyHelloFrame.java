import javax.swing.*;
import java.awt.*;
/**
 * Frame 역할을 하는 MyFrame 클래스
 * 
 * @author (2018315005 유제훈, 2014671038 김진수) 
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{

    public MyHelloFrame(){
        this.setTitle("실습_3(20191111)");
        this.setSize(300, 300);
        
        MyHelloPanelListener ml = new MyHelloPanelListener();
        this.add(ml);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
