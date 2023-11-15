/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por
 * ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 *
 * @author Lucas
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("\nIngrese un numero: ");
        num= leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.print("*");
            for (int j = 0; j < num; j++) {
                System.out.print("\n*");
            }
                
               
            
        }
    }
}
