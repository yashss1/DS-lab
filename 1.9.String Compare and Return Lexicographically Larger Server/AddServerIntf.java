import java.rmi.*;
public interface AddServerIntf extends Remote { 
//method declaration 
String scmp(String d1,String d2) throws RemoteException;

String add(double d1, double d2);
}
