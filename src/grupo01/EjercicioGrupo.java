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
import java.util.Scanner;

public class EjercicioGrupo {

    // ==========================================
    // EJERCICIO 01: ADIVINAR CREDENCIALES
    // ==========================================
    public static void ejercicio01(Scanner sc) {
        final String clave = "1234Pozole";
        int intentos = 0;
        
        System.out.println("\n============================");
        System.out.println("ADIVINAR CREDENCIALES");
        System.out.println("============================");
        
        while (true) {
            intentos = intentos + 1;
            System.out.println("\nNOTE: Intentos ilimitados. INTENTO NUM: " + intentos);
            System.out.print("INTRODUZCA CONTRASEÑA: ");
            String contrasena = sc.next();
            
            if (contrasena.equals(clave)) {
                System.out.println("======================================");
                System.out.println("CONTRASEÑA CORRECTA. ¡BIENVENIDO!");
                System.out.println("Lograste ingresar en " + intentos + " intentos.");
                System.out.println("======================================");
                return; 
            } 
            System.out.println("CONTRASEÑA INCORRECTA. Vuelva a intentar.");
        }
    }

    // ==========================================
    // EJERCICIO 02: CONTADOR, SUMA Y PROMEDIO
    // ==========================================
    public static void ejercicio02(Scanner sc) {
        int numero;          
        int cantidadNumeros = 0; 
        int sumaTotal = 0;       
        double promedio = 0;     

        System.out.println("\n=== CONTADOR DE NUMEROS ===");
        System.out.println("Ingresa numeros positivos. Para terminar, ingresa un número negativo.\n");
        
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();

        while (numero >= 0) {
            cantidadNumeros = cantidadNumeros + 1;
            sumaTotal = sumaTotal + numero;       
            
            System.out.print("Ingresa otro numero: ");
            numero = sc.nextInt(); 
        }
        
        if (cantidadNumeros > 0) {
            promedio = (double) sumaTotal / cantidadNumeros;
        }
          
        System.out.println("\n---------------------------------");
        System.out.println("¡Proceso terminado por numero negativo!");
        System.out.println("Cantidad de numeros positivos ingresados: " + cantidadNumeros);
        System.out.println("La suma total de los numeros es: " + sumaTotal);
        System.out.println("El promedio es: " + promedio);
        System.out.println("---------------------------------");
    }

    // ==========================================
    // EJERCICIO 03: REGISTRO CONTINUO DE NOTAS
    // ==========================================
    public static void ejercicio03(Scanner sc) {
 
    
        double nota;
        
        System.out.println("\n=== VALIDACION DE NOTA UNICA ===");
        System.out.print("Ingresa una nota entre 0 y 10: ");
        nota = sc.nextDouble();
        
        // El bucle se repite MIENTRAS la nota sea inválida (menor que 0 O mayor que 10)
        while (nota < 0 || nota > 10) {
            System.out.println("-> ¡Error! " + nota + " no es una nota valida.");
            System.out.print("Por favor, intenta de nuevo. Ingresa una nota entre 0 y 10: ");
            nota = sc.nextDouble();
        }
        
        // Al salir del bucle, garantizamos que la nota es correcta
        System.out.println("\n------------------------------------------------");
        System.out.println("-> ¡Nota " + nota + " registrada con exito!");
        System.out.println("------------------------------------------------");
    }
    // ==========================================
    // EJERCICIO 04: CAJERO AUTOMÁTICO
    // ==========================================
    public static void ejercicio04(Scanner sc) {
        String claveCorrecta = "1234Isaac";
        boolean accesoConcedido = false; 
        
        System.out.println("\n=== CAJERO AUTOMATICO BANCARIO ===");
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Intento [ " + i + " de 3 ] - Ingrese su clave: ");
            String claveIngresada = sc.next();
              
            if (claveIngresada.equals(claveCorrecta)) {
                accesoConcedido = true; 
                break; 
            } else {
                if (i < 3) {
                    System.out.println("Clave incorrecta. Intente nuevamente.\n");
                }
            }
        }
        
        System.out.println("\n------------------------------------------------");
        if (accesoConcedido) {
             System.out.println("¡CLAVE CORRECTA! Bienvenido a su cuenta bancaria.");
        } else {
            System.out.println("¡ACCESO BLOQUEADO! Superó los 3 intentos permitidos.");
        }
        System.out.println("------------------------------------------------");
    }

    // ==========================================
    // EJERCICIO 05: PARES E IMPARES
    // ==========================================
    public static void ejercicio05(Scanner sc) {
        int numero;
        int pares = 0;
        int impares = 0;
        
        System.out.println("\n====================================================================================");
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
            System.out.print("Ingrese otro numero (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("\nCantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
    }

    // ==========================================
    // EJERCICIO 06: VENTAS DIARIAS
    // ==========================================
    public static void ejercicio06(Scanner sc) {
        double venta;
        double total = 0;
        int cantidad = 0;
        
        System.out.println("=============================================================");
        System.out.println("Algoritmo que permita ingresar ventas diarias de una tienda");
        System.out.println("==============================================================");
        
        System.out.print("Ingrese una venta (0 para terminar): ");
        venta = sc.nextDouble();
        
        while (venta != 0) {
            total = total + venta;
            cantidad++;

            System.out.print("Ingrese otra venta (0 para terminar): ");
            venta = sc.nextDouble();
        }    
        System.out.println("\nTotal vendido: " + total);
        System.out.println("Cantidad de ventas registradas: " + cantidad);
    }

    // ==========================================
    // EJERCICIO 07: TABLA DE MULTIPLICAR
    // ==========================================
    public static void ejercicio07(Scanner sc) {
        int numero;
        System.out.println("\n========================================================================================================");
        System.out.println("Algoritmo que solicite un numero entero positivo y genere su tabla de multiplicar desde el 1 hasta el 20.");
        System.out.println("======================================================================================================");
        
        System.out.print("Ingrese un numero entero positivo: ");
        numero = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // ==========================================
    // EJERCICIO 08: DETENER POR NEGATIVO
    // ==========================================
    public static void ejercicio08(Scanner sc) {
        int numero;
        System.out.println("\n================================================================");
        System.out.println("Algoritmo que solicite numeros hasta que se ingrese uno negativo");
        System.out.println("=================================================================");
        //Ingresar un numero
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        //While True
        while (numero >= 0) {
            System.out.print("Ingrese otro numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Se ingreso un numero negativo. Fin del ejercicio.");
    }

    // ==========================================
    // EJERCICIO 09: CALCULAR FACTORIAL
    // ==========================================
    public static void ejercicio09(Scanner sc) {
        int numero;
        long factorial = 1;
        System.out.println("\n=== CALCULAR FACTORIAL ===");
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    // ==========================================
    // EJERCICIO 10: CLASIFICAR 15 NÚMEROS
    // ==========================================
    public static void ejercicio10(Scanner sc) {
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
        int numero;
        System.out.println("\n=== CLASIFICADOR DE 15 NÚMEROS ===");
        System.out.println("Ingrese los numeros: ");
        
        for (int i = 1; i <= 15; i++) {
            System.out.print("Numero " + i + ": ");
            numero = sc.nextInt();
            if (numero > 0) {
                contPositivos++;
            } else if (numero < 0) {
                contNegativos++;
            } else {
                contCeros++;
            }
        }
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + contPositivos);
        System.out.println("Negativos: " + contNegativos);
        System.out.println("Ceros: " + contCeros);
    }

    // ==========================================
    // EJERCICIO 11: PROMEDIO DE 20 ESTUDIANTES
    // ==========================================
    public static void ejercicio11(Scanner sc) {
        final int CANT_ESTUDIANTES = 20;
        double sumaCalificaciones = 0;
        double calificacion, promedio;
        System.out.println("\n=== PROMEDIO DE 20 ESTUDIANTES ===");
        System.out.println("Ingrese las calificaciones de los estudiantes: ");
        
        for (int i = 1; i <= CANT_ESTUDIANTES; i++) {
            System.out.print("Calificacion del estudiante " + i + ": ");
            calificacion = sc.nextDouble();
            sumaCalificaciones += calificacion;
        }
        promedio = sumaCalificaciones / CANT_ESTUDIANTES;
        System.out.printf("El promedio general del curso es: %.2f\n", promedio);
    }

    // ==========================================
    // EJERCICIO 12: CALCULAR MAYORES AL PROMEDIO
    // ==========================================
    public static void ejercicio12(Scanner sc) {
        final int CANTIDAD = 15; 
        double suma = 0, promedio;
        int contEncima = 0; 
        double[] calificaciones = new double[CANTIDAD];
        
        System.out.println("\n=== CALIFICACIONES MAYORES AL PROMEDIO ===");
        System.out.println("Ingrese " + CANTIDAD + " calificaciones:");
        
        for (int i = 0; i < CANTIDAD; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
            suma += calificaciones[i];
        }
        
        promedio = suma / CANTIDAD;
        
        for (int i = 0; i < CANTIDAD; i++) {
            if (calificaciones[i] > promedio) {
                contEncima++;
            }
        }
        System.out.printf("\nEl promedio es: %.2f\n", promedio);
        System.out.println("Cantidad de calificaciones mayores al promedio: " + contEncima);
    }

    // ==========================================
    // EJERCICIO 13: BUSCADOR DE MAYOR Y MENOR
    // ==========================================
    public static void ejercicio13(Scanner sc) {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("=== Buscador de Mayor y Menor ===");
        System.out.println("Ingrese números enteros y te diré cuál es el mayor y el menor");
        
        int numero;
        int mayor, menor;
        
        System.out.print("Ingrese el primer número: ");
        numero = sc.nextInt();
        mayor = numero;
        menor = numero;
        
        int numIngresos = 0;
        while (numIngresos < 1) {
            try {
                System.out.print("¿Cuántos números adicionales desea ingresar? (1-100): ");
                numIngresos = sc.nextInt();
                if (numIngresos < 1 || numIngresos > 100) {
                    System.out.println("El número debe estar entre 1 y 100.");
                    numIngresos = 0;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un número entero válido.");
                sc.nextLine(); 
            }
        }
        
        for (int i = 2; i <= numIngresos + 1; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Ingresaste un numero negativo");
            }
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("\n==============================");
        System.out.println("El número MAYOR es: " + mayor);
        System.out.println("El número MENOR es: " + menor);
        int diferencia = mayor - menor;
        System.out.println("Diferencia: " + diferencia);
        System.out.println("\nGracias por usar el programa. Fin del ejercicio.");
    }

    // ==========================================
    // EJERCICIO 14: SUMA DE PARES (HASTA 200)
    // ==========================================
    public static void ejercicio14(Scanner sc) {
        int suma = 0;
        int inicio, fin;
        System.out.println("\n=== SUMA DE PARES ENTRE LÍMITES ===");
        System.out.print("Ingrese el numero de inicio: ");
        inicio = sc.nextInt();
        
        if (inicio < 1) {
            System.out.println("Inicio menor a 1, se cambiará automáticamente a 1.");
            inicio = 1;
        }
        
        System.out.print("Ingrese el numero de fin: ");
        fin = sc.nextInt();
        if (fin > 200) {
            System.out.println("Fin mayor a 200, se finalizará en 200.");
            fin = 200;
        }
        
        // Ajustamos i para que empiece en el primer par válido desde 'inicio'
        int comienzo = (inicio % 2 == 0) ? inicio : inicio + 1;
        if (comienzo < 2) comienzo = 2;

        for (int i = comienzo; i <= fin; i += 2) {
            suma += i;
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("La suma de todos los numeros pares en el rango es: " + suma);
        System.out.println("-----------------------------------------------------------");
    }

    // ==========================================
    // EJERCICIO 15: VERIFICADOR DE NÚMEROS PRIMOS
    // ==========================================
    public static void ejercicio15(Scanner sc) {
        int numero = 0;
        boolean inputValido = false;
        System.out.println("\n=== VERIFICADOR DE NÚMEROS PRIMOS ===");
        
        while (!inputValido) {
            System.out.print("Ingrese un numero entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                inputValido = true;
            } else {
                System.out.println("Debes ingresar un numero entero.");
                sc.next(); 
            }
        }
        
        if (numero < 1) {
            System.out.println("El numero debe ser positivo (mayor o igual a 1)");
            return;
        }
        
        if (numero > 1000000) {
            System.out.println("Numero muy grande, puede ser lento.");
            System.out.print("¿Deseas continuar? (s/n): ");
            String respuesta = sc.next();
            if (!"s".equals(respuesta.toLowerCase())) {
                System.out.println("Programa terminado.");
                return;
            }
        }
        
        System.out.println("\nProcesando...");
        
        if (numero == 1) {
            System.out.println("El numero 1 NO ES PRIMO (Solo tiene 1 divisor).");
            return;
        }
        
        if (numero == 2 || numero == 3) {
            System.out.println("Bien, " + numero + " es uno de los primeros numeros primos.");
            System.out.println("ES PRIMO");
            return;
        }
        
        if (numero % 2 == 0) {
            System.out.println(numero + " es NUMERO PAR. Todos los pares (excepto 2) NO SON PRIMOS.");
            System.out.println("NO ES PRIMO. Divisible por: 2");
            return;
        }
        
        boolean esPrimo = true;
        for (int i = 3; i <= Math.sqrt(numero); i += 2) { 
            if (numero % i == 0) {
                esPrimo = false;
                System.out.println("Divisible por " + i + ", no es primo.");
                break;
            }
        }
        
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        if (esPrimo) {
            System.out.println("El numero " + numero + " ES PRIMO");
        } else {
            System.out.println("El numero " + numero + " NO ES PRIMO");
        }
    }

    // ==========================================
    // MÉTODO PRINCIPAL: EL MENÚ DE OPCIONES
    // ==========================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=========================================");
            System.out.println("         MENU PRINCIPAL DE OPCIONES      ");
            System.out.println("=========================================");
            System.out.println("1. Adivinar Credenciales (Ilimitado)");
            System.out.println("2. Contador, Suma y Promedio");
            System.out.println("3. Registro Continuo de Notas");
            System.out.println("4. Cajero Automático (3 Intentos)");
            System.out.println("5. Números Pares e Impares");
            System.out.println("6. Ventas Diarias de Tienda");
            System.out.println("7. Tabla de Multiplicar (1 al 20)");
            System.out.println("8. Solicitar números hasta un Negativo");
            System.out.println("9. Calcular Factorial de un Número");
            System.out.println("10. Clasificar 15 Números (Pos, Neg, Ceros)");
            System.out.println("11. Promedio General de 20 Estudiantes");
            System.out.println("12. Calificaciones Mayores al Promedio (15 alumnos)");
            System.out.println("13. Buscador de Mayor y Menor");
            System.out.println("14. Suma de Números Pares (Límites)");
            System.out.println("15. Verificador de Números Primos");
            System.out.println("16. SALIR DEL PROGRAMA");
            System.out.print("Elija una opción (1-16): ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio01(sc); break;
                case 2: ejercicio02(sc); break;
                case 3: ejercicio03(sc); break;
                case 4: ejercicio04(sc); break;
                case 5: ejercicio05(sc); break;
                case 6: ejercicio06(sc); break;
                case 7: ejercicio07(sc); break;
                case 8: ejercicio08(sc); break;
                case 9: ejercicio09(sc); break;
                case 10: ejercicio10(sc); break;
                case 11: ejercicio11(sc); break;
                case 12: ejercicio12(sc); break;
                case 13: ejercicio13(sc); break;
                case 14: ejercicio14(sc); break;
                case 15: ejercicio15(sc); break;
                case 16:
                    System.out.println("\n¡Gracias por usar el sistema! Hasta pronto.");
                    break;
                default:
                    System.out.println("\n[ERROR] Opción no valida. Intente de nuevo.");
            }

            if (opcion != 16) {
                System.out.println("\nRegresando al menu principal...");
            }

        } while (opcion != 16);

        sc.close(); 
    }
}