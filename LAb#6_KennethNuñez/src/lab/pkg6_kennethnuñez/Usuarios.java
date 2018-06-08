package lab.pkg6_kennethnuñez;

import java.util.ArrayList;

public class Usuarios {
    private String email;
    private String contraseña;
    private String birthday;
    private ArrayList peliculas = new ArrayList();
    private ArrayList series = new ArrayList();
    private int DebitCreditCard;

    public Usuarios(String email, String contraseña, String birthday, int DebitCreditCard) {
        this.email = email;
        this.contraseña = contraseña;
        this.birthday = birthday;
        this.DebitCreditCard = DebitCreditCard;
    }

    public Usuarios() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public ArrayList getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList getSeries() {
        return series;
    }

    public void setSeries(ArrayList series) {
        this.series = series;
    }

    public int getDebitCreditCard() {
        return DebitCreditCard;
    }

    public void setDebitCreditCard(int DebitCreditCard) {
        this.DebitCreditCard = DebitCreditCard;
    }
    
    
    
    
    
}
