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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar número al usuario
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();
        
        // Validar que el numero sea positivo
        if (numero < 1) {
            System.out.println("Error: El numero debe ser positivo (mayor o igual a 1)");
            scanner.close();
            return;
        }
        
        // Determinar si es primo
        boolean esPrimo = true;
        
        // Caso especial: 1 no es primo
        if (numero == 1) {
            esPrimo = false;
        } else {
            // Ciclo for desde 2 hasta numero/2 (optimizado)
            for (int i = 2; i <= numero / 2; i++) {
                // Si el numero es divisible por i, no es primo
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // Salir del ciclo inmediatamente
                }
            }
        }
        
        // Mostrar resultado
        if (esPrimo) {
            System.out.println("El numero " + numero + " ES PRIMO");
        } else {
            System.out.println("El numero " + numero + " NO ES PRIMO");
        }
        
        scanner.close();
    }
}

