package Abstraction;

import javax.swing.*;
import java.awt.*;

public class Drawing {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setSize(2000,2000);
        MyDrawing m=new MyDrawing();
        jFrame.add(m);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
class MyDrawing extends Canvas {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        for (int i = 400; i < 600; i = i + 50) {
            //Thread.sleep(1000);
            g.fillOval(i, 200, 100, 500);
            g.fillArc(100,200,300,400,12,15);
            g.fillRect(10,20,50,200);
        }
    }
}