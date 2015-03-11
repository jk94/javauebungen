import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jan on 11.03.2015.
 */
public class Main {

    public static void main(String args[]) {
        String vorname = "", nachname = "", hobby = "";
        Date geburtstag = new Date();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Einlesen
        try {

            System.out.print("Wie ist dein Vorname? ");
            vorname = reader.readLine();

            System.out.print("Wie ist dein Nachname? ");
            nachname = reader.readLine();

            System.out.print("Wann hast du Geburtstag ");
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            geburtstag = format.parse(reader.readLine());

            System.out.print("Was ist dein Hobby? ");
            hobby = reader.readLine();

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        //Ausgabe

        Date heute = new Date();
        Date unterschied = new Date(heute.getTime() - geburtstag.getTime());

        System.out.println("Hallo " + vorname + " " + nachname
                + ". Heute ist der " + heute.toLocaleString() + ". Du bist " + (unterschied.getYear()-70)
                + " Jahre alt und dein Hobby ist " + hobby);

    }


}
