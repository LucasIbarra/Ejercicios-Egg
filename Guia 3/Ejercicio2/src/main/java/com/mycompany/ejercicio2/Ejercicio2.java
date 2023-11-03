/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 *
 *
 * @author Lucas
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String frase;
        do {
             System.out.print("\nIngrese una frase: ");
        frase= leer.next();
            
        } while (!frase.equalsIgnoreCase("Eureka"));
       
        
        System.out.print("\nGracias");
    }
}
