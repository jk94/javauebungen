package verteiltesystemeuebungen;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by Jan on 12.03.2015.
 */
public interface GutscheinService extends Remote {

    public ArrayList<Gutschein> liefereGutscheine(int Kdnr) throws RemoteException;
}
