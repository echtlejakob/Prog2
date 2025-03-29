package AB06.Aufgabe20;

import java.io.*;

public class NumberTesterV2 {
    public static void main(String[] args) {
        String name = IOTools.readLine("Dateiname:");
        File eingabe = new File(name);
        boolean gefunden = false;

        try {
            StreamTokenizer st = new StreamTokenizer(new BufferedReader(new FileReader(eingabe)));
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                if (st.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println("Vorsicht! Der Text enthält die Zahl " + st.nval);
                    gefunden = true;
                    break;
                }
            }
            if (gefunden == false) {
                System.out.println("Der Text ist sauber!");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
