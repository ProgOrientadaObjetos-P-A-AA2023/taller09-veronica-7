
package paquete3;

import paquete2.*;

public class PrestamoAutomovil extends Prestamo {
    private String tipoAuto;
    private String marca;
    private Persona garante1;
    private double valorAuto;
    private double valorMensPresA;

    public PrestamoAutomovil(Persona b, int tP, String cP , Persona g1, 
            String tA, String m, double vA) {
        super(b, tP, cP.toLowerCase());
        garante1 = g1;
        tipoAuto = tA;
        marca = m;
        valorAuto = vA;;
    }
    
    public void establecerGarante1(Persona p) {
        garante1 = p;
    }

    public void establecerTipoAuto(String p) {
        tipoAuto = p;
    }

    public void establecerMarca(String p) {
        marca = p;
    }
    
    public void establecerValorAuto(double p) {
        valorAuto = p;
    }

    public void establecerValorMensPresA() {
        valorMensPresA = valorAuto/tiempoPres;
    }
    
    public Persona obtenerGarante1() {
        return garante1;
    }
    
    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public String obtenerMarca() {
        return marca;
    } 

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerValorMensPresA() {
        return valorMensPresA;
    }
    
    @Override
    public String toString(){
        // String cadena = String.format(">> PRÉSTAMO VEHICULO.\n");
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%sPRESTAMO AUTOMOVIL.\n\t"
                + "Nombre del Garante: %s\n\t"
                + "Apellido del Garante: %s\n\t"
                + "Username del Garante: %s\n\t"
                + "Tipo de vehiculo: %s\n\t"
                + "Marca del vehiculo: %s\n\t"
                + "Valor del vehiculo: $%.2f\n\t"
                + "~> Valor mensual del Prestamo vehicular: $%.2f \n",
                cadena,
                obtenerGarante1().obtenerNombre(),
                obtenerGarante1().obtenerApellido(),
                obtenerGarante1().obtenerUserName(),
                obtenerTipoAuto(),
                obtenerMarca(),
                obtenerValorAuto(),
                obtenerValorMensPresA());
        
        return cadena;
    }
}  