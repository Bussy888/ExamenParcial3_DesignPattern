package Examen.Ej2_Proxy;

import java.util.ArrayList;
import java.util.List;

public class Server1 implements IServer{
    private static final Server1 s1 = new Server1();
    public static Server1 getServer(){
        return s1;
    }
    @Override
    public void acceptUser(User user) {
        System.out.println("Usuario -> "+user.getNombre()+" ha sido aceptado en SERVER #1");
        System.out.println("Su ID ->"+user.getID()+" es un numero PRIMO");
        System.out.println();
    }
}
