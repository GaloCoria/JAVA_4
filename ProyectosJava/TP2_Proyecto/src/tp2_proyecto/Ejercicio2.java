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
public class Ejercicio2 {
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.print("Ingresa un numero:");
         int num1 = scanner.nextInt();
         System.out.print("Ingresa otro numero:");
         int num2 = scanner.nextInt();
         System.out.print("Ingresa un numero final:");
         int num3 = scanner.nextInt();
         
         if ((num1>num2)&& (num1>num3)){
             System.out.print("El mayor es:"+ num1);
         }
         else if ((num2>num1)&& (num2>num3)){
             System.out.print("El mayor es:"+ num2);
         }
         else {
             System.out.print("El mayor es:"+ num3);
         }
     }
}
