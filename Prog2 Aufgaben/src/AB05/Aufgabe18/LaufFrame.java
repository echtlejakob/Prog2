package AB05.Aufgabe18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.attribute.FileOwnerAttributeView;

public class LaufFrame extends JFrame {
    ColorRunButton knopf1, knopf2;
    JComboBox farbenWahl;
    JCheckBox buchstabenWahl;
    public LaufFrame() {
// Swing-Komponenten erzeugen und einf¨ugen
        knopf1 = new ColorRunButton();
        knopf2 = new ColorRunButton();
        farbenWahl = new JComboBox();
        buchstabenWahl = new JCheckBox("Buchstaben");

        knopf1.addActionListener(new KnopfListener(knopf1));
        knopf2.addActionListener(new KnopfListener(knopf2));

        farbenWahl.addItem("schwarze Schrift");
        farbenWahl.addItem("graue Schrift");

        setLayout(new GridLayout(2, 2));

        add(knopf1);
        add(knopf2);
        add(farbenWahl);
        add(buchstabenWahl);
    }
    class KnopfListener implements ActionListener {
        ColorRunButton crb;
        KnopfListener (ColorRunButton crb) {
            this.crb = crb;
        }
        public void actionPerformed (ActionEvent e) {
// Auswahl-Index des ComboBox-Objekts bestimmen und Schrift setzen
            int index = farbenWahl.getSelectedIndex();
            if (index == 0){
                crb.setForeground(Color.BLACK);
            } else if (index == 1){
                crb.setForeground(Color.gray);
            }
            if (buchstabenWahl.isSelected()){
                crb.change(true);
            } else {
                crb.change(false);
            }






// Zustand der Checkbox bestimmen und Button-Zustand ¨andern


        }
    }
}