/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Ejercicio8 {
    

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.nextLine(); // El error es que tenia nextInt y no nextLine,nextInt es para numeros y aca es un string
System.out.println("Hola, " + nombre);
}
}

