/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class CicloCinco {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int limite = 3;
        int cont = 1;
        int suma = 0;
        int nota = 0;
        double promedio = 0;
        String mensajeFinal = "";
        

        //System.out.printf("%s", "la suma de:\n");
        mensajeFinal = String.format("%s%s\n", mensajeFinal, 
                "Las notas ingresadas fueron:");
        while (cont <= limite) {
            System.out.printf("Ingrese la nota %d :1", cont);
            nota = entrada.nextInt();
            suma = suma + nota;
            //System.out.printf("%d\n", cont);
            mensajeFinal = String.format("%s%d\n", mensajeFinal, nota);
            
            cont = cont + 1;
            
        }
        promedio = (double)suma/limite;
        mensajeFinal = String.format("%s Y su promedio es: %2f\n",
                mensajeFinal, promedio);
        System.out.printf("%s", mensajeFinal);
    }
}
