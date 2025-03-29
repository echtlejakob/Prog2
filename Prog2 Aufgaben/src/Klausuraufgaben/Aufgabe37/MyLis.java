package Klausuraufgaben.Aufgabe37;

import java.awt.event.*;
import javax.swing.*;
public class MyLis implements ItemListener {
    JComboBox box;
    JTextField tf;
    public MyLis (JTextField tf, JComboBox box) {
        this.tf = tf;
        this.box = box;
    }
    public void itemStateChanged(ItemEvent e) {
        int index = box.getSelectedIndex();
        String objekt = box.getSelectedItem().toString();
        tf.setText(objekt);
        if (box.getItemCount() == 0 ){
            throw new RuntimeException("Liste ist leer");
        }
    }
}
