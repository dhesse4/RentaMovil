/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentamovil;

/**
 *
 * @author Daniel Hesse
 */
public class Vehiculo 
{
    private String placa;
    private String marca; 
    private String modelo;
    private Double tarifaDiaria;
    private Boolean rentado;
    private Integer diasRenta;
    
    
    public Vehiculo
    (
       String placa,
       String marca, 
       String modelo,
       Double tarifaDiaria,
       Boolean rentado,
       Integer diasRenta
    )
    {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaDiaria = tarifaDiaria;
        this.rentado = rentado;
        this.diasRenta = diasRenta;
    }
    
    public String getPlaca()
    {
        return this.placa;
    }
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public Double calcularTarifa()
    {
        return this.tarifaDiaria;
    }
    public void getTarifa(Double tarifa)
    {
        this.tarifaDiaria = tarifa;
    }
    
    public Boolean getRentado()
    {
        return this.rentado;
    }
    public void setRentado(Boolean rentado)
    {
        this.rentado = rentado;
    }
    
    public Integer getDias()
    {
        return this.diasRenta;
    }
    public void setDias(Integer dias)
    {
        this.diasRenta = dias;
    }
    
    public Double calcularTarifaTentativa(int dias)
    {
        return this.tarifaDiaria;
    }
    
    public double getTarifaBasica()
    {
        return this.tarifaDiaria;   
    }
}
