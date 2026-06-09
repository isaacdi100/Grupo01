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

        System.out.println("=== CONTADOR DE NUMEROS ===");
        System.out.println("Ingresa números positivos. Para terminar, ingresa un numero negativo.");
        
        //  Pedimos el PRIMER número antes de entrar al ciclo
        System.out.print("Ingresa un numero: ");
        numero = teclado.nextInt(); 
        
        
        while (numero >= 0) {
            
            cantidadNumeros = cantidadNumeros + 1; // Contamos el número
            sumaTotal = sumaTotal + numero;       // Lo sumamos al total acumulado
            
            // Volvemos a pedir otro número DENTRO del ciclo
            System.out.print("Ingresa otro número: ");
            numero = teclado.nextInt(); 
        }
          if (cantidadNumeros > 0) {
            // Usamos (double) para que Java haga la división con decimales exacta
            promedio = (double) sumaTotal / cantidadNumeros;
        }
          
         //  Mostramos los resultados finales
        System.out.println("\n---------------------------------");
        System.out.println("¡Proceso terminado por numero negativo!");
        System.out.println("Cantidad de numeros positivos ingresados: " + cantidadNumeros);
        System.out.println("La suma total de los numeros es: " + sumaTotal);
        System.out.println("El promedio es: " + promedio);
        System.out.println("---------------------------------");
        teclado.close();
}
}
