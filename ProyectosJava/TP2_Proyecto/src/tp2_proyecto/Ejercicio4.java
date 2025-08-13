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
public class Ejercicio4 {
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.print("Ingresa el precio del producto:");
         double precio = scanner.nextDouble();
         System.out.print("Ingresa su categoria(A, B o C).:");
         String categoria = scanner.next().toUpperCase();
          double descuento = 0;
         if (categoria.equals("A")) {
            descuento = 0.10; // 10%
        } else if (categoria.equals("B")) {
            descuento = 0.15; // 15%
        } else if (categoria.equals("C")) {
            descuento = 0.20; // 20%
        } else {
            System.out.println("Categoría inválida.");
            System.exit(0); 
     }
         double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);
     }
}
