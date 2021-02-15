package domain;

public class Competenze {

    // competenze da 0 a 10

    private int java;
    private int cSharp;
    private int python;

    public Competenze(int java, int cSharp, int python){
        this.java = java;
        this.cSharp = cSharp;
        this.python = python;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getcSharp() {
        return cSharp;
    }

    public void setcSharp(int cSharp) {
        this.cSharp = cSharp;
    }

    public int getPython() {
        return python;
    }

    public void setPython(int python) {
        this.python = python;
    }
}
