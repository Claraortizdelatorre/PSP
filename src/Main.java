
import java.util.Scanner;
/*- Calcular los números primeros que haya entre el 1 y el 100.000.
- Pedir el número de hilos que se usarán al usuario.
- Se repartirá la carga del cálculo entre el número de hilos que indique el usuario. 

- Opcional: Mostrar el tiempo utilizado en calcular todos los primos. Ej: "Se ha tardado 10s con 5 hilos".
- Opcional: Mostrar el total de primos encontrados.*/

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner teclado = new Scanner(System.in);
		Hilos hilo;
		System.out.println("Introduce el num de hilos: ");

		int numHilos = teclado.nextInt();

		for (int x = 0; x < numHilos; x++) {

			// Creación de hilo
			hilo = new Hilos();
			hilo.start();

		}

	}

}
