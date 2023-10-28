/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 *
 * @author Lucas
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("\nIngrese un numero: ");
        int num1 = leer.nextInt();

        System.out.print("\nIngrese otro numero: ");
        int num2 = leer.nextInt();
        int opcion;
        String seguir= "si";
        
        while (!"no".equals(seguir)) {
            
        
        do {
            System.out.print("\nIngrese que operacion quiere realizar ");
        System.out.print("\n1.Sumar \n2.restar \n3.multiplicar \n4.dividir");
            System.out.print("\n");
        opcion = leer.nextInt();
        }while (opcion<0 || opcion>5);
        
        
        switch (opcion) {
            case 1:
                System.out.print("\nLa suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.print("\nLa resta es: " + (num1 - num2));
                break;
                case 3:
                System.out.print("\nLa multiplicacion es: " + (num1 * num2));
                break;
                case 4:
                System.out.print("\nLa division es: " + (num1 / num2));
                break;
            default:
                throw new AssertionError();
        }
            System.out.print("\nQuiere realizar otra operacion? Si/No?");
            seguir = leer.next();
        }
        
    }
}
