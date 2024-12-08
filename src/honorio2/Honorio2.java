/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honorio2;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Honorio2 {

    public static void rotarMatriz(int[][] matriz){
        int n = matriz.length;
        for(int i=0;i<n/2;i++) {
            for(int j=i; j<n-i-1;j++) {
                int temp=matriz[i][j];
                matriz[i][j]=matriz[n-j-1][i];
                matriz[n-j-1][i]=matriz[n-i-1][n-j-1];
                matriz[n-i-1][n-j-1]=matriz[j][n-i-1];
                matriz[j][n-i-1]=temp;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la dimensión de la matriz cuadrada (d): ");
        int d = leer.nextInt();
        int[][] matriz = new int[d][d];
        System.out.println("Ingresa los elementos de la matriz:");
        for(int i = 0; i < d; i++){
            for(int j = 0; j < d; j++) {
                System.out.print("Elemento en la posición ("+i+","+j+"): ");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("\nMatriz original:");
        mostrarMatriz(matriz);

        rotarMatriz(matriz);

        System.out.println("\nMatriz rotada 90° en el sentido de las agujas del reloj:");
        mostrarMatriz(matriz);

        leer.close();
    }
}
