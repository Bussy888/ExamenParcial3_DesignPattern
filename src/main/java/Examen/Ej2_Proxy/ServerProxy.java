package Examen.Ej2_Proxy;

import java.util.ArrayList;
import java.util.List;

public class ServerProxy implements IServer{
    private Server1 server1 = new Server1();
    private Server2 server2 = new Server2();
    private List<User> users = new ArrayList<>();

    public ServerProxy(List<User> users) {
        this.users = users;
    }

    @Override
    public void acceptUser(User user) {
        if (users.contains(user)){
            if(isPrime(user.getID())){
                server1.acceptUser(user);
            }else{
                server2.acceptUser(user);
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
