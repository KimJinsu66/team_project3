import javax.swing.*;
import java.awt.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloFrame extends JFrame
{
    public JPanel p;
    public MyHelloFrame(){
        this.setTitle("실습_3(20191111)");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        this.add(p);

        this.setVisible(true);
    }
}