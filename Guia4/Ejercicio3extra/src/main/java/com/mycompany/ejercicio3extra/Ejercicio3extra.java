/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio3extra;

import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 *
 * @author Lucas
 */
public class Ejercicio3extra {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int [] vector= new int [5];
        
        
        cargar(vector);
        mostrar(vector);
        
    }
    
    public static void cargar(int[] m) {
        for (int i = 0; i < m.length; i++) {
            
            m[i] = (int)(Math.random()*4+1);
            
        }
    }
    
    public static void mostrar(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("\t[" + m[i]+"]");
        }
    }
}
