package Klausuraufgaben.Aufgabe37;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyTextFrame extends JFrame implements ActionListener {
    private JComboBox liste = new JComboBox();
    private JTextField eingabe = new JTextField("");
    private JButton clear = new JButton("Listen-Eintrag loeschen");

    public MyTextFrame() { // Konstruktor
        Container c = getContentPane();
        c.add(eingabe, BorderLayout.NORTH);
        c.add(liste, BorderLayout.CENTER);
        c.add(clear, BorderLayout.SOUTH);

        eingabe.addActionListener(this);
        clear.addActionListener(this);

        MyLis ml = new MyLis(eingabe, liste);
        liste.addItemListener(ml);

    } // Ende des Konstruktors

    public void actionPerformed(ActionEvent ae) {
        int index = 0;
        if(ae.getSource() == eingabe && ae.getSource() != clear) {
            liste.addItem(eingabe.getText());
            liste.setSelectedItem(eingabe.getText());
            eingabe.setText(liste.getSelectedItem()+"");
        } else if (ae.getSource() == clear) {
            liste.removeItem(liste.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        MyTextFrame d = new MyTextFrame();
        d.setDefaultCloseOperation(EXIT_ON_CLOSE);
        d.setSize(230, 100);
        d.setVisible(true);
        d.setTitle("MyTextFrame");
    }
}