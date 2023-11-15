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

        int num1, num2;

        System.out.print("\nIngrese un numero: ");
        num1 = leer.nextInt();

        System.out.print("\nIngrese otro numero: ");
        num2 = leer.nextInt();

        int opcion;
        String seguir = "si";

        while (!"no".equals(seguir)) {

            do {
                System.out.print("\nIngrese que operacion quiere realizar ");
                System.out.print("\n1.Sumar \n2.restar \n3.multiplicar \n4.dividir");
                System.out.print("\n");
                opcion = leer.nextInt();
            } while (opcion < 0 || opcion > 5);

            switch (opcion) {
                case 1:
                    int retorno = sumar(num1, num2);
                    System.out.print("\nLa suma es: " + retorno);
                    break;
                case 2:
                    int retorno1= restar(num1,num2);
                    System.out.print("\nLa resta es: " + retorno1);
                    break;
                case 3:
                    int retorno2= multiplicar(num1,num2);
                    System.out.print("\nLa multiplicacion es: " + retorno2);
                    break;
                case 4:
                    int retorno3= dividir(num1,num2);
                    System.out.print("\nLa division es: " + retorno3);
                    break;
                default:
                    System.out.print("\nNo es una opcion valida!");
                    
            }
            System.out.print("\nQuiere realizar otra operacion? Si/No?");
            seguir = leer.next();
        }

    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }
    
    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }
    
    public static int multiplicar(int num1, int num2) {
        int multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }
    public static int dividir(int num1, int num2) {
        int division;
        division = num1 / num2;
        return division;
    }
}
