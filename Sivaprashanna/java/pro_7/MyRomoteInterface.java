import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MyRemoteInterface extends Remote{
    int add (int a, int b) throws RemoteException;
}