package domain;

public class Docente extends Utente{

    private double costoOrario;
    private Competenze competenzeAvanzate;

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
                     double costoOrario,
                     int valJava,
                     int valCsharp,
                     int valPython){
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
        this.costoOrario = costoOrario;
        competenzeAvanzate = new Competenze(valJava, valCsharp, valPython);
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
        System.out.println(costoOrario);
        System.out.println(competenzeAvanzate.getJava());
        System.out.println(competenzeAvanzate.getcSharp());
        System.out.println(competenzeAvanzate.getPython());
    }

    public double getCostoOrario() {
        return costoOrario;
    }

    public void setCostoOrario(double costoOrario) {
        this.costoOrario = costoOrario;
    }
}
