package AB06.Aufgabe19;

import java.io.*;

public class NeueZeileV2 {
    public static void main(String[] args) {
        File in = new File("Eingabe.txt");
        File out = new File("Ausgabe.txt");

        try {
            BufferedReader brIn = new BufferedReader(new FileReader(in));
            BufferedWriter bwOut = new BufferedWriter(new FileWriter(out));
            BufferedReader kontrolle = new BufferedReader(new FileReader(out));

            String c = brIn.readLine();
            bwOut.write(c);
            bwOut.newLine();
            bwOut.write("NEUE ZEILE");
            bwOut.newLine();
            c = brIn.readLine();
            bwOut.write(c);

            brIn.close();
            bwOut.close();

            String z = kontrolle.readLine();
            System.out.println(z);
            z = kontrolle.readLine();
            System.out.println(z);
            z = kontrolle.readLine();
            System.out.println(z);
            kontrolle.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
