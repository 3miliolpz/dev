package Estadistica.pkg1;
import java.util.Scanner;
import java.util.Arrays;

public class Matrices {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int i = 0, j = 0, tamanio = 1, prom = 0, moda = 0, med = 0, aux = 0, frecuencia = 0, maxfrecuencia = 0;
        System.out.println("Programa para obtener valores estadisticos");
        System.out.print("Ingrese el numero de valores a ingresar: ");
        tamanio = teclado.nextInt();
        int[] Arreglo = new Int [tamanio];
        int[][] Frecuencias = new Int [tamanio][2];
        System.out.println("Ingrese los datos en numeros enteros: ");
        for (i = 0; i < tamanio; i++) {
            System.out.println((i+1)+". ");
            Arreglo [i] = teclado.nextInt();
        }
        for (i = 0; i < tamanio; i++) { // Para calcular el promedio
            aux = (aux + Arreglo[i]); }
        prom = (aux/tamanio);
        aux = 0;
        System.out.println("El promedio de todos los datos es: "+prom);
        for (i = 0; i < tamanio; i++) { // Para calcular frecuencia
            for (j = 0; j < tamanio; j++) {
                if(Arreglo[i] == Arreglo [j]){
                    frecuencia++;
                }
            }
            if(frecuencia > maxfrecuencia){
                maxfrecuencia = frecuencia;
                moda = Arreglo[i];
            }
        }






    }
}