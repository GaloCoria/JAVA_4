/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tppoo;

/**
 *
 * @author PC
 */
public class Empleado {
    int id;
    String nombre;
    String puesto;
    double salario;
    private static int totalEmpleados = 0;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
    this.id = id;              
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = salario;
    totalEmpleados++;          
}
    public Empleado(String nombre, String puesto) {
    this.id = ++totalEmpleados;  
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = 30000;       
}
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
    
     public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }
    @Override
      public String toString() {
        return "Empleado [ID: " + id + 
               ", Nombre: " + nombre + 
               ", Puesto: " + puesto + 
               ", Salario: $" + salario + "]";
    }
      
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
