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
        boolean inputValido = false;
        
        System.out.print("Ingrese un numero entero positivo: ");
        
        while (!inputValido) {
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                inputValido = true;
            } else {
                System.out.println("Debes ingresar un numero entero");
                System.out.print("Intenta de nuevo: ");
                scanner.next(); 
            }
        }
        
        
        // Validar que el numero sea positivo
        if (numero < 1) {
            System.out.println(" El numero debe ser positivo (mayor o igual a 1)");
            scanner.close();
            return;
        }
         if (numero > 1000000) {
            System.out.println("  Numero muy grande, puede ser lento");
            System.out.print("Deseas continuar? (s/n): ");
            String respuesta = scanner.next();
            if (!"s".equals(respuesta.toLowerCase())) {
                System.out.println("Programa terminado.");
                scanner.close();
                return;
            }
        }
        System.out.println();
        System.out.println("Procesando...");
        // Determinar si es primo
        boolean esPrimo = true;
        int divisor = 0;
        
        for (int i = 3; i <=Math.sqrt(numero); i += 2) {  // Solo odd numbers
            if (numero % i == 0) {
                esPrimo = false;
                divisor = i;
                System.out.println("Divisible por " + divisor + ", no es primo");
                break;
            }
        }
        
        
        
        // Caso especial: 1 no es primo
        if (numero == 1) {
            System.out.println("El numero 1 NO ES PRIMO");
            System.out.println("E1 solo tiene 1 divisor (no cumple definicion)");
            System.out.println();
            System.out.println(" NO ES PRIMO");
            System.out.println("Numero: " + numero);
            scanner.close();
            return;
        }
        else {
            
            if (numero == 2 || numero == 3) {
            System.out.println("Bien " + numero + " es uno de los primeros numeros primos");
            System.out.println();
            System.out.println(" ES PRIMO");
            System.out.println("Numero: " + numero);
            scanner.close();
            return;
        }
            //  Validación 8: Validar que no sea par (excepto 2)
             if (numero % 2 == 0) {
            System.out.println("correcto" + numero + " es NUMERO PAR");
            System.out.println(" Todos los pares (excepto 2) NO SON PRIMOS");
            System.out.println();
            System.out.println(" NO ES PRIMO");
            System.out.println("Numero: " + numero);
            System.out.println("Divisible por: 2");
            scanner.close();
            return;
        }
             if (numero > 50000 && esPrimo) {
            System.out.println(" Proceso lento por numero grande");
        }
        
         System.out.println();
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        
        
        // Mostrar resultado
        if (esPrimo) {
            System.out.println("El numero " + numero + " ES PRIMO");
        } else {
            System.out.println("El numero " + numero + " NO ES PRIMO");
        }
         System.out.print("Quieres verificar otro numero? (s/n): ");
        String reiniciar = scanner.next();
        
        if ("s".equals(reiniciar.toLowerCase())) {
            System.out.println("\n¡Reiniciando...");
        } else {
            System.out.println("¡Gracias por usar el verificador!");
        }
        
        
        scanner.close();
    }
    }
}


