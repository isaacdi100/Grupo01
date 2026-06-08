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
public class Ejercicio12 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in); // Para leer los datos
         final int CANTIDAD = 15; // Cantidad de calificaciones a ingresar
         double suma = 0, promedio, calificacion;
         int contEncima = 0; // Cuenta cuántas son mayores al promedio
          // Primero guardamos las calificaciones
         double[] calificaciones = new double[CANTIDAD];
         System.out.println("Ingrese " + CANTIDAD + " calificaciones:");
            // Leer y acumular las calificaciones
           for (int i = 0; i < CANTIDAD; i++) {
               System.out.print("Calificación " + (i+1) + ": ");
               calificaciones[i] = sc.nextDouble();
                suma += calificaciones[i];
            }
           
           }
          
    }
    

