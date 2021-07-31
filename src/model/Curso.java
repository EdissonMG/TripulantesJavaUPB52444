package model;

import java.util.ArrayList;

public class Curso {
    //clase constantes atributos constructores getters setters y metodos de funcionalidades (estandar de crear clases)
    public final static int MAXIMO_TRIPULANTES = 2; //or public static final....

    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;


    private ArrayList<Tripulante> tripulantes; //Tripulante es el tipo de dato que se quiere guardar

    public Curso(int pcodigo, String pnombre, char pjornada, int fCodigo, String fNombre) {
        super();
        this.codigo = pcodigo;
        this.nombre = pnombre;
        this.jornada = pjornada;  
        formador =  new Formador(fNombre, fCodigo);
        tripulantes = new ArrayList<>();
    }

    public Curso(int pcodigo, String pnombre, char pjornada) {
        super();
        this.codigo = pcodigo;
        this.nombre = pnombre;
        this.jornada = pjornada;  
        formador =  null;
        tripulantes = new ArrayList<>();
    }

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
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

    public Formador getFormador() {
        return formador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String agregarTripulante(Tripulante t){
        if (tripulantes.size() == MAXIMO_TRIPULANTES){
            return "No se puede agregar mas de "     + MAXIMO_TRIPULANTES + " tripulantes";
        }
        tripulantes.add(t);
        return "Tripulante agregado al curso " + nombre;

    }

    public double calcularPRomedioCurso() throws Exception{
        if(tripulantes.size()==0){
            throw new Exception("No hay tripulantes registrados en el curso");
        }

        double total = 0.0;
        for (Tripulante tripulante : tripulantes) {
            total += tripulante.getAverage();
        }
        return total/tripulantes.size();
    }

}
