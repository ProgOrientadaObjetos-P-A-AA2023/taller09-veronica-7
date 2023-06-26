
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;

public class Ejecutor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        byte opc;
        String continuar;
        
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        do {
            System.out.println("              Tipo de Prestamos\n"
                    + "-> Ingrese (1) para adquirir un préstamo Vehicular\n"
                    + "-> Ingrese (2) para adquirir un préstamo Estudiantil");
             opc = entrada.nextByte();
            
            if (opc == 1) {
                entrada.nextLine();
                System.out.print("Ingrese el nombre del Beneficiario:\n ");
                String nombreB = entrada.nextLine();
                System.out.print("Ingrese el apellido del Beneficiario:\n ");
                String apellidoB = entrada.nextLine();
                System.out.print("Ingrese el username del Beneficiario:\n ");
                String userB = entrada.nextLine();

                Persona beneficiario = new Persona(nombreB, apellidoB, userB);

                System.out.print("Ingrese la ciudad del préstamo:\n ");
                String ciudad = entrada.nextLine();
                System.out.print("Ingrese los meses a los que sacará el préstamo:\n ");
                int mesesPrestamo = entrada.nextInt();
                entrada.nextLine();

                System.out.println("-> Ingrese los datos del garante del prestamo.");
                System.out.print("Nombre:\n ");
                String nombreG = entrada.nextLine();
                System.out.print("Apellido:\n ");
                String apellidoG = entrada.nextLine();
                System.out.print("Username:\n ");
                String userG = entrada.nextLine();
                
                Persona garante = new Persona(nombreG, apellidoG, userG);
                
                System.out.println("-> Ingrese los datos del vehciulo.");
                System.out.print("Ingrese el tipo de vehiculo:\n ");
                String tipo = entrada.nextLine();
                System.out.print("Ingrese la marca del vehiculo:\n ");
                String marca = entrada.nextLine();
                System.out.print("Ingrese el valor del vehiculo:\n ");
                double valorVehiculo = entrada.nextDouble();
                
                PrestamoAutomovil pA = new PrestamoAutomovil(beneficiario,
                        mesesPrestamo, ciudad, garante, tipo, marca, valorVehiculo);
                pA.establecerValorMensPresA();
                
                prestamos.add(pA);
 
            } else if (opc == 2) {
                entrada.nextLine();
                System.out.print("Ingrese el nombre del Beneficiario:\n");
                String nombreB = entrada.nextLine();
                System.out.print("Ingrese el apellido del Beneficiario:\n");
                String apellidoB = entrada.nextLine();
                System.out.print("Ingrese el username del Beneficiario:\n");
                String userB = entrada.nextLine();

                Persona beneficiario = new Persona(nombreB, apellidoB, userB);
                
                System.out.print("Ingrese la ciudad del préstamo:\n");
                String ciudad = entrada.nextLine();
                System.out.print("Ingrese los meses a los que sacará el préstamo:\n");
                int mesesPrestamo = entrada.nextInt();
                entrada.nextLine();
                
                System.out.print("Ingrese el nivel de estudios:\n ");
                String nivel = entrada.nextLine();
                System.out.print("Ingrese el nombre de la institución educativa:\n ");
                String nombreIns = entrada.nextLine();
                System.out.print("Ingrese las siglas de la institución educativa:\n ");
                String siglasIns = entrada.nextLine();
                
                InstitutoEducativo instituto = new InstitutoEducativo(nombreIns, siglasIns);
                
                System.out.print("Ingrese el valor de la carrera:\n ");
                double valorCarrera = entrada.nextDouble();
                
                PrestamoEducativo pE = new PrestamoEducativo(beneficiario,
                        mesesPrestamo, ciudad, nivel, instituto, valorCarrera);
                
                pE.establecerValorMensPresC();
                
                prestamos.add(pE);
            }
            entrada.nextLine();
            // Se pregunta si se desea ingresar más préstamos
            System.out.println("Si desea ingresar otro prestamo digite SI para "
                    + "continuar o digite la letra NO para salir del proceso");
            
            continuar = entrada.nextLine();
        } while (continuar.equals("SI"));
        
        System.out.println("");
        System.out.println("LISTA DE PRÉSTAMOS!!");
        for (int i = 0; i < prestamos.size(); i++) {
            System.out.printf("> Prestamo N°"+ (i + 1)+"\n%s\n",
                    prestamos.get(i));
        }
    }
}