import model.Curso;
import model.Tripulante;
import view.Vista;

public class App {
    public static void main(String[] args){
        
        Curso programacion1 = new Curso(1234, "Fundamentos de programacion", 'M', 7400, "Dev 1");
        programacion1.getNombre();

        try {
            programacion1.calcularPromedioCurso();
        } catch (Exception e) {
            e.getMessage();
        }

        Tripulante t = new Tripulante();
        t.setNombre("Edisson");
        t.setNota1(3);
        t.setNota2(4);
        t.setNota3(2);
        t.adicionarCursos(programacion1);
        Tripulante t1 = new Tripulante();
        t1.setNombre("Estefania");
        t1.setNota1(3);
        t1.setNota2(4);
        t1.setNota3(4);
        Tripulante t2 = new Tripulante();
        t2.setNombre("Juan");
        t2.setNota1(1);
        t2.setNota2(3);
        t2.setNota3(5);
        
        programacion1.agregarTripulante(t);
        programacion1.agregarTripulante(t1);
        programacion1.agregarTripulante(t2);
        
        //for (Tripulante desarrollador : programacion1.getTripulantes()) {
        //    desarrollador.getNombre();
        //    desarrollador.getHighNote();
        //}

        //programacion1.calcularPRomedioCurso();
        ///crear la lista de cursos en tripulantes.
        
        Vista v = new Vista();
        v.setVisible(true);

    }

}
