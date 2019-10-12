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
public class octavoejer {
    public static void main(String[] args) {
        int numero;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero=entrada.nextInt();
        System.out.println("Aumento de uno en uno");

            for (int i = 1; i <= numero; i++)
            {
                System.out.println(i);

            }
            System.out.println();
            System.out.println("Aumento de dos en dos");
            for (int i = 1; i <= numero; i+=2)
            {
                System.out.println(i );
            }
            System.out.println();
            System.out.println("Aumento de tres en tres");
            for (int i = 1; i <= numero; i += 3 ) 
            {
                System.out.println(i);
            }
        }
    
    
    
}
