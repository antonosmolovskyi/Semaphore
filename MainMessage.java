package semaphore;

public class MainMessage {

	public static void main(String[] args) {
		Message message = new Message("hi");
		new Echo(message);
		new Player(message);

	}

}
