package AB05.Aufgabe17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomatFrame extends JFrame {
    ColorRunLabel c1, c2, c3;
    StartStopButton s1, s2, s3;
    public AutomatFrame() {
        c1 = new ColorRunLabel(Color.RED);
        c1.setOpaque(true);
        s1 = new StartStopButton();
        s1.setBackground(Color.RED);
        c2 = new ColorRunLabel(Color.YELLOW);
        c2.setOpaque(true);
        s2 = new StartStopButton();
        s2.setBackground(Color.YELLOW);
        c3 = new ColorRunLabel(Color.GREEN);
        c3.setOpaque(true);
        s3 = new StartStopButton();
        s3.setBackground(Color.GREEN);
        setLayout(new GridLayout(2, 3));
        add(c1);
        add(c2);
        add(c3);
        add(s1);
        add(s2);
        add(s3);

        s1.addActionListener(new ButtonListener(c1));
        s2.addActionListener(new ButtonListener(c2));
        s3.addActionListener(new ButtonListener(c3));


    }
    class ButtonListener implements ActionListener {
        ColorRunLabel label;
        public ButtonListener(ColorRunLabel label) {
            this.label = label;
        }
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == s1 && s1.getText().equals("START")) {
                s1.switchText();
                label.start();
            } else if (e.getSource() == s1 && s1.getText().equals("STOP")) {
                s1.switchText();
                label.stop();
            } else if (e.getSource() == s2 && s2.getText().equals("START")) {
                s2.switchText();
                label.start();
            } else if (e.getSource() == s2 && s2.getText().equals("STOP")) {
                s2.switchText();
                label.stop();
            }   else if (e.getSource() == s3 && s3.getText().equals("START")) {
                s3.switchText();
                label.start();
            } else if (e.getSource() == s3 && s3.getText().equals("STOP")) {
                s3.switchText();
                label.stop();
            }

        }
    }
}
