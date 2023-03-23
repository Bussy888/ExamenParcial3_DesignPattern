package Examen.Ej2_Proxy;

import java.util.List;

public class SuperList {
    List<User> list;
    public SuperList(List<User> list){
        this.list = list;
    }
    private String obtainFirst(User user){
        return user.getNombre();
    }
    private boolean checkValidation(String a , String b, String c , String d){
        return a.equals(b) && c.equals(d);
    }
    public boolean includes(User user){
        for (User u : list){
            if(checkValidation(u.getNombre(), user.getNombre(), user.getPass(), u.getPass())){
                return true;
            }
        }
        return false;
    }
}
