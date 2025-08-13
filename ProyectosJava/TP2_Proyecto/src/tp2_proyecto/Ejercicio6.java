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
public class Ejercicio6 {
    
  public static void main(String[] args) {
      int numeroPositivo = 0;
      int numeroNegativo=0;
      int ceros=0;
      Scanner scanner=new Scanner(System.in);
  for (int i = 1; i <= 10; i++) {
    System.out.print("Ingrese el número" + i+ " : ");
    int numero = scanner.nextInt();
    if (numero>0){
       numeroPositivo+=1;
    }
    else if (numero<0){
        numeroNegativo+=1;
    }
    else {
        ceros+=1;
    }
}
  System.out.print("resultados:\n Positivos:"+numeroPositivo + "\n Negativo:"+numeroNegativo + "\n Ceros:"+ceros);
}
}
