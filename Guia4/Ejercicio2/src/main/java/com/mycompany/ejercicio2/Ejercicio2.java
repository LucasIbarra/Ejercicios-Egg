/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 *
 * @author Lucas
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;

        System.out.print("\nIngrese el tama;o del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
        
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }

        System.out.print("\nIngrese un numero que usted cree que esta contenido en el vector:");
        int buscar = leer.nextInt();

        for (int i = 0; i < 10; i++) {
            if (vector[i] == buscar) {
                contador ++;
                
            } 
        }
        if (contador>0) {
            System.out.print("\nEl numero se encuentra " + contador + " veces y es el numero " + buscar);
        }else{
        System.out.print("\nNo se encuentra en el vector");
    }
    }
}
