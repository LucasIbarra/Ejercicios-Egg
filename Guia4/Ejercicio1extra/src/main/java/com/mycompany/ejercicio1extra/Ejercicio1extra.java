/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1extra;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 *
 * @author Lucas
 */
public class Ejercicio1extra {
    
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        
        int n, aux;
        aux=0;
        
        
        System.out.print("\nIngrese el tamanio del vector: ");
        n=leer.nextInt();
        
        
         int [] vector= new int [n];
        cargar(vector);
        mostrar(vector);
         for (int i = 0; i < vector.length ; i++) {
            aux=aux+vector[i];
        }
         
         System.out.print("\nLa suma de los elementos es "+aux);
    }
    
    
    public static void cargar (int [] m){
        for (int i = 0; i < m.length; i++) {
            
                System.out.print("\nIngrese un numero para la matriz:");
                m[i] = leer.nextInt();
            
        }
    }
    
    public static void mostrar(int[]m){
        for (int i = 0; i < m.length; i++) {
            System.out.print("\t"+m[i]);
        }
    }
            
}
