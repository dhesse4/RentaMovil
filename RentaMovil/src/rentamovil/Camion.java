/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentamovil;

/**
 *
 * @author Daniel Hesse
 */
public class Camion extends Vehiculo
{
    private double capacidadTransporte;
    
    public Camion
    (String placa, String marca, String modelo, Double tarifaDiaria, 
     Boolean rentado,Integer diasRenta, double capacidadTransporte) 
    {
        super(placa, marca, modelo, tarifaDiaria, rentado, diasRenta);
        this.capacidadTransporte = capacidadTransporte;
    }
    
    public double getCapacidad()
    {
        return this.capacidadTransporte;
    }
    public void setCapacidad(double capacidad)
    {
        this.capacidadTransporte = capacidad;
    }
    
    @Override
    public Double calcularTarifa()
    {
        
        return(super.getDias() * (100 * this.capacidadTransporte))+ 
              (super.calcularTarifa() * super.getDias());
        
    }
    
    @Override
    public Double calcularTarifaTentativa(int dias)
    {
        
         return (super.calcularTarifa() + 100 * capacidadTransporte)
            * dias;
        
    }
}
