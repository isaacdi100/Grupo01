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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        double nota;
        
        System.out.println("=== REGISTRO CONTINUO DE NOTAS ===");
        System.out.println("Ingresa notas entre 0 y 10.");
        System.out.println("Para terminar todo el proceso, ingresa un número negativo.\n");
          // Pedimos la primera nota
        System.out.print("Ingresa una nota: ");
        nota = teclado.nextDouble();
        
        //  El ciclo funciona MIENTRAS la nota sea positiva (mayor o igual a 0)
        while (nota >= 0) {
        
            if (nota <= 10) {
                System.out.println("-> ¡Nota " + nota + " registrada con exito");
            } else {
                // Si es positiva pero mayor a 10 (por ejemplo, 12)
                System.out.println("-> ¡Error! " + nota + " no es válida (debe ser máximo 10). No se registró.");
            }
           
            System.out.println(); // Una línea en blanco para ordenar
            System.out.print("Ingresa la siguiente nota (o un negativo para salir): ");
            nota = teclado.nextDouble();
        
        }
        
        // 5. Si puso un negativo, el ciclo "while" se rompe y viene aquí directamente
        System.out.println("\n------------------------------------------------");
        System.out.println("Proceso terminado porque ingresaste un número negativo.");
        System.out.println("------------------------------------------------");
        
        teclado.close();
            
       
    }
}
     