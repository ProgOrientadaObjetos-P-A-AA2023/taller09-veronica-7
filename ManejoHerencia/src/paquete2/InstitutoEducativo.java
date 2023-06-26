
package paquete2;

public class InstitutoEducativo {
    private String nombreIns;
    private String siglas;
    
    public InstitutoEducativo(String nI, String s){
        nombreIns = nI;
        siglas = s;
    }

    public void establecerNombreIns(String p) {
        nombreIns = p;
    }

    public void setestablecerSiglas(String p) {
        siglas = p;
    }

    public String obtenerNombreIns() {
        return nombreIns;
    }

    public String obtenerSiglas() {
        return siglas;
    }    
}
