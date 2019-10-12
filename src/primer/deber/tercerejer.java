package primer.deber;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class tercerejer {
     public static void main(String[] args) {
         int cantidad=1,producto=0;
         double precio,total,acumulador=0;
         Scanner entrada= new Scanner(System.in);
         
         while(cantidad!=0){
            
             System.out.println("producto numero " +producto);
             System.out.println("ingrese la cantidad");
             cantidad=entrada.nextInt(); 
             if(cantidad==0)
                 break;
             System.out.println("ingrese el precio c/u");
             precio=entrada.nextInt();
             acumulador=acumulador+(precio*cantidad);
             producto++;
         
         }
         System.out.println("total " +acumulador);
         
         
         
     }
    
}
