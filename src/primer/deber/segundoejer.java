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
public class segundoejer {
    public static void main(String[] args) {
        Scanner en = new Scanner (System.in);
         int tamaño =0;

        
             System.out.println("Ingrese el tamaño del cuadrado: ");
            tamaño = en.nextInt();

        
       
           
                //linea superior
                for (int i = 0; i < tamaño; i++)
                {
                    System.out.print("*");
                }
                 System.out.println(" ");
                //parte media
                for (int i = 0; i < tamaño - 2; i++)
                {
                     System.out.print("*");
                    for (int j = 0; j < tamaño - 2; j++)
                    {
                         System.out.print(" ");
                    }
                     System.out.println("*");
                }
                //linea inferior
                for (int i = 0; i < tamaño; i++)
                {
                     System.out.print("*");
                }
           
                   

        }
        
         
    }
    
    
    

