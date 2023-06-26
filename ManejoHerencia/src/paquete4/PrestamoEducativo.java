
package paquete4;
import paquete2.*;

public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitutoEducativo tipoInst;
    private double valorCarrera;
    private double valorMensPresC;
    
    public PrestamoEducativo(Persona b, int tP, String cP ,String nE, 
            InstitutoEducativo tI, double vC) {
        super(b, tP, cP.toUpperCase());
       nivelEstudio = nE;
       tipoInst = tI;
       valorCarrera = vC;;
    }

    public void establecerNivelEstudio(String p) {
        nivelEstudio = p;
    }

    public void establecerTipoInst(InstitutoEducativo p) {
        tipoInst = p;
    }

    public void establecerValorCarrera(double p) {
        valorCarrera = p;
    }

    public void establecerValorMensPresC() {
        valorMensPresC = (valorCarrera/tiempoPres)-(0.1*(valorCarrera/tiempoPres));
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitutoEducativo obtenerTipoInst() {
        return tipoInst;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensPresC() {
        return valorMensPresC;
    }  
    
    @Override
    public String toString(){
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%sPRESTAMO EDUCATIVO\n\t"
                + "Nombre de la Institución educativa: %s\n\t"
                + "Siglas de la Institución educativa: %s\n\t"
                + "Nivel de estudio: %s\n\t"
                + "Valor de la carrera: $%.2f\n\t"
                + "~> Valor mensual del prestamo estudiantil: $%.2f\n",
                cadena,
                obtenerTipoInst().obtenerNombreIns(),
                obtenerTipoInst().obtenerSiglas(),
                obtenerNivelEstudio(),
                obtenerValorCarrera(),
                obtenerValorMensPresC());
        
        return cadena;
    }
}