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
public class PrimerDeber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mayor=0,n=0,numero;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        n=entrada.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.print("introduzca numero "+i);
            numero=entrada.nextInt();
            if(numero>mayor){
            mayor=numero;
                    
            }else{
                mayor=mayor;
            }
            
        }
        System.out.println("el numero mayor "+mayor);
        
        
    }
    
}
