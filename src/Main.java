
import java.util.Scanner;
/*- Calcular los n�meros primeros que haya entre el 1 y el 100.000.
- Pedir el n�mero de hilos que se usar�n al usuario.
- Se repartir� la carga del c�lculo entre el n�mero de hilos que indique el usuario. 

- Opcional: Mostrar el tiempo utilizado en calcular todos los primos. Ej: "Se ha tardado 10s con 5 hilos".
- Opcional: Mostrar el total de primos encontrados.*/

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner teclado = new Scanner(System.in);
		Hilos hilo;
		System.out.println("Introduce el num de hilos: ");

		int numHilos = teclado.nextInt();

		for (int x = 0; x < numHilos; x++) {

			// Creaci�n de hilo
			hilo = new Hilos();
			hilo.start();

		}

	}

}
