package Horstman.Glava_5.Glava_10;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
public class ListFonts {
    public static void main(String[] args){
      EventQueue.invokeLater(()->{
          JFrame frame = new FontFrame();
          frame.setTitle("FontTest");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
      });
    }
}
/**
 * Фрейм с компонентом текстового сообщения
 */
class FontFrame extends JFrame{
    public FontFrame(){
        add(new FontComponent());
        pack();
    }
}
/**
 * Компонент, отображающий текстоаое сообщение,
 * выровненное по центру в прямоугольной рамке
 */
class FontComponent extends JComponent{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        String mesage = "Hello World!";
        Font f= new Font("Serif",Font.BOLD,36);
        g2.setFont(f);
        //определить размеры текстового сообщения
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(mesage,context);
        //определить координаты(х , у) верхнего левого угла текста
        double x = (getWidth()- bounds.getWidth())/2;
        double y = (getHeight()- bounds.getHeight())/2;
        //сложить подъем с координатой у, чтобы достичь базовой линии
        double ascent = -bounds.getY();
        double baseY = y+ ascent;
        //воспроизвести текстовое сообщение
        g2.drawString(mesage, (int) x, (int) baseY);
        g2.setPaint(Color.LIGHT_GRAY);
        //нарисовать ограничивающий прямоугольник
        Rectangle2D rect = new Rectangle2D.Double(x,y,
                bounds.getWidth(), bounds.getHeight());
        g2.draw(rect);
    }
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
