package verteiltesystemeuebungen;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 * Created by Jan on 12.03.2015.
 */
public class ServerGutscheinService extends UnicastRemoteObject implements GutscheinService{

    public ServerGutscheinService() throws RemoteException{
        super();
    }

    @Override
    public ArrayList<Gutschein> liefereGutscheine(int Kdnr) throws RemoteException {
        return new ArrayList<Gutschein>();
    }
}
