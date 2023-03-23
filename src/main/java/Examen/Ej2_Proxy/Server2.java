package Examen.Ej2_Proxy;

import java.util.ArrayList;
import java.util.List;

public class Server2 implements IServer{
    private List<User> users = new ArrayList<>();

    @Override
    public void acceptUser(User user) {
        users.add(user);
        System.out.println("Usuario -> "+user.getNombre()+" ha sido aceptado en SERVER #2");
        System.out.println("Su ID ->"+user.getID()+" NO es un numero PRIMO");
        System.out.println();
    }
}
