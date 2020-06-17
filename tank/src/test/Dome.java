package test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author bagnliu
 * @create 2020-06-14 22:47
 */
public class Dome extends Frame {
    public static void main(String[] args) {

        Dome tank = new Dome();
        tank.Tank();
    }

    public void Tank(){
        setTitle("坦克大战");
        setLocation(400,300);
        setSize(800,600);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setResizable(false);
        setBackground(Color.black);
        setVisible(true);

    }

    public void paint(Graphics graphics){
        Color color = graphics.getColor();
        graphics.setColor(Color.red);
        graphics.fillOval(50,50,30,30);
        graphics.setColor(color);
        System.out.println("////////////////////////////////");
    }
}