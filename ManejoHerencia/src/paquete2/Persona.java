
package paquete2;

public class Persona {
    private String nombre;
    private String apellido;
    private String userName;
    
    public Persona(String n, String a, String u){
        nombre = n;
        apellido = a;
        userName = u;
    }

    public void establecerNombre(String p) {
        nombre = p;
    }

    public void establecerApellido(String p) {
        apellido = p;
    }

    public void establecerUserName(String p) {
        userName = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUserName() {
        return userName;
    }
    
    
}
