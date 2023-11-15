/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 *
 * @author Lucas
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int conta1, conta2, conta3;
        conta1 = 0;
        conta2 = 0;
        conta3 = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[20];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 300 + 1);
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 10) {
                conta1++;
            } else if (vector[i] > 9 && vector[i] < 100) {
                conta2++;
            } else {
                conta3++;
            }
            System.out.print("[" + vector[i] + "]");
        }

        
        System.out.print("\nLa cantidad de numeros de un digito son "+ conta1+ "\nLa cantidad de numeros de dos digitos son "+ conta2+"\nla cantidad de numero de 3 digitos son "+conta3);
    }
}
