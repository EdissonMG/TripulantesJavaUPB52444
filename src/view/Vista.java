package view;

import model.Curso;

public class Vista {
    
    public static void main(String[] args) {
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 70400, "Marco Frances");
        Curso cursoItaliano = new Curso(52442, "Italiano 101", 'T', 70401, "Marco Italiano");
        
        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        System.out.println(cursoItaliano.getFormador().getNombre());
        System.out.println(cursoItaliano.getFormador().getCodigo());

        cursoFrances.setNombre("CambiandoNombre");
    }
}
