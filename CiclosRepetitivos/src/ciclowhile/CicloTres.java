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
public class CicloTres {

    public static void main(String[] args) {

        int limite = 5;
        int cont = 1;
        int suma = 0;
       
        System.out.printf("%s", "la suma de:\n");
        
        while (cont <= limite) {
            suma = suma + cont;
            
            System.out.printf("%d\n", cont);
            
            cont = cont + 1;
            
        }
        System.out.printf("Tiene un resultado de : %d\n", suma);
    }
}
