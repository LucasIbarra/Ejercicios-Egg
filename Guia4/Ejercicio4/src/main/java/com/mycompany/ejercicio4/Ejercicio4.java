/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author Lucas
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int [][] matriz= new int [4][4];
        int [][] matrizTrans= new int [4][4];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int)(Math.random()*5+1);
            }
        }
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("\t"+matriz[i][j]);
            }
        }
        
       
        for (int j = 0; j < matriz.length; j++) {
            
            for (int i = 0; i < matriz.length; i++) {
                matrizTrans[j][i]=matriz[i][j];
            }
        }
        
        System.out.print("\n--------------------------------------------");
    
    for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("\t"+matrizTrans[i][j]);
            }
        }
    
    }
}
