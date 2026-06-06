/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo01;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //  Creamos las variables que guardarán nuestros datos
        int numero;              
        int cantidadNumeros = 0; 
        int sumaTotal = 0;       
        double promedio = 0;     

        System.out.println("=== CONTADOR DE NÚMEROS ===");
        System.out.println("Ingresa números positivos. Para terminar, ingresa un número negativo.\n");
        
        //  Pedimos el PRIMER número antes de entrar al ciclo
        System.out.print("Ingresa un número: ");
        numero = teclado.nextInt(); // Usamos nextInt() porque son números enteros

        //  El ciclo "while" revisa si el número es positivo (mayor o igual a 0)
        while (numero >= 0) {
            
            cantidadNumeros = cantidadNumeros + 1; // Contamos el número
            sumaTotal = sumaTotal + numero;       // Lo sumamos al total acumulado
            
            // Volvemos a pedir otro número DENTRO del ciclo
            System.out.print("Ingresa otro número: ");
            numero = teclado.nextInt(); 
        }
}
