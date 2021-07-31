package view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import jdk.nashorn.internal.scripts.JO;

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

    public void addCurso() {

        String[] options = new String[3];
        options[0] = "Mañana";
        options[1] = "Tarde";
        options[2] = "Noche";
        char[] optionsShort = new char[3];
        optionsShort[0] = 'M';
        optionsShort[1] = 'T';
        optionsShort[2] = 'N';

        //solo para mostrar información
        //JOptionPane.showMessageDialog(vistaPrincipal,"Un mensaje");
        String nombre = JOptionPane.showInputDialog(vistaPrincipal, "Digita el nombre del curso");
        String codigo = JOptionPane.showInputDialog(vistaPrincipal, "Digital el codigo del curso");
        //String jornada = JOptionPane.showInputDialog(vistaPrincipal, "Digita la jornada Mañana, Tarde, Noche");
        int option = JOptionPane.showOptionDialog(vistaPrincipal, "Escoge una opción", "Jornada del curso", 0, 
                                        JOptionPane.PLAIN_MESSAGE, null, options, null);

        System.out.println(option);
        if (nombre !=null && !nombre.equals("") && option != -1 && codigo != "") {
            vistaPrincipal.addCurso(Integer.parseInt(codigo), nombre, optionsShort[option]);
        }
        else{

            JOptionPane.showMessageDialog(vistaPrincipal, "Ups! Revisa los datos", 
                        "Error en los datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals(OPCION_1)){
            System.out.println("hola");
        }
        else if (e.getActionCommand().equals(BTN_ADD_CURSO)){
            addCurso();
            //System.out.println("Agregar Curso");
        }
    }
}


