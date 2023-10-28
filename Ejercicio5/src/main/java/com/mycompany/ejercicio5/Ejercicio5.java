/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 *
 * @author Lucas
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("\nIngrese un numero: ");
        int num= leer.nextInt();
        
        System.out.println("El doble de su numero es: "+  (2*num)+ "\nEl triple es: "+ (3*num)+ "\nLa raiz cuadrada es: " + (Math.sqrt(num)));
    }
}
