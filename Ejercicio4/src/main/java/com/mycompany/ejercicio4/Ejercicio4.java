/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 *
 * @author Lucas
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("\nIngrese una cantidad de grados centigrados: ");
        double  centigrados= leer.nextDouble();
        
        System.out.println("La cantidad de grados centgrados equivale a " + (32 + (9* centigrados /5)) + " grados Fahrenheit");
    }
}
