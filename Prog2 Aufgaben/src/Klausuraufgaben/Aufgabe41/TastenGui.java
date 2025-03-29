package Klausuraufgaben.Aufgabe41;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TastenGui extends JFrame {
    private JLabel eingabeLabel;
    private JLabel ausgabeLabel;
    private JTextField eingabe;
    private JTextField ausgabe;
    private JButton loeschen;
    Container c;

    public static void main(String[] args) {
        new TastenGui(250, 100);
    }

    public TastenGui(int w, int h) {
        this.setSize(w, h);
        this.setTitle("Tastenanzeige");
        this.setVisible(true);
        this.setLayout(new GridLayout(3, 2));

        eingabeLabel = new JLabel("Eingabe:");
        ausgabeLabel = new JLabel("Ausgabe:");
        eingabe = new JTextField();
        ausgabe = new JTextField();
        loeschen = new JButton("Anzeige zurücksetzten");
        this.add(eingabeLabel);
        this.add(eingabe);
        this.add(ausgabeLabel);
        this.add(ausgabe);
        this.add(loeschen);

        TastenHorcher th = new TastenHorcher();
        eingabe.addKeyListener(th);

        loeschen.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (e.getSource() == loeschen) {
                   eingabe.setText("");
                   ausgabe.setText("");
               }
           }
        });



    }// Ende des Konstruktors

    class TastenHorcher implements KeyListener {
        public void keyPressed(KeyEvent e) {
        }

        public void keyReleased(KeyEvent e) {

        }

        public void keyTyped(KeyEvent e) {
            char zeichen = e.getKeyChar();
            int ascii = (int) zeichen;
            ausgabe.setText(ascii + "");
        }
    }
} // Ende der Klasse TastenGui
