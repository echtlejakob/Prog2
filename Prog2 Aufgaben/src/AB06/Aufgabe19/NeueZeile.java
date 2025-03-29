package AB06.Aufgabe19;

import java.io.*;

public class NeueZeile {
    public static void main(String[] args) {
        File input = new File("Eingabe.txt");
        File output = new File("Ausgabe.txt");
        String c;
        try {
            BufferedReader in = new BufferedReader(new FileReader(input));
            BufferedWriter out = new BufferedWriter(new FileWriter(output));
            while ((c = in.readLine()) != null) {
                out.write(c);
                out.newLine();
                if (c.trim().equals("1")) {
                    out.write("NEUE ZEILE");
                    out.newLine();
                }
            }
            in.close();
            out.close();
        }
        catch (IOException ex) {
            System.out.println(ex);
    }
}
}
