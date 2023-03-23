package Examen.Ej2_Proxy;

public class User {
    private int iD;
    private String nombre;
    private String pass;

    public User(int iD, String nombre, String pass) {
        this.iD = iD;
        this.nombre = nombre;
        this.pass = pass;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
