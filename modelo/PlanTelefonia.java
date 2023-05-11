package modelo;

public class PlanTelefonia
{
    private int numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorMinutos;
    private double costoPlan;


    public PlanTelefonia(int pNumeroCelular, String pOperador, int pCantidadMinutos, double pValorMinutos)
    {
        this.numeroCelular=pNumeroCelular;
        this.operador=pOperador;
        this.cantidadMinutos=pCantidadMinutos;
        this.valorMinutos=pValorMinutos;
    }
    public PlanTelefonia() 
    {
        this.numeroCelular = 0;
        this.operador = "";
        this.cantidadMinutos = 0;
        this.valorMinutos = 0.0;
    }
    public int  getNumeroCelular()
    {
        return numeroCelular;
    }
    public String getOperador()
    {
        return operador;
    }
    public int  getCantidadMinutos()
    {
        return cantidadMinutos;
    }
    public double getValorMinutos()
    {
        return valorMinutos;
    }
    public double calcularCostoPlan()
    {
        if(operador.equals("Wom"))
        {costoPlan=(cantidadMinutos*valorMinutos)*0.5;}
        else{
            costoPlan=cantidadMinutos*valorMinutos ;
        }
        return costoPlan ;
    }
    public double getCostoPlan()
    {
        return costoPlan;
    }
}
