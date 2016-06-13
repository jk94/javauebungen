package verteiltesystemeuebungen;


import java.rmi.*;

public class Server {

    public static void main (String[] args) {

        try {
            // Objekt erzeugen
            ServerGutscheinService to = new ServerGutscheinService();
            Naming.rebind("rmi://localhost:1099/michaela", to);   // ???

            System.out.println("Der Server ist an.");

        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
