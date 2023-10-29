/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 *
 * @author Lucas
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        do {
            System.out.print("\nIngrese su nombre: ");
        String nombre= leer.next();
        
        System.out.print("\nIngrese su edad: ");
        int edad= leer.nextInt();
        
        
        String retorno= esMayor(edad);
        System.out.print("\nSu nombre es: "+ nombre + " y es " + retorno);
        
            System.out.print("\nQuiere agregar mas personas? Si/No?");
            respuesta=leer.next();
            
        } while (!respuesta.equalsIgnoreCase("No"));
        
    }
    public static String esMayor(int edad){
        String condicion;
        if (edad>17) {
            condicion="mayor de edad";
            return  condicion;
            
        }else{
            condicion="menor de edad";
            return condicion;
        }
        
    }
}
