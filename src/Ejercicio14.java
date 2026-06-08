/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexa
 */
import java.util.Scanner;
public class Ejercicio14 {
    public class SumaPares1a200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int inicio;
        
        System.out.println("Ingrese el numero de inicio(1-200):");
        inicio = scanner.nextInt();
        
        // Ciclo desde 2 hasta 200, solo numeros pares (paso = 2)
        for (int i = 2; i <= 200; i += 2) {
            suma += i;
        }
        
        System.out.println("La suma de todos los numeros pares entre 1 y 200 es: " + suma);
    }
}
    
}
