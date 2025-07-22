/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repositoriogeorgesalfaro;

/**
 *
 * @author ESCINF
 */
/*
public class RepositorioGeorgesAlfaro {

    /**
     * @param args the command line arguments
  
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¡Hola, mundo!");
    }
}
*/ 

// Primer ejercicio de Java de Semana 1_1

/* 
public class RepositorioGeorgesAlfaro{
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int suma = a + b;

        System.out.println(a + " + " + b + " = " + suma);
        System.out.printf("%d + %d = %d%n", a, b, suma);
    }

}

 */ 
//Ejercicio 3 Georges

import java.util.Scanner;

public class RepositorioGeorgesAlfaro{
    
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("¡Hola, " + nombre + "!");
        System.out.printf("¡Hola, %s!%n", nombre);
        //----------------------------------------------------------------------
        
        System.out.print("Ingrese su edad: "); 
        int edad = entrada.nextInt();
        System.out.printf("Su edad es de %d años %n", edad); 
        
        //----------------------------------------------------------------------
        
        System.out.print("Ingrese su peso (en kilos): "); 
        double kilos = entrada.nextDouble();
        double libras = kilos / 0.46; 
        System.out.printf("Su peso es de %4.2f kilos (%4.2f libras)%n",
                kilos, libras);
    }
}