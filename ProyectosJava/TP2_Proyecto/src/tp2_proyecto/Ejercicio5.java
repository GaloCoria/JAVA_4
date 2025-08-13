/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_proyecto;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio5 {
     public static void main(String[] args) {
          
          Scanner scanner=new Scanner(System.in);
          int numero, suma = 0;
             System.out.print("Ingrese un número (0 para terminar): ");
             numero = scanner.nextInt();
       
           
        while (numero != 0) {
            if (numero % 2 == 0) { 
                suma += numero;
            }
            
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
        }
          System.out.println("La suma de los números pares es: " + suma);
     }
}
