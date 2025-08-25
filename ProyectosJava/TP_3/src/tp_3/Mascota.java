/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3;

/**
 *
 * @author PC
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int    edad  ;
    
    
     public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        
}
     public void mostrarInfo() {
        System.out.println("Nombre: " + nombre );
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
     public void sumaranios(int anios){
         edad+=anios;
         System.out.println("Nueva edad: " + edad);
     }
}

