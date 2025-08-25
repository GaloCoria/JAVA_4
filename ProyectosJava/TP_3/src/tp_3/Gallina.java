/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3;

/**
 *
 * @author PC
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.huevosPuestos = huevosPuestos;
        this.edad = edad;
        
}
    public void  ponerHuevo(int huevos){
        huevosPuestos+=huevos;
        
    }
    public void envejecer(int anios){
        edad+=anios;
        
    }
    public void mostrarEstado(){
        System.out.println("Id: " + idGallina );
        System.out.println("edad: " + edad);
        System.out.println("huevosPuestos: " + huevosPuestos);
    }
}
