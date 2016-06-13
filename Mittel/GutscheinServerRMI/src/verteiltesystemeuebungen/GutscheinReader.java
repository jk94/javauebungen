package verteiltesystemeuebungen;


import java.io.*;    // alle Klasse drin, zb für Reader werden importiert

public class GutscheinReader {

    public static void main(String[] args) {
        liesGutscheineAus("Gutscheine.dat");            // ich gebe ihm die Methode mit die er tun soll

    }

    public static void liesGutscheineAus(String dateiname) {


        try {
            FileInputStream datEin = new FileInputStream(dateiname);
            ObjectInputStream oEin = new ObjectInputStream(datEin);    // nimm Objekte aus der Datei
            int anzahl = oEin.readInt();
            Gutschein[] array = new Gutschein[anzahl];       //Array definieren, in neues array Anzahl einfügen
            Gutschein temp;

            // System.out.println("Die Anzahl ist: " + anzahl);

            for (int i = 0; i < anzahl; i++) {
                temp = (Gutschein) oEin.readObject();  //lies Objekte aus Datei und speicher sie in temp
                array[i] = temp;     // Objekte in array schreiben
                System.out.println(array[i].toString());
                //System.out.println(temp);

            }


        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}


    
   
    
