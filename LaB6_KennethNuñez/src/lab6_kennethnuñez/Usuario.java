package lab6_kennethnuñez;

import java.util.ArrayList;


public class Usuario {
    private String email;
    private String contraseña;
    private String birthday;
    private ArrayList peliculas = new ArrayList();
    private ArrayList series = new ArrayList();
    private String DebitCreditCard;

    public Usuario() {
    }

    public Usuario(String email, String contraseña, String birthday, String DebitCreditCard) {
        this.email = email;
        this.contraseña = contraseña;
        this.birthday = birthday;
        this.DebitCreditCard = DebitCreditCard;
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

    public String getDebitCreditCard() {
        return DebitCreditCard;
    }

    public void setDebitCreditCard(String DebitCreditCard) {
        this.DebitCreditCard = DebitCreditCard;
    }

    @Override
    public String toString() {
        return email;
    }
    
    
    
}
