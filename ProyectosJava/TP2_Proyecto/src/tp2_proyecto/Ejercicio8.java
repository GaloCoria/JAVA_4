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
public class Ejercicio8 {
    static void  calcularPrecioFinal(double impuesto, double descuento,double PrecioBase){
        impuesto = impuesto / 100;
        descuento = descuento / 100;
      double PrecioFinal = PrecioBase + (PrecioBase* impuesto) - (PrecioBase* descuento);
       System.out.println("El precio final es: " + PrecioFinal);
    }
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.print("Ingrese el precio base del producto: ");
     double PrecioBase = scanner.nextDouble();
     System.out.print("Ingrese el porcentaje de impuesto: ");
     double impuesto = scanner.nextDouble();
     System.out.print("Ingrese el porcentaje de descuento: ");
     double descuento = scanner.nextDouble();
     calcularPrecioFinal(impuesto,descuento,PrecioBase);
    }
}
