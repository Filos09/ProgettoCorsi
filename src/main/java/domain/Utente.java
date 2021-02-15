package domain;

public abstract class Utente {

    private int id;
    private String nome;
    private String cognome;

    private String cf;
    private String tel;
    private String dataNascita;
    private String sesso;
    private String paeseNascita;
    private String cittaNascita;
    private String email;
    private String indirizzo;

    public Utente(
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
                  String indirizzo){
                    this.id = id;
                    this.nome = nome;
                    this.cognome = cognome;
                    this.cf = cf;
                    this.tel = tel;
                    this.dataNascita = dataNascita;
                    this.sesso = sesso;
                    this.paeseNascita = paeseNascita;
                    this.cittaNascita = cittaNascita;
                    this.email = email;
                    this.indirizzo = indirizzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getPaeseNascita() {
        return paeseNascita;
    }

    public void setPaeseNascita(String paeseNascita) {
        this.paeseNascita = paeseNascita;
    }

    public String getCittaNascita() {
        return cittaNascita;
    }

    public void setCittaNascita(String cittaNascita) {
        this.cittaNascita = cittaNascita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
