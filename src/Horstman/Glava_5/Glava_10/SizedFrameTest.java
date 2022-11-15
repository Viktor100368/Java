package Horstman.Glava_5.Glava_10;
import java.awt.*;
import javax.swing.*;
public class SizedFrameTest {
    public static void main(String[] args){
        JFrame frame = new SizedFrame();
        EventQueue.invokeLater(()->{

            frame.setTitle("SizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });

          try{
              Thread.sleep(5000);
          }catch (InterruptedException e){

          }
          frame.setVisible(false);
          frame.setLocation(700,300);
          frame.setSize(640,380);
          frame.setVisible(true);

    }
}
class SizedFrame extends JFrame{
    public SizedFrame(){
        //Получить размеры экрана
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        //Задать ширину и высоту фрейма, предоставив платформе
        //возможность самой выбрать местоположение фрейма
        setSize(screenWidth/2,screenHeight/2);
        setLocationByPlatform(true);
        //Задать пиктограмму для фрейма
//        Image img= new ImageIcon("babo4ka.jpg").getImage();
//        setIconImage(img);

    }
}
