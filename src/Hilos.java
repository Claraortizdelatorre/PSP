import java.util.concurrent.TimeUnit;

public class Hilos extends Thread {

	int contadorTotal = 0;

	/**
	 * Método para buscar números primos
	 */
	public void buscarPrimos() {
		int contador = 0;
		for (int x = 2; x < 1000; x++) {
			boolean isPrime = true;

			for (int j = 2; j < x; j++) {

				if ((x) % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(x + "\n");
				contador++;
			}
		}

		contadorTotal = contador;
	}

	@Override
	public void run() {

		long time = System.currentTimeMillis();
		buscarPrimos();
		System.out.println("El hilo " + getName() + " ha tardado en calcular " + (System.currentTimeMillis() - time)
				+ " milisegundos");
		System.out.println("El número total de primos es: " + contadorTotal);

		try {
			TimeUnit.MILLISECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
