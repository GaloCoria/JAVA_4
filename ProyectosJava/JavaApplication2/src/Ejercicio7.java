/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

  
        if (num2 == 0) {
            System.out.println("⚠️ Error: no se puede dividir por cero.");
        } else {
            
            int divisionEntera = num1 / num2;

            
            double divisionDecimal = (double) num1 / num2;

            
            System.out.println("Resultado de la división entera (int): " + divisionEntera);
            System.out.println("Resultado de la división decimal (double): " + divisionDecimal);
    
        
    }
}
}
