package semaphore;

import java.util.Arrays;
import java.util.List;

public class Player implements Runnable {
	Message message;

	List<String> phrases = Arrays.asList("Darova", "How u doing today", "I love you bro");

	public Player(Message message) {
		this.message = message;
		Thread thread = new Thread(this, "Player");
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			Double random = Math.random() * phrases.size();
			message.say(phrases.get(random.intValue()));
		}

	}
}
