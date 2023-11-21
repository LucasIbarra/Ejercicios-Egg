/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2extra;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 *
 * @author Lucas
 */
public class Ejercicio2extra {
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public static void main(String[] args) {
       int [] vect1= new int[4];
       int [] vect2= new int [4];
       
       
       cargar(vect1);
       cargar(vect2);
       mostrar(vect1);
       mostrar(vect2);
       boolean retorno= comparar(vect1,vect2);
        System.out.print("\nSon vectores iguales "+ retorno);
    }
    
    //--------------------Cargarvectoresaleatoriamente-----------------
    /*public static void cargar(int[] m) {
        for (int i = 0; i < m.length; i++) {
           
            m[i] = (int) (Math.random() * 2 + 1);
            
        }
    }*/
    
    //--------------------pruebamanual-------------------------
    public static void cargar(int[] m) {
        for (int i = 0; i < m.length; i++) {
            
            System.out.print("\nIngrese un numero: ");
            m[i] = leer.nextInt();
            
        }
    }
    
    public static void mostrar(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("\t[" + m[i]+"]");
        }
        System.out.print("\n");
    }
    
    
    public static boolean comparar (int [] m, int [] n){
    
        for (int i = 0; i < m.length; i++) {
            if (m[i]!=n[i]) {
                return false;
            }
        }
        return true;
        
    }
}
