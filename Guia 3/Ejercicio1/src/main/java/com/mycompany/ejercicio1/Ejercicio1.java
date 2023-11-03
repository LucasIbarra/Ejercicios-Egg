/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar.
 *
 *
 * @author Lucas
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int num;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp = "";

        do  {
            System.out.print("\nIngrese un numero: ");
            num = leer.nextInt();

            if (num % 2 == 0) {
                System.out.print("\nEl numero ingresado es par");
            } else {
                System.out.print("\nEl numero ingresado es impar");
            }
            
             System.out.print("\nQuiere volver a ingresar u numero? Si/No \n");
            resp = leer.next();
            }while (!resp.equalsIgnoreCase("no"));
           
        

    }
}
