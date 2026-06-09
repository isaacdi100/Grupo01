/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo01;
import java.util.Scanner;
/**
 *
 * @author COMPU
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //DECLARACION DE VARIABLES
        int numero;
        int pares = 0;
        int impares = 0;
        
        //INICIO DEL PROGRAMA
        System.out.println("====================================================================================");
        System.out.println("PROGRAMA PARA INGRESAR NUMEROS ENTEROS E INDICAR CUALES SON NUMEROS PARES E IMPARES");
        System.out.println("====================================================================================");
        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = sc.nextInt();
         
        while (numero != 0) {

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            System.out.print("Ingrese otro numero (0 para terminar): ");//Ingresar otro numero
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
        
        //Fin del programa
    }
}

    

    
    
    

