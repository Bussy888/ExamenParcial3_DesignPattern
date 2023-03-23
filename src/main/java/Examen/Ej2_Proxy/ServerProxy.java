package Examen.Ej2_Proxy;

import java.util.ArrayList;
import java.util.List;

public class ServerProxy implements IServer{
    private Server1 server1 = new Server1();
    private Server2 server2 = new Server2();
    private SuperList users = new SuperList(new ArrayList<>());

    public ServerProxy(List<User> users) {
        this.users.list = users;
    }

    @Override
    public void acceptUser(List<User> requests) {
        for (int i=0;i<requests.size(); i++) {
            if (users.includes(requests.get(i))) {
                if (isPrime(i)) {
                    server1.acceptUser(i);
                } else {
                    server2.acceptUser(i);
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
}
