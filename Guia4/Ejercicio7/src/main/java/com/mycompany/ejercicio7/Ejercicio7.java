/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 *
 * @author Lucas
 */
public class Ejercicio7 {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int[][] matrizA = new int[3][3];
        cargar(matrizA);
        mostrar(matrizA);
        boolean retorno = sumaFilas(matrizA);
        boolean retorno1 = sumaColumnas(matrizA);
        boolean retorno2 = sumadiagonal(matrizA);
        /*sumadiagonal2(matrizA);*/
        if (retorno == true && retorno1 == true && retorno2 == true) {
            System.out.print("\nEs un cuadrado magico!");
        } else {
            System.out.print("\nNo es un cuadrado magico!");
        }
    }

    //------------------------cargarmatriz----------------------------//
    public static void cargar(int[][] m) {
        int num;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.print("\nIngrese un numero para la matriz:");
                num = leer.nextInt();
                if (num > 0 && num < 10) {
                    m[i][j] = num;
                } else {
                    System.out.print("\ningrese un numero compredido entre 1 y 10");
                }

            }
        }
    }

    //--------------------------Mostrarmatriz-------------------------//
    public static void mostrar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < m.length; j++) {
                System.out.print("\t" + m[i][j]);
            }
        }

    }

    //--------------------------Sumafilas-------------------------//
    public static boolean sumaFilas(int[][] m) {
        int num, num1, num2;
        num = 0;
        num1 = 0;
        num2 = 0;
        boolean sumaF;

        for (int j = 0; j < m.length; j++) {

            num = num + m[0][j];
            num1 = num1 + m[1][j];
            num2 = num2 + m[2][j];
        }
        
        if (num == num1 && num == num2) {
            return sumaF = true;
        } else {
            return sumaF = false;
        }

    }

    //--------------------------Sumacolumnas-----------------------//
    public static boolean sumaColumnas(int[][] m) {
        int num, num1, num2;
        num = 0;
        num1 = 0;
        num2 = 0;
        boolean sumaC;

        for (int i = 0; i < m.length; i++) {

            num = num + m[i][0];
            num1 = num1 + m[i][1];
            num2 = num2 + m[i][2];
        }
        
        if (num == num1 && num == num2) {
            return sumaC = true;
        } else {
            return sumaC = false;
        }
    }

    //-------------------------Sumadiagonal-----------------------//
    public static boolean sumadiagonal(int[][] m) {
        int num, num1, num2;
        num = 0;
        num1 = 0;
        num2 = 0;
        boolean sumaD;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    num = num + m[i][j];
                }
                
            }
            
        }
        num1 = num1 + (m[2][0]) + (m[1][1]) + (m[0][2]);
         
         
        if (num == num1) {
            return sumaD = true;
        } else {
            return sumaD = false;
        }

    }

   
}
