package view;

import model.Curso;

public class Vista {
    
    public static void main(String[] args) {
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N');
        System.out.println(cursoFrances.getCodigo());
    }
}
