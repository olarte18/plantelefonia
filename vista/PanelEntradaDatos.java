package vista;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbOperador, lbNum, lbValor,lbCant ;
    private JComboBox cbOperador;
    private TextField txNum,txValor, txCant; 

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
        lbOperador.setBounds(0,110,100,20);
        this.add(lbOperador);
        //Crear y agregar texto empleados
        lbNum = new JLabel("Numero celular: ", JLabel.RIGHT);
        lbNum.setBounds(10,20,100,20);
        this.add(lbNum);
        //Crear y agregar etiqueta empleados
        lbValor = new JLabel("Valor minuto ");
        lbValor.setBounds(0,50,100,20);
        this.add(lbValor);
        //Crear y agregar etiqueta empleados
        lbCant = new JLabel("Num Minutos ", JLabel.RIGHT);
        lbCant.setBounds(10,80,100,20);
        this.add(lbCant);
        //Crear y agregar combo lista Empleados
        cbOperador = new JComboBox();
		cbOperador.addItem("Claro");
		cbOperador.addItem("Wom");
		cbOperador.addItem("tigo");
        cbOperador.setBounds(100,110,260,20);
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
