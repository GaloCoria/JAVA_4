/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3;

/**
 *
 * @author PC
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;
    
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        if (combustible <= MAX_COMBUSTIBLE) {
            this.combustible = combustible;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
         }
    
    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado ");
        } else {
            System.out.println("No hay suficiente combustible para despegar ");
        }
    }
    public void avanzar(int distancia) {
        int consumo = distancia / 10; 
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km ");
        }
    }
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Se recargó al máximo. Combustible actual: " + combustible);
        } else {
            combustible += cantidad;
            System.out.println("Se recargó " + cantidad + ". Combustible actual: " + combustible);
        }
    }
     public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible);
    }

}
