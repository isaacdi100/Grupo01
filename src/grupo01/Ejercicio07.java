/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo01;

import java.util.Scanner;
/**
 *
 * @author COMPU
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Librería Scanner
        Scanner sc = new Scanner(System.in);

        //Declarar variable
        int numero;

        //Inicio del sistema
        System.out.println("========================================================================================================");
        System.out.println("Algoritmo que solicite un numero entero positivo y genere su tabla de multiplicar desde el 1 hasta el 20.");
        System.out.println("======================================================================================================");
        
        //Ingresar un numero positivo
        System.out.print("Ingrese un número entero positivo: ");
        numero = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    //Fin del programa

    }
    
}
