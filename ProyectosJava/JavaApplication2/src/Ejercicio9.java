
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Ejercicio9 {
    
     public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);



        System.out.print("Ingrese su nombre: ");

        String nombre = scan.nextLine();



        System.out.print("Ingrese su apellido: ");

        String apellido = scan.nextLine();



        
    mostrarNombreCompleto (nombre, apellido);

    }



    public static void mostrarNombreCompleto(String nombre, String apellido) {

        System.out.println("Nombre completo: " + nombre + " " + apellido);

    }

}


