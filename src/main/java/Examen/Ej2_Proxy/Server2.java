package Examen.Ej2_Proxy;

import java.util.ArrayList;
import java.util.List;

public class Server2 implements IServer{
    private static final Server2 s2 = new Server2();
    public static Server2 getServer(){
        return s2;
    }
    @Override
    public void acceptUser(User user) {
        System.out.println("Usuario -> "+user.getNombre()+" ha sido aceptado en SERVER #2");
        System.out.println("Su ID ->"+user.getID()+" NO es un numero PRIMO");
        System.out.println();
    }
}
