package Examen.Ej2_Proxy;

import java.util.ArrayList;
import java.util.List;

public class ServerProxy implements IServer{
    private Server1 server1 = Server1.getServer();
    private Server2 server2 = Server2.getServer();
    private SuperList users = new SuperList(new ArrayList<>());

    public ServerProxy(List<User> users) {
        this.users.list = users;
    }

    public void aceptar(List<User> requests) {
        for (int i=0;i<requests.size(); i++) {
            if (users.includes(requests.get(i))) {
                if (isPrime(requests.get(i).getID())) {
                    server1.acceptUser(requests.get(i));
                } else {
                    server2.acceptUser(requests.get(i));
                }
            }
        }
    }
    private boolean isPrime(int id){
        if(id <=1){
            return false;
        }
        for (int i =2 ; i<id; i++){
            if (id%i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void acceptUser(User user) {

    }
}
