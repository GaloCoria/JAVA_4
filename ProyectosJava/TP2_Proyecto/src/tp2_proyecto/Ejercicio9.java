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
public class Ejercicio9 {
    static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio;
        if (zona.equals("Nacional")) {
            costoEnvio=peso*5;
        }
        else {
            costoEnvio=peso*10;
        }
        
        return costoEnvio;
    }
    static void calcularTotalCompra(double precioProducto, double costoEnvio){
        double total = precioProducto + costoEnvio;
        System.out.println("El total de la compra es: $" + total);
    }
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.print("Ingrese el peso del producto: ");
     double peso = scanner.nextDouble();
     System.out.print("Ingrese el precio del producto: ");
     double precioProducto = scanner.nextDouble();
     scanner.nextLine(); 
     System.out.print("Ingrese la zona del envio(Nacional o Internacional): ");
     String zona = scanner.nextLine();
     double costoEnvio = calcularCostoEnvio(peso,zona);
     calcularTotalCompra(precioProducto,costoEnvio);
    }
}
