/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 *
 * @author Lucas
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("\nIntroduce un numero: ");
        numero = leer.nextInt();

        boolean retorno = esPrimo(numero);

        System.out.print("\nEl numero es primo " + retorno);
    }

    public static boolean esPrimo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                cont++;

            }

        }
        if (cont == 2) {
            return true;
        }
        return false;

    }

}
