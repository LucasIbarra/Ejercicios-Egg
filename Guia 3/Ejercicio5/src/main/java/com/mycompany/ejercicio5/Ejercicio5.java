/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 *
 * @author Lucas
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        int tope, num1, num2;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero tope: ");
        tope= leer.nextInt();
        
        
        
        num2=0;
        int suma=0;
        
        while (num2<tope) {
            
            System.out.print("\nIngrese un numero a sumar: ");
            num1= leer.nextInt();
            suma= suma+num1;
            num2=suma;
            
            
        }

        System.out.print("\nLa sumatoria es: "+ num2);
        
    }
}
