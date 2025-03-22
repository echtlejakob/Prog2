package AB05.Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class ColorRunLabel extends JLabel implements Runnable {
    boolean running = true;
    public ColorRunLabel (Color c) {
        setBackground(c);
        setFont(new Font("Arial", Font.BOLD, 50));
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
    }
    public void start() {
        Thread t = new Thread(this);
        t.start();
        running = true;
    }
    public void stop() {
        running = false;
    }
    public void run() {
        while (running) {
            try {
                int random = (int) (Math.random() * 10);
                setText(random + "");
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}
