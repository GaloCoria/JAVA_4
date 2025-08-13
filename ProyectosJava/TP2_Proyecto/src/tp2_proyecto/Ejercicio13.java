/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_proyecto;

/**
 *
 * @author PC
 */
public class Ejercicio13 {
    static void imprimirPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPrecios(precios, indice + 1);
        }
    }

    public static void main(String[] args) {

        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        
        precios[2] = 129.99;

        
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);
    }
}
