package AB05.Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class StartStopButton extends JButton {
    public StartStopButton() {
        setFont(new Font("Arial", Font.BOLD, 25));
        setHorizontalAlignment(JButton.CENTER);
        setVerticalAlignment(JButton.CENTER);
        setText("START");
    }
    public boolean isStart() {
        if (getText().equals("START")) {
            return true;
        } else {
            return false;
        }
    }
    public void switchText () {
        if (isStart()) {
            setText("STOP");
        } else {
            setText("START");
        }
    }
}
