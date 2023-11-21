/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 *
 * @author Lucas
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[][] matrizA = new int[3][3];
        int[][] matrizT = new int[3][3];
        boolean asimetrica=true;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("\nIngrese un numero para la matriz:");
                matrizA[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("\t" + matrizA[i][j]);
            }
        }

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                matrizT[j][i] = matrizA[i][j];

            }
        }
        System.out.print("\n");

        for (int i = 0; i < matrizA.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("\t" + matrizT[i][j]);
            }
        }

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                if (matrizT[j][i] == -(matrizA[i][j])) {
                    asimetrica= true;

                } 

            }
        }
        if (asimetrica) {
            System.out.print("\nLa matriz es antisimetrica");
        }else{
            System.out.print("\nLa matriz no es antisimetrica");
        }

    }
}
