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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Declarar variables
        int numero;
        int pares = 0;
        int impares = 0;
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
    }
    
}
