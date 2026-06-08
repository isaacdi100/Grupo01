package grupo01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexa
 */
import java.util.Scanner;
public class Ejercicio13 {

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +("=").repeat(40));
    
        //Ingresar solo numeros enteros 
        int numero;
        int mayor, menor;
        
        // Solicitar el primer número para inicializar mayor y menor
        System.out.print("Ingrese el número 1: ");
        numero = scanner.nextInt();
        mayor = numero;
        menor = numero;
        
        // Ciclo para los 9 números restantes
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = scanner.nextInt();
            if(numero<0){
                System.out.println("Ingresaste un numero negativo");
            }
            
            // Determinar si es el mayor
            if (numero > mayor) {
                mayor = numero;
            }
            
            // Determinar si es el menor
            if (numero < menor) {
                menor = numero;
            }
        }
        
        // Mostrar resultados
        System.out.println("\nEl número MAYOR es: " + mayor);
        System.out.println("El número MENOR es: " + menor);
        
        System.out.println("\n Gracias por usar el programa");
        System.out.println("Fin del programa");
        scanner.close();
    }
}
}
