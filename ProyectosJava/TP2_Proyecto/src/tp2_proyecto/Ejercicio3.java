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
public class Ejercicio3 {
     public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);
           System.out.print("Ingresa su edad:");
           int edad = scanner.nextInt();
           
           if (edad<12){
               System.out.print("Eres un ninio");
              
           }
           else if (edad>=12 && edad<17){
               System.out.print("Eres un adolescente");
           } 
           else if (edad>=18 && edad<59){
               System.out.print("Eres un adulto");
           }
           else {
               System.out.print("Eres un adulto mayor");
           }
     }
}
