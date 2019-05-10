/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class CicloTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String nombres = "";
        String apellidos = "";
        String valorUsuario;
        int edad = 0;
        int contador = 0;
        int sumaEdades = 0;
        double promedioEdades = 0;
        boolean bandera = true;

        cadena = String.format("%s%s\n", cadena, 
                "Listado de personas ingresadas: ");
        do {
            contador = contador + 1;

            System.out.println("Ingrese sus nombres");
            nombres = entrada.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellidos = entrada.nextLine();

            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            entrada.nextLine();
            
            cadena= String.format("%s%s%s\nedad:%d\n", cadena, nombres,
                    apellidos,edad);
                    
            sumaEdades = sumaEdades + edad;
            
            System.out.println("Desea salir ingrese 'n'");
            valorUsuario = entrada.nextLine();
            if (valorUsuario.equals("n")){
                bandera = false;
            }
        } while (bandera == true);

        promedioEdades = (double) sumaEdades / contador;
        cadena = String.format("%sPromedio de edades: %2f\n", cadena,
                promedioEdades);
        System.out.printf("%s", cadena);
    }

}
