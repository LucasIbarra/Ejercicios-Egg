/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
 * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
 * equals() de Java.
 *
 * @author Lucas
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String frase;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("\nIngrese una palabra o frase:");
        frase = leer.next();
        
        
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.print("\nCorrecto");
        } else {
            System.out.print("\nIncorrecto");
        }
    }

}
