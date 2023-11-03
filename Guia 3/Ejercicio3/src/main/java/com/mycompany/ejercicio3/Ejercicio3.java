/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en
 * Java.
 *
 * @author Lucas
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        int conta = 0;

        System.out.print("\nIngrese una palabra:");
        palabra = leer.next();
        for (int i = 0; i < palabra.length(); i++) {
            conta++;
        }
        if (conta == 8) {
            System.out.print("\nCorrecto");
        } else {
            System.out.print("\nIncorrecto");
        }

        
    }
}
