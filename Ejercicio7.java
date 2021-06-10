/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Arreglo para almacenar numeros aleatorios
         */
        int[] numeroAleatorio = new int[15];

        /**
         * Declaracion de contadores 
         */
        int contadorPares=0, contadorImpares=0, contadorCeros=0, resto=0;

        /**
         * Ciclo para almacenar los numeros aleatorios dentro del arreglo de enteros
         * Y condicionales, para saber si es par, impar o cero
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            numeroAleatorio[i]= (int)(Math.random()*36);
            resto = numeroAleatorio[i]%2;
            if(resto==0){
                contadorPares += 1;
            }
            else if(resto!=0){
                contadorImpares += 1;
            }
            else if(numeroAleatorio[i]==0){
                contadorCeros += 1;
            }   
        }
        /**
         * Imprimimos en pantalla el numero total de pares, impares y ceros
         */
        System.out.println("El total de numeros aleatorios pares es: "+contadorPares);
        System.out.println("El total de numeros aleatorios impares es: "+contadorImpares);
        System.out.println("El total de numeros aleatorios iguales a cero es: "+contadorCeros);
    }
}
