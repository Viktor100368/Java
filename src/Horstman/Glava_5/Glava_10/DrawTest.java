package Horstman.Glava_5.Glava_10;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new DrawFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
/**
 * Фрейь, содержащий панель с нарисованными двухмерными формами
 */
class DrawFrame extends JFrame{
    public DrawFrame(){
        add(new DrawComponent());
        pack();
        }
 }
/**
 * Компонент , отображающий прямоугольник и эллипсы
 */
class DrawComponent extends JComponent{
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        //нарисовать прямоугольник
        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;

        Rectangle2D rect=
                new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);
        //Нарисовать вписанный элипс
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.setPaint(Color.CYAN);
        g2.fill(ellipse);
        g2.draw(ellipse);
        //Нарисовать диагональную линию
        g2.setPaint(Color.BLACK);
        g2.draw(new Line2D.Double(leftX, topY, leftX+width,
                topY + height));
        //Нарисовать окружность с тем же самым центром
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY,
                centerX + radius, centerY + radius);
        g2.draw(circle);
       Font sansbold14=new Font("SansSerif",Font.BOLD,14);
       g2.setFont(sansbold14);
       String mesage = "Hello World!";
       g2.drawString(mesage,150,175);

    }
    public Dimension getPreferredSize(){
        return  new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
