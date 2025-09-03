/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tppoo;

/**
 *
 * @author PC
 */
public class TPPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(101, "Juan Pérez", "Gerente", 80000);
        Empleado e2 = new Empleado(102, "Ana López", "Analista", 60000);
        Empleado e3 = new Empleado("Carlos Díaz", "Programador");
        Empleado e4 = new Empleado("Lucía Gómez", "Diseñadora");
        
        e1.actualizarSalario(10.0);
        e2.actualizarSalario(5000); 
        e3.actualizarSalario(15.0); 
        e4.actualizarSalario(3000);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
