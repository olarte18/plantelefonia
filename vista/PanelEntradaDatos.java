package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbOperador;
    private JComboBox cbOperador;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbOperador = new JLabel("Operadores ", JLabel.RIGHT);
        lbOperador.setBounds(10,90,100,20);
        this.add(lbOperador);

        //Crear y agregar combo lista Empleados
        cbOperador = new JComboBox();
		cbOperador.addItem("Claro");
		cbOperador.addItem("Wom");
		cbOperador.addItem("tigo");
        cbOperador.setBounds(100,90,260,20);
        this.add(cbOperador);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
    public String getOperador()
    {
        return (String) cbOperador.getSelectedItem();
    }

}
