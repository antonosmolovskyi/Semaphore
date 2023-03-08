package semaphore;

import java.util.Arrays;
import java.util.List;

public class Echo implements Runnable {

	Message message;
	List<String> phrases = Arrays.asList("Darova", "How u doing today", "I love you bro");

	public Echo(Message message) {
		super();
		this.message = message;
		Thread thread = new Thread(this, "Echo");
		thread.start();
	}

	@Override
	public void run() {
		while(true) {
			message.reply();
		}

	}

}
