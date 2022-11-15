package Horstman.Glava_5.Glava_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

/**
 * В этой программе демонстрируется применение внутренних классов
 */
class TalkingClock{
    private int interval;
    private boolean beep;
    public TalkingClock(int interval,boolean beep){
        this.beep=beep;
        this.interval= interval;
    }
    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t=new Timer(interval,listener);
        t.start();
    }
    class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is "+new Date());
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock= new TalkingClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null,"Quit programm? ");
        System.exit(0);

    }
}
