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
public class cuartoejer {
    public static void main(String[] args) {
        
        
       seguirnoseguir();
     
       
       
        
    }
    public static void seguirnoseguir() {
        int preciohorasnormal,sueldo;
        
       Scanner entrada=new Scanner(System.in);
       System.out.println("ingrese el numero de horas trabajadas");
       preciohorasnormal=entrada.nextInt();
       if(preciohorasnormal>=35){
           sueldo=preciohorasnormal*22;
       }else{
           sueldo=preciohorasnormal*15;
       
       }
       System.out.println("horas trabajadas: "+preciohorasnormal +"\t"+"sueldo :"+sueldo);
       
       System.out.println("deseacalcular otro salario");
       System.out.print("1. si \n2. no");
       int numero = entrada.nextInt();
       switch(numero){
           case 1:
               seguirnoseguir();
               break;
           case 2:
               System.out.print("pues muy bien, puerco");
               break;
           default:
               System.out.print("");
               break;
       }
    
    }
    
}
