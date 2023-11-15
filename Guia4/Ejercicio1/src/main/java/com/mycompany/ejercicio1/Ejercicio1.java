/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 *
 * @author Lucas
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int [] numeros = new int [100];
        
        for (int i = 0; i < 100; i++) {
            numeros [i]= i;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" ["+ numeros[i] + "]");
        }
        
       
        
    }
}
