package semaphore;

import java.util.concurrent.Semaphore;

public class Message { // need to add permits to echo!
	String message;
	Semaphore playerSemaphore = new Semaphore(1); // 1 permit
	Semaphore echoSemaphore = new Semaphore(0); // 0 permits
	public Message(String message) {
		super();
		this.message = message;
	}
	
	public void say(String message) {
		this.message = message;
		try {
			playerSemaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		echoSemaphore.release();
		System.out.println("Sent" + this.message);
	}
	public void reply() {
		try {
			echoSemaphore.acquire();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Answered " + this.message);
		playerSemaphore.release();
		
		
	}
}
