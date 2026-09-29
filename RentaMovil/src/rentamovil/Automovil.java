/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentamovil;

/**
 *
 * @author Daniel Hesse
 */
public class Automovil extends Vehiculo 
{
    private int capacidadPersonas;
    private boolean automatico;

    
    public Automovil
    (String placa, String marca, String modelo, Double tarifaDiaria, 
     Boolean rentado, Integer diasRenta, int capacidadPersonas, 
     boolean automatico) 
    {
        super(placa, marca, modelo, tarifaDiaria, rentado, diasRenta);
        this.capacidadPersonas = capacidadPersonas;
        this.automatico = automatico;
    }
    
    public int getPersonas()
    {
        return this.capacidadPersonas;
    }
    public void setPersonas(int capacidad)
    {
        this.capacidadPersonas = capacidad;
    }
    
    public boolean getAutomatico()
    {
        return this.automatico;
    }
    public void setAutomatico(boolean automatico)
    {
        this.automatico = automatico;
    }
    
    @Override
    public Double calcularTarifa()
    {
        
        if(automatico)
        {
            return (50 * super.getDias()) + (super.calcularTarifa() * super.getDias());
        }
        else
        {
            return (super.calcularTarifa() * super.getDias());
        }
    }
    
    @Override
    public Double calcularTarifaTentativa(int dias)
    {
        if(automatico)
        {
            return (50 * dias) + (super.calcularTarifa() * dias);
        }
        else
        {
            return (super.calcularTarifa() * dias);
        }
    }
    
    
}
