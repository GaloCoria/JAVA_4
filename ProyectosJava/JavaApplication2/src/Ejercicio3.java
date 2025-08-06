
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Ejercicio3 {
     public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     String nombre;
     int edad;
     
     System.out.print("Ingresa tu Nombre:");
     nombre=input.nextLine();
     
     System.out.print("Ingresa tu Edad:");
     edad=input.nextInt();
     
     System.out.print("Tu nombre es " + nombre +  " Y tenes "+ edad);
     }
}
