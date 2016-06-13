package verteiltesystemeuebungen;

import java.io.*;

public class GutscheinCheck {

    public static void main(String[] args) {
        String dateiname = "Gutscheine.dat";
// Gutscheine aus der Datei lesen und deren Datensatzfelder
// zur Kontrolle auf den Bildschirm ausgeben
        Gutschein[] gut = liesGutscheineAus(dateiname);
        System.out.println("Die Datei " + dateiname + " enthaelt "
                + gut.length + " Gutscheine");
        for (int i = 0; i < gut.length; i++) {
            System.out.println(gut[i]);
        }
    }

    public static Gutschein[] liesGutscheineAus(String dateiname) {
        try {
            FileInputStream datEin = new FileInputStream(dateiname);
            ObjectInputStream oEin = new ObjectInputStream(datEin);
// Gutscheine aus der Datei lesen und in Array speichern
            int anzahl = oEin.readInt();
            Gutschein[] ga = new Gutschein[anzahl];
            for (int i = 0; i < anzahl; i++) {
                ga[i] = (Gutschein) oEin.readObject();
            }
            oEin.close();
            return ga;
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen: " + e);
            return new Gutschein[0];
        }
    }
}
