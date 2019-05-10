/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

/**
 *
 * @author INSPIRON
 */
public class CicloCuatro {

    public static void main(String[] args) {

        int limite = 5;
        int cont = 1;
        int suma = 0;
        String mensajeFinal = "";
        

        //System.out.printf("%s", "la suma de:\n");
        mensajeFinal = String.format("%s%s\n", mensajeFinal, "La suma de");
        while (cont <= limite) {
            suma = suma + cont;
            //System.out.printf("%d\n", cont);
            mensajeFinal = String.format("%s%d\n", mensajeFinal, cont);
            
            cont = cont + 1;
            
        }
        mensajeFinal = String.format("%s tiene un resultado de: %d\n",
                mensajeFinal, suma);
        System.out.printf("%s", mensajeFinal);
    }
}
