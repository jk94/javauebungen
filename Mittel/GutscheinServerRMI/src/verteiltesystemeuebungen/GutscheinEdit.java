package verteiltesystemeuebungen;


import java.io.*;

import verteiltesystemeuebungen.Gutschein;

public class GutscheinEdit {

    public static void main(String[] summand) {
        try {
            BufferedReader ein = new BufferedReader(
                    new InputStreamReader(System.in));
            String dateiname = "Gutscheine.dat";
            FileOutputStream datAus = new FileOutputStream(dateiname);
            ObjectOutputStream oAus = new ObjectOutputStream(datAus);
            System.out.print("Anzahl der zu erzeugenden Gutscheine: ");
            int anzahl = Integer.parseInt(ein.readLine());
            oAus.writeInt(anzahl); // Anzahl der Datensaetze
            Gutschein a;
            long nummer = 20051200000000L;
            for (int i = 1; i <= anzahl; i++) {
                nummer++;
                System.out.println("Daten fuer Gutschein-Nummer " + nummer);
                System.out.print("Name des Gutschein-Besitzers: ");
                String name = ein.readLine();
                System.out.print("Kundennummer des Gutschein-Besitzers: ");
                int kdnr = Integer.parseInt(ein.readLine());
                System.out.print("Wert des Gutscheins in EUR: ");
                double wert = Double.parseDouble(ein.readLine());
                a = new Gutschein(nummer, name, kdnr, wert);
                oAus.writeObject(a);
            }
            oAus.close();
            System.out.println();
            System.out.println(anzahl + " Gutscheine in die Datei "
                    + dateiname + " geschrieben");
        } catch (Exception e) {
            System.out.println("I/O-Error!");
            e.printStackTrace();
        }
    }
}
