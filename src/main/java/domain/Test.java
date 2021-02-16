package domain;

public class Test {

    public static void main(String[] args) {
        Docente doc = new Docente(1,
                "Gianni",
                "Neri",
                "123ABC",
                "123456789",
                "12/12/1912",
                "M",
                "Italia",
                "Roma",
                "gianni.neri@mail.com",
                "Via delle Campane, 12",
                16.70);
        doc.stampaDocente();
    }
}
