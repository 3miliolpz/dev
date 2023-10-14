package evaluacion.pkg1;
import java.util.Scanner;
/**
 * Programacion
 * @author Emilio Alejandro Lopez Zapata
 * 13/10/23
 */
public class Evaluacion1 {
    /**
     * Programa que gestiona el acomodo de productos en 5 contenedores de diferentes tamaños ubicados en un almacen de 10 X 10 metros
     * se tienen 5 contenedores en total, 1 de 2 metros, 2 de 3 metros, 1 de 4 metros y el ultimo de 5 metros
     * el usuario ingresa la posicion y la horientacion de cada contenedor y en pantalla se mostrara dicho almacen con los valores
     * correspondientes a cada contenedor, una vez colocado todos los contenedores en el almacen se mostrara un menu
     */
    public static void main(String[] args) {
        int Almacen [][] = new int [10][10];
        int posiciones [][] = new int [5][3];
        int contenedores [][] = new int [5][];
        contenedores [0] = new int [2]; // Contenedor 1
        contenedores [1] = new int [3]; // Contenedor 2
        contenedores [2] = new int [3]; // Contenedor 3
        contenedores [3] = new int [4]; // Contenedor 4
        contenedores [4] = new int [5]; // Contenedor 5 
        // Se decalararon los arreglos bidimensionales
        int opc = 0, i = 0, j = 0;
        Scanner teclado;
        teclado = new Scanner (System.in);
        for(i = 0; i < 5; i++){
                System.out.println("Contenedor "+ (i+1));
                System.out.println("Ingrese la posicion en X del contenedor: (del 0 al 9)");
                posiciones[i][0] = teclado.nextInt();
                System.out.println("Ingrese la posicion en Y del contenedor: (del 0 al 9)");
                posiciones[i][1] = teclado.nextInt();
                System.out.println("Ingrese la horientacion del contenedor: (0 Horizontal, 1 Vertical)");
                posiciones[i][2] = teclado.nextInt();
        }
        do {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("Menu Almacen");
            System.out.println("1. Agregar producto");
            System.out.println("2. Retirar producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = teclado.nextInt();
            switch (opc){
                case 1: System.out.println("Usted ha ingresado la opcion 1. Agreagar producto");
                
                    break;
                case 2: System.out.println("Usted ha ingresado la opcion 2. Retirar producto");
                
                    break;
                case 3: System.out.println("Usted ha ingresado la opcion 3. Salir");
                    break;
                default: 
                    break;
            }
        } while (opc != 3);
        System.out.println("Saliendo del programa ...");
    }
}
