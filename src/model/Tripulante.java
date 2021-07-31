package model;

import java.util.ArrayList;

public class Tripulante {

    //Constantes
    //las constantes van con + al inicio... esto en el diagrama UML (se escriben en mayusculas)

    public final static double NOTA_MAXIMA = 5.0;

    //Final es constante
    //static nos permite ingresar a la constante en la clase
    
    /**Atributos o caracteristicas que se definieron */
    
    private String nombre;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private float numeroIdentificacion;
    private String email;

    private ArrayList<Curso> cursos;

    public Tripulante() {
        super();
        cursos = new ArrayList<Curso>();
    }

    public Tripulante(String pnombre, int pid,float pnumeroIdentificacion, String pemail) {
        super();
        this.nombre =  pnombre;
        this.id = pid;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.numeroIdentificacion = pnumeroIdentificacion;
        this.email = pemail;
        cursos = new ArrayList<Curso>();
        
    }
   
    /**Getters */

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public String getEmail() {
        return email;
    }

    public float getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**Setters */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota1(double nota1) {
        if (nota1 <= NOTA_MAXIMA){
            this.nota1 = nota1;
        }
        else{
            System.out.println("La nota debe ser menor a " + NOTA_MAXIMA);
        }
    }

    public void setNota2(double nota2) {
        if (nota2 <= NOTA_MAXIMA){
            this.nota2 = nota2;
        } 
        else{
            System.out.println("La nota debe ser menor a " + NOTA_MAXIMA);
        }      
    }

    public void setNota3(double nota3) {
        if (nota3 <= NOTA_MAXIMA ){
            this.nota3 = nota3;
        }
        else{
            System.out.println("La nota debe ser menor a " + NOTA_MAXIMA);
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroIdentificacion(float numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public double getAverage() {
        return (nota1 + nota2 + nota3)/3;
    }

    public double getHighNote() {
        
        if (nota1 >= nota2 && nota1 >= nota3){
            return(nota1);
        } else if (nota2 >= nota3) {
            return(nota2);
        }
        
        return(nota3);

    }

    public double getlowNote() {
        if (nota1 <= nota2 && nota1 <= nota3) {
            return(nota1);            
        }else if (nota2 <= nota3) {
           return (nota2);
        }
        return (nota3);        
    }

    public boolean checkIfPass() {
        
        if (getAverage() >= 3.0){
            return true;
        }
            return false;
    }

    public String adicionarCursos(Curso c){
        cursos.add(c);
        return "Curso adicionado " + c + " para el tripulante " + nombre ;
    }
}
