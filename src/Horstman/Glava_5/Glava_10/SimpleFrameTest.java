package Horstman.Glava_5.Glava_10;
import java.awt.*;
import javax.swing.*;
public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class SimpleFrame extends JFrame{
    private static final int DEFAULT_WICTH =300;
    private static final int DEFAULT_HEIGHT = 200;
    public SimpleFrame(){
        setSize(DEFAULT_WICTH, DEFAULT_HEIGHT);
    }
}
