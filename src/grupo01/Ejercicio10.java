/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo01;

/**
 *
 * @author kerly
 */
public class Ejercicio10 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        Scaner sc =new Scaner(System.in);//para leer datos
        //contador para cada tipo de numero
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
        int numero;
        System.out.println("ingrese los numeros: ");
        //repetir 15 veses
        for(int i =1; i<= 15 ;i++){
        System.out.println("numero "+ i +":");
        numero = sc . nextInt();
        //clasificar el numero ingresado
        if(numero>0){
            contPositivos++;
        }else if (numero< 0){
            contNegativos++;
        }else{
            contCeros++;
        }
    }
        
    }
    
}
