package domain;

import java.util.ArrayList;

public class Docente extends Utente{

    private double costoOrario;

    public Docente(
                     int id,
                     String nome,
                     String cognome,
                     String cf,
                     String tel,
                     String dataNascita,
                     String sesso,
                     String paeseNascita,
                     String cittaNascita,
                     String email,
                     String indirizzo,
                     double costoOrario){
        super(id,
                nome,
                cognome,
                cf,
                tel,
                dataNascita,
                sesso,
                paeseNascita,
                cittaNascita,
                email,
                indirizzo);
        this.costoOrario = costoOrario;;
    }

    public void stampaDocente(){
        System.out.println(getId());
        System.out.println(getNome());
        System.out.println(getCognome());
        System.out.println(getCf());
        System.out.println(getTel());
        System.out.println(getDataNascita());
        System.out.println(getSesso());
        System.out.println(getPaeseNascita());
        System.out.println(getCittaNascita());
        System.out.println(getEmail());
        System.out.println(getIndirizzo());
        System.out.println(costoOrario);;
    }

    public double getCostoOrario() {
        return costoOrario;
    }

    public void setCostoOrario(double costoOrario) {
        this.costoOrario = costoOrario;
    }
}
