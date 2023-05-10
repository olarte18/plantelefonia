package controlador;

import modelo.PlanTelefonia;
import vista.PanelEntradaDatos;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia plan;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pPlan)
    {
        this.venPrin = pVenPrin;
        this.plan = pPlan;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nPlanTelefonia\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor





        //Calcular el sueldo de un vendedor
        if(comando.equals("calcular"))
        {
            String operador = venPrin.miPanelEntradaDatos.getOperador();
            plan.calcularCostoPlan();
            venPrin.miPanelResultados.mostrarResultado("El sueldo del empleado: " + plan.getCostoPlan());
        }


        
        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        } 
    }
}
