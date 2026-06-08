/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo01;

import java.util.Scanner;

/**
 *
 * @author kerly
 */
public class Ejercicio09 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            long factorial = 1;
            System.out.println("ingrese un numero: ");
            numero = sc.nextInt();
            //agregamos el bucle
            for (int i =1; i<= numero; i++){
                factorial *=i;
            }
            System.out.println("el factorial de "+ numero + "es: " + factorial);
        }
        }//cerramos el main
    }//cerramos la clase
