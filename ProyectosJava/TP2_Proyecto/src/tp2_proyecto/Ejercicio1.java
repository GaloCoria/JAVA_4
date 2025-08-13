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
public class Ejercicio1 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un año:");
    int año = scanner.nextInt();
    
    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
        System.out.println("El " + año + " es bisiesto");
    } 
    else {
     System.out.println("El " + año + " no es bisiesto");
    }
}
    }
