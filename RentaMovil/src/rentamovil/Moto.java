/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentamovil;

/**
 *
 * @author Daniel Hesse
 */
public class Moto extends Vehiculo
{
    private double cilindraje;
    
    public Moto
    (String placa, String marca, String modelo, Double tarifaDiaria, 
     Boolean rentado, Integer diasRenta, double cilindraje) 
    {
        super(placa, marca, modelo, tarifaDiaria, rentado, diasRenta);
        this.cilindraje = cilindraje;
    }
    
    public Double getcilindraje()
    {
        return this.cilindraje;
    }
    public void setCilindraje(double cilindraje)
    {
        this.cilindraje = cilindraje;
    }
    
    @Override
    public Double calcularTarifa()
    {
        
        if(this.cilindraje > 250)
        {
            return 75 + (super.calcularTarifa() * super.getDias());
        }
        else
        {
            return (super.calcularTarifa() * super.getDias());
        }
    }
    
    @Override
    public Double calcularTarifaTentativa(int dias)
    {
        
        if(this.cilindraje > 250)
        {
            return 75 + (super.calcularTarifa() * dias);
        }
        else
        {
            return (super.calcularTarifa() * dias);
        }
    }
}
