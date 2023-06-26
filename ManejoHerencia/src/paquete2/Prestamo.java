
package paquete2;

public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPres;
    protected String ciudadPres;
    
    public Prestamo(Persona b, int tP, String cP){
        beneficiario = b;
        tiempoPres = tP;
        ciudadPres = cP;
    }

    public void obtenerBeneficiario(Persona p) {
        beneficiario = p;
    }

    public void obtenerTiempoPres(int p) {
        tiempoPres = p;
    }

    public void obtenerCiudadPres(String p) {
        ciudadPres = p;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPres() {
        return tiempoPres;
    }

    public String obtenerCiudadPres() {
        return ciudadPres;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\tNombre del Beneficiario: %s\n\t"
                + "Apellido del Beneficiario: %s\n\t"
                + "UserName del Beneficiario: %s\n\t"
                + "Duración del prestamo: %d meses\n\t"
                + "Ciudad del préstamo: %s\n", 
                obtenerBeneficiario().obtenerNombre(), 
                obtenerBeneficiario().obtenerApellido(), 
                obtenerBeneficiario().obtenerUserName(),
                obtenerTiempoPres(),
                obtenerCiudadPres());
        
        return cadena;
    }
}   