/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Marianna
 */
public class Practicando1 {
    //MULTIPLICACION
    public static int[][] multiply(int[][] matriz1, int[][] matriz2) {
    int[][] matriz3 = new int[matriz1.length][matriz2[0].length];
    // se comprueba si las matrices se pueden multiplicar
    if (matriz1[0].length == matriz2.length) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    // aquí se multiplica la matriz
                    matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
    }
    /**
     * si no se cumple la condición se retorna una matriz vacía
     */
    return matriz3;
    }
    
    //SUMA
    public static int[][] sum(int[][] matriz1, int[][] matriz2) {
    int[][] matriz3 = new int[matriz1.length][matriz2[0].length];
    // se comprueba si las matrices se pueden multiplicar
    if (matriz1[0].length == matriz2.length) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                // aquí se multiplica la matriz
                matriz3[i][j] += matriz1[i][j] + matriz2[i][j];
                
            }
        }
    }
    return matriz3;
    }
    
    //RESTA
    public static int[][] resta(int[][] matriz1, int[][] matriz2) {
    int[][] matriz3 = new int[matriz1.length][matriz2[0].length];
    // se comprueba si las matrices se pueden multiplicar
    if (matriz1[0].length == matriz2.length) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++){
                matriz3[i][j] += matriz1[i][j] - matriz2[i][j];
            }
        }
    }
    return matriz3;
    }
    
    
    //MOSTRARLAS
    public static void mostrar(int[][] matriz){
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                System.out.print("| " + matriz[i][j] + "\t");
                if (j==matriz[0].length - 1) System.out.print("|");
            }
            System.out.println("");
        }
    }
        
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz1[][] = {{1,3,5}, {7,9,11}, {13,15,17}};
        int matriz2[][] = {{2,4,6}, {8,10,12}, {14,16,18}};

        //Usamos doble bucle para recorrer la matriz,
        // donde i se usa para ir fila por fila,
        // mientras j se usa para ir columna por columna.
        // Cantidad de filas: matrix.length
        // Cantidad de columnas: matriz[i].length
        boolean runAgain;
        System.out.println("Estas son tus matrices: ");
        System.out.println("");
        System.out.println("MATRIZ 1");
        mostrar(matriz1);
        System.out.println("");
        System.out.println("MATRIZ 2");
        mostrar(matriz2);
        System.out.println("");
        System.out.println("");
        
        do {
            System.out.println("¿Que operación quieres realizar?");
            System.out.println("1- Suma \n"
                        + "2- Resta \n"
                        + "3- Multiplicación \n");
            String response = sc.nextLine();    //en la variable response guardamos la respuesta del usuario
            System.out.println("");
            System.out.println("");
            
            switch(response){
                case "1":
                    int[][] matriz4 = sum(matriz1, matriz2);
                    mostrar(matriz4);
                    break;
                case "2":
                    int[][] matriz5 = resta(matriz1, matriz2);
                    mostrar(matriz5);
                    break;
                case "3":
                    int[][] matriz3 = multiply(matriz1, matriz2);
                    mostrar(matriz3);
                    break;
                default:
                    System.out.println("Ingresaste una opcion inválida");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("¿Quieres hacer otra operación? (s/n)");
            String continuar = sc.nextLine();
            runAgain = continuar.equalsIgnoreCase("s");     //para ignorar si es mayuscula o minuscula
            
        }while(runAgain);
        System.out.println("Gracias por usar mi calculadora de matrices :) ");
        
        
        
        // TODO code application logic here
    }
    
}
