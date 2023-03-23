package Examen.Ej2_Proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        User user1 = new User(29, "Mateo","Contra123");
        User user2 = new User(88, "Carlos", "Cel123");
        User user3 = new User(79, "Juan","Juanito321");
        User user4 = new User(432, "Gabriel", "Gabo434");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        ServerProxy proxy = new ServerProxy(users);
        List<User> requests = new ArrayList<>();
        requests.add(new User(29, "Mateo","Contra123"));
        requests.add(new User(88, "Carlos", "Cel123"));
        requests.add(new User(79, "Juan","Juanito321"));
        requests.add(new User(432, "Gabriel", "Gabo434"));
        proxy.aceptar(requests);
    }
}
