package Estadistica.pkg1;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Programacion
 * @author Emilio Alejnadro Lopez Zapata
 */
public class Matrices {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int i = 0, j = 0, tamanio = 1, prom = 0, moda = 0, med = 0, aux = 0;
        int frecuencia = 0, maxfrecuencia = 0, total = 0;
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
        for (i = 0; i < tamanio; i++) { // Para calcular moda
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
        System.out.println("la moda de todos los datos es: "+moda);
        for (i = 0; i < tamanio; i++) { // Para calcular la frecuencia
            Frecuencias[i][0] = Arreglo [i];
        }
        for (int dato : Arreglo){
            total += dato
        }
        for (i = 0; i < tamanio; i++) { 
            Frecuencias[i][1] = (double) Arreglo [i]/total;
        }
        Arrays.sort(Arreglo); // Para calcular la mediana
        if(datos.length % 2 == 0){
            int med1 = Arreglo[tamanio / 2 - 1];
            int med2 = Arreglo[tamanio / 2];
            med = (med1 + med2)/2;
        } else {
            med = Arreglo [tamanio / 2]
        }
        System.out.println("La mediana de los datos es: "+med);
        System.out.println("===============");
        System.out.println("Dato Frecuencia");
        for(i = 0; i < tamanio; i++){
            for(j = 0; j < 2; j++){
                System.out.print(Frecuencias[i][j]+"\t ");
            }
            System.out.println("");
        }
        
    }
}
