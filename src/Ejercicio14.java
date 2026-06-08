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
        
        System.out.println("Ingrese el numero de inicio :");
        inicio = scanner.nextInt();
        // Si innicio es menor a 1, cambia automaticamente a 1
        if (inicio<1){
            System.out.println("Inicio menor a 1 se cambiara a 1 ");
            inicio = 1 ;
        }
        int fin ;
        System.out.println("Ingrese el numero de fin :");
        fin = scanner.nextInt();
        if(fin>200){
            System.out.println("Fin menor a 200 se finalazara en 200");
            fin=200;
        
        // Ciclo desde 2 hasta 200, solo numeros pares (paso = 2)
        for (int i = 2; i <= 200; i += 2) {
            suma += i;
        }
        
        System.out.println("La suma de todos los numeros pares entre 1 y 200 es: " + suma);
        scanner.close();
        }
        
}
    
}
}
