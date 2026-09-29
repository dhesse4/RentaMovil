/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentamovil;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Hesse
 */
public class GestorDatos 
{
    private static final GestorDatos INSTANCIA = new GestorDatos();

    private final List<Vehiculo> vehiculos;
    private boolean datosInicialesCargados;
    private double total;
    
    private GestorDatos()
    {
        vehiculos = new ArrayList<>();
        llenarVehiculos();
    }
    
    public void llenarVehiculos()
    {
     if (datosInicialesCargados) {
            return;
        }

        // AUTOMÓVILES
        // placa, marca, modelo, tarifa, rentado, días,
        // capacidad de personas, automático

        vehiculos.add(new Automovil(
                "P101ABC", "Toyota", "Corolla",
                250.0, false, 0, 5, true
        ));

        vehiculos.add(new Automovil(
                "P102ABC", "Hyundai", "Accent",
                200.0, false, 0, 5, false
        ));

        vehiculos.add(new Automovil(
                "P103ABC", "Kia", "Picanto",
                175.0, false, 0, 5, false
        ));

        vehiculos.add(new Automovil(
                "P104ABC", "Honda", "Civic",
                275.0, false, 0, 5, true
        ));

        vehiculos.add(new Automovil(
                "P105ABC", "Toyota", "Avanza",
                325.0, false, 0, 7, false
        ));

        vehiculos.add(new Automovil(
                "P106ABC", "Mazda", "MX-5",
                450.0, false, 0, 2, true
        ));

        // MOTOCICLETAS
        // placa, marca, modelo, tarifa, rentado, días, cilindraje

        vehiculos.add(new Moto(
                "M201ABC", "Honda", "Wave 110",
                75.0, false, 0, 110.0
        ));

        vehiculos.add(new Moto(
                "M202ABC", "Bajaj", "Boxer 150",
                90.0, false, 0, 150.0
        ));

        vehiculos.add(new Moto(
                "M203ABC", "TVS", "Apache 200",
                110.0, false, 0, 200.0
        ));

        // Exactamente 250 cc: no aplica el recargo.
        vehiculos.add(new Moto(
                "M204ABC", "Suzuki", "Ejemplo 250",
                125.0, false, 0, 250.0
        ));

        vehiculos.add(new Moto(
                "M205ABC", "Honda", "Ejemplo 300",
                150.0, false, 0, 300.0
        ));

        vehiculos.add(new Moto(
                "M206ABC", "Kawasaki", "Ejemplo 650",
                225.0, false, 0, 650.0
        ));

        // CAMIONES / CAMIONETAS DE CARGA
        // placa, marca, modelo, tarifa, rentado, días,
        // capacidad en toneladas

        vehiculos.add(new Camion(
                "C301ABC", "Suzuki", "Carry",
                150.0, false, 0, 0.75
        ));

        vehiculos.add(new Camion(
                "C302ABC", "Toyota", "Hilux",
                175.0, false, 0, 1.0
        ));

        vehiculos.add(new Camion(
                "C303ABC", "Isuzu", "NPR",
                200.0, false, 0, 1.5
        ));

        vehiculos.add(new Camion(
                "C304ABC", "Hyundai", "HD",
                250.0, false, 0, 2.5
        ));

        vehiculos.add(new Camion(
                "C305ABC", "Hino", "Serie 300",
                325.0, false, 0, 3.5
        ));

        vehiculos.add(new Camion(
                "C306ABC", "Isuzu", "NQR",
                400.0, false, 0, 5.0
        ));

        datosInicialesCargados = true;   
    }
    
    public static GestorDatos getInstancia()
    {
        return INSTANCIA;
    }
    
    public List<Vehiculo> getVehiculos()
    {
        return this.vehiculos;
    }
    
    public Vehiculo buscarPorPlaca(String placa) 
    {
        for (Vehiculo vehiculo : vehiculos) 
        {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa.trim())) 
            {
                return vehiculo;
            }
        }
        return null; // No se encontró la placa.
    }
    
    public double getTotal()
    {
        return this.total;
    }
    
    public void setTotal(double montoVenta)
    {
        total += montoVenta;
    }
}
