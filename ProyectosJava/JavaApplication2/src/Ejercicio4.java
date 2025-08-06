
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Num1;
        int Num2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
     System.out.print("Ingresa un numero:");
     Num1=input.nextInt();
     
     System.out.print("Ingresa otro numero:");
     Num2=input.nextInt();
     
     suma=Num1+Num2;
     resta=Num1-Num2;
     multiplicacion=Num1*Num2;
     division=Num1/Num2;
     System.out.print("La suma de ambos numeros es: "+ suma+" La resta de ambos numeros es: "+  resta+" La multiplicacion de ambos numeros es: "+  multiplicacion+" La division de ambos numeros es: "+  division);
    }
}
