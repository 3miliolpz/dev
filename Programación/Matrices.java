package Matrices.pkg1;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int i = 0, j = 0, k = 0, m = 0, n = 0, o = 0, p = 0;
        System.out.println("Programa para realizar el producto de matrices");
        System.out.print("Ingrese el numero de filas de la matriz A: ");
        m = teclado.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz A: ");
        n = teclado.nextInt();
        System.out.print("Ingrese el numero de filas de la matriz B: ");
        o = teclado.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz B: ");
        p = teclado.nextInt();
        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[o][p];
        int[][] resultado = new int[m][p];
        System.out.println("Ingrese los valores de la matriz A: ");
        for (i = 0; i < matrizA.length; i++) {
            System.out.print("Fila "+(i+1));
            for (j = 0; j < matrizA[0].length; j++) {
                matriz[i][j] = scanner.nextInt()
            } System.out.print(""); }
        System.out.println("Ingrese los valores de la matriz B:");
        for (i = 0; i < matrizB.length; i++) {
            System.out.print("Fila "+(i+1));
            for (j = 0; j < matrizB[0].length; j++) {
                matriz[i][j] = scanner.nextInt()
            } System.out.print(""); }
        if (n == o){
        for (i = 0; i < m; i++) {
            for (j = 0; j < p; j++) {
                for (k = 0; k < p; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                } } }
        System.out.println("Resultado del producto de matrices:");
        for (i = 0; i < m; i++) {
        System.out.print("| ");
            for (j = 0; j < p; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println(" |");
        }
        } else {
         System.out.println("No se puede realizar el producto de matrcies");   
        }
    }
}