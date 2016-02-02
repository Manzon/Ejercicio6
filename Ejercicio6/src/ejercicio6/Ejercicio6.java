/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Celular objeto1 = new Celular("Motorola", 248984);
        System.out.println("Objeto 2: " + objeto1.getMarca() + " - " + objeto1.getSerial());
        
        Reloj objeto2 = new Reloj("Rolex", "Platino");
        System.out.println("Objeto 2: " + objeto2.getMarca() + " - " + objeto2.getMaterial());
        Televisor objeto3 = new Televisor("Sony", 34);
        System.out.println("Objeto 3: " + objeto3.getMarca() + " - " + objeto3.getPulgadas());

    }

}
