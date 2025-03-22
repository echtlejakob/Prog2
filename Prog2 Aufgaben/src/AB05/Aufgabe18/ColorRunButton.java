package AB05.Aufgabe18;

import java.awt.*;
import javax.swing.*;
public class ColorRunButton extends JButton implements Runnable {
    private boolean running = false; // Thread l¨auft zu Beginn nicht
    private boolean zeigtBuchstabe = true; // Anzeige zeigt zu Beginn Buchstaben
    public ColorRunButton () {
        setBackground(Color.white);
        setFont(new Font("Arial",Font.BOLD,50));
        setText(" ");
    }
    public void change (boolean zeigtBuchstabe) {
        this.zeigtBuchstabe = zeigtBuchstabe;
// Falls der Thread l¨auft, beende ihn mittels des running-Flags,
// andernfalls, setze running-Flag, erzeuge neuen Thread und starte ihn
        if (running){
            running = false;
        } else {
            running = true;
            Thread t = new Thread(this);
            t.start();
        }
    }
    public void run() {
        String text;
// Berechne Zufalls-Ziffer oder Zufalls-Buchstabe
// und setze das Zeichen als Beschriftung des Buttons
        while (running) {
            int random = (int) ('A' + Math.random() * 10);
            if (zeigtBuchstabe) {
                char c = (char) random;
                text = "" + c;
            } else {
                text = "" + random;
            }
            setText(text);

            try {
                Thread.sleep(500); // 500 ms Pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
