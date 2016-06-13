/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package verteiltesystemeuebungen;

import java.io.*;
import java.net.*;

class GutscheinServer {
    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        System.out.println("Der Gutschein-Server laeuft auf Port " + args[0]);
        try {
// Einen Socket fur den Server erzeugen
            ServerSocket server = new ServerSocket(port);
            while (true) {
// Fur jeden Client, der eine Verbindung aufbaut,
// einen ExamDienst-Thread erzeugen und starten
                new GutscheinDienst(server.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}