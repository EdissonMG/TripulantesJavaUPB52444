package model;

public class Curso {
    private int codigo;
    private String nombre;
    private char jornada;

    public Curso(int pcodigo, String pnombre, char pjornada) {
        super();
        this.codigo = pcodigo;
        this.nombre = pnombre;
        this.jornada = pjornada;  
    }

    public int getCodigo() {
        return codigo;
    }

    public char getJornada() {
        return jornada;
    }

    public String getNombre() {
        return nombre;
    }


}
