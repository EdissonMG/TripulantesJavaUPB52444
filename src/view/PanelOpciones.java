package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

////1 paso crear la relación o atributos, 2 paso inicializarlos, 3 modificar las propiedades y 4 paso es agregarlos

public class PanelOpciones extends JPanel implements ActionListener{
    
    public final static String OPCION_1= "Ver mejor promedio";
    //creamos la relacion
    private JButton opcion1;

    public PanelOpciones() {
        super();

        setLayout(new GridLayout(1,3));

        //inicializar el boton
        opcion1 = new JButton(OPCION_1);

        //Modificar propiedades del boton... agregar accion
        opcion1.setActionCommand(OPCION_1);
        opcion1.addActionListener(this);

        //agregar
        add(opcion1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals(OPCION_1)){
            System.out.println("hola");
        }
    }
}


