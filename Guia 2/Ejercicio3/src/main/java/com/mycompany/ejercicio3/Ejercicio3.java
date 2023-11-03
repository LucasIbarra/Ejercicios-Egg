/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 *
 * @author Lucas
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        double Euros;
        int monedaAconvertir;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("\nIntroduce la cantidad de euros que desea convertir: ");
        Euros = leer.nextDouble();

        System.out.print("\nIndique el tipo de modeda a convertir: \n1_Dolares \n2_Yenes \n3_Libras\n");
        monedaAconvertir = leer.nextInt();
        
        conversion(Euros, monedaAconvertir);
        
    }

    public static void conversion(double cantidad,int tipo) {
        
        switch (tipo) {
            case 1:
                System.out.print("\nSon "+ (cantidad*1.28611 ) + " de Dolares");
                break;
            case 2:
                System.out.print("\nSon "+ (cantidad* 129.852) + " de Yenes");
                break;
            case 3:
                System.out.print("\nSon "+ (cantidad* 0.86) + " de libras");
                break;
            default:
                System.out.print("\nNo ingreso una opcion correcta!");
        }
       
    }
}
