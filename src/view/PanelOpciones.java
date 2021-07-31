package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

////1 paso crear la relación o atributos, 2 paso inicializarlos, 3 modificar las propiedades y 4 paso es agregarlos

public class PanelOpciones extends JPanel implements ActionListener{
    
    public final static String OPCION_1= "Ver mejor promedio";
    public final static String BTN_ADD_CURSO = "Agregar Curso";
    //creamos la relacion
    private JButton opcion1;
    private JButton btnAddCurso;

    //atributo para concer la vista
    private Vista vistaPrincipal;

    public PanelOpciones(Vista v) {
        super();

        setLayout(new GridLayout(1,3));

        vistaPrincipal = v;

        //inicializar el boton
        opcion1 = new JButton(OPCION_1);
        btnAddCurso = new JButton(BTN_ADD_CURSO);

        //Modificar propiedades del boton
        opcion1.setActionCommand(OPCION_1);
        btnAddCurso.setActionCommand(BTN_ADD_CURSO);

        opcion1.addActionListener(this);
        btnAddCurso.addActionListener(this);

        //agregar
        add(opcion1);
        add(btnAddCurso);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals(OPCION_1)){
            System.out.println("hola");
        }
        else if (e.getActionCommand().equals(BTN_ADD_CURSO)){
            System.out.println("Agregar Curso");
        }
    }
}


