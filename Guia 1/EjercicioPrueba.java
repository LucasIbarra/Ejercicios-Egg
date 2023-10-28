
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class NewMain {

    /**Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("\nIngrese un numero: ");
        int n1= leer.nextInt();
        System.out.print("\nIngrese un numero: ");
        int n2= leer.nextInt();
        
        System.out.print("\nla suma es: " + (n1+n2) );
    }
    
}
