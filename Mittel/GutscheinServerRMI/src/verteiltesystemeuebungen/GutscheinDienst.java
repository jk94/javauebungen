/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package verteiltesystemeuebungen;


 
import java.io.*;
import java.net.*;
class GutscheinDienst extends Thread {
DataInputStream in; // Eingabe-Strom zum Client
ObjectOutputStream out; // Ausgabe-Strom zum Client
GutscheinDienst(Socket c) {
System.out.println("Kontaktaufnahme durch neuen Client.");
// Die Ein- und Ausgabe-Stroeme zum Client erzeugen
try {
in = new DataInputStream(c.getInputStream());
out = new ObjectOutputStream(c.getOutputStream());
}
catch (IOException ioe) {
System.out.println(ioe);
}
}
public void run() {
try {
int kdnr;
while ((kdnr = in.readInt()) != -1) {
String dateiname = "Gutscheine.dat";
Gutschein[] gelesen = GutscheinCheck.liesGutscheineAus(dateiname);

for (int i=0; i<gelesen.length; i++) {
if (kdnr == gelesen[i].getKdNr())
out.writeObject(gelesen[i]);
}
out.writeObject(null);
}
out.close();
}
catch (Exception e) {
System.out.println(e);
}
}
}

