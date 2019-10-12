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
public class sextoejer {
    public static void main(String[] args) {
        
        int numero;
        String adicion;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese el numero");
        numero=entrada.nextInt();
        adicion=("*");
        rombo(adicion, numero);
        
    }
    public static void rombo(String adicion, int numero){
        int a = 0; 

            for (int i = 0; i < numero; i++)
            {

                for (int j = 1; j <= (numero-1) - i; j++)
                {
                    System.out.print(" ");
                }
                System.out.println(adicion);
                adicion += "**";

            }
            for (int i = 1; i < numero; i++)
            {
                for (int j = numero; j > numero - i; j--)
                {
                    System.out.print(" ");
                }

                for (int j = (((numero - 1) * 2) - a); j > i; j--)
                {

                    System.out.print("*");

                }
                a++;
                System.out.println();
            }
        }

        
    }

    
    
    
