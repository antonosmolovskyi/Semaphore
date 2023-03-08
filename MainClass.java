package semaphore;

import java.util.concurrent.Semaphore;

public class MainClass {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		for (int i = 1; i < 7; i++) {
			Thread thread = new Thread(new SemaphoreThread(semaphore, i));
			thread.start();
		}
	}

}
