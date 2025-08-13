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
public class Ejercicio10 {
    static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
        
        int NuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        
        return NuevoStock;
    }
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.print("Ingrese el stock actual: ");
     int stockActual = scanner.nextInt();
     System.out.print("Ingrese la cantidad vendida: ");
     int cantidadVendida = scanner.nextInt();
     
     System.out.print("Ingrese la cantidad recibida: ");
     int cantidadRecibida = scanner.nextInt();
     int NuevoStock=actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
     System.out.print("El nuevo stock del producto es:"+ NuevoStock);
    }
}
