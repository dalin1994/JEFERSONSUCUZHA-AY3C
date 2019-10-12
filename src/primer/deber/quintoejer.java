/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.deber;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class quintoejer {
    public static void main(String[] args) {
        int numero;
        String adicion;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("El numero que va ha ingresar");
        numero=entrada.nextInt();
        adicion="*";
        piramide(numero,adicion);
           
    }
    public static void piramide(int numero, String adicion){
        for (int i = 0; i < numero; i++) {

                for (int j = 1; j <= (numero - i); j++)
                {
                    System.out.print(" ");
                }
                System.out.println(adicion);
                adicion += "**";

            }
        }

       
    
}
