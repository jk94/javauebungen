package verteiltesystemeuebungen;

import java.rmi.*;
import java.util.*;


public class Client {

    public static void main (String [] args) {

        try {
            // referenz des server-objects von registry besorgen
            GutscheinService rts = (GutscheinService) Naming.lookup("rmi://localhost:1099/michaela");

            //gutschein entfernt aufrufen
            ArrayList<Gutschein> ausgabe = rts.liefereGutscheine(1000905);

            System.out.println("Gutscheine: " + ausgabe);

        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
