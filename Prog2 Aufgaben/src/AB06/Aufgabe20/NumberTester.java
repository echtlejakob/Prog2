package AB06.Aufgabe20;

import java.io.StreamTokenizer;
import java.io.*;

public class NumberTester {
    public static void main(String[] args) {
        String name = IOTools.readLine("Dateiname:");
        File in = new File(name);
        try {
            BufferedReader br = new BufferedReader(new FileReader(in));
            StreamTokenizer st = new StreamTokenizer(br);
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                int tokentype = st.nextToken();
                if (tokentype == StreamTokenizer.TT_NUMBER) {
                    System.out.println("Vorsicht! Der Text enthält die Zahl " + st.nval);
                    break;
                }
                System.out.println("Der Text ist sauber!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
