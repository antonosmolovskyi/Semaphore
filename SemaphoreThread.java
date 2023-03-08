package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreThread implements Runnable{

	Semaphore semaphore;
	int i;
	
	@Override
	public void run() {
		System.out.println("Thread  " + i + ", is wait for semaphore");
		try {
			semaphore.acquire();
			System.out.println("Thread " + i + ", acquired for semaphore");
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Thread " + i + ", released the semaphore");
			semaphore.release();
		}
	}

	public SemaphoreThread(Semaphore semaphore, int i) {
		super();
		this.semaphore = semaphore;
		this.i = i;
	}

}
