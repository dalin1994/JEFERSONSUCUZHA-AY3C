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
public class novenoejer {
    public static void main(String[] args) {
        int numero;
        int resultado;


       Scanner entrada=new Scanner(System.in);
       System.out.println("Introducir el número de tabla");
       numero = entrada.nextInt();
       resultado = 0;
       if (numero <= 15)
                for (int i = 0; i <= 15; i++)
                {
                    resultado = numero * i;
                    System.out.println(numero+"+"+i+"="+resultado);
                }
            else
                System.out.println("no compañero");
      

        
    }
    
}
