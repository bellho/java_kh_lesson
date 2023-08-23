package socket;

public class ClientMain {

	public static void main(String[] args) {
		Client c = new Client();
		c.testClient("127.0.0.1", 1234);
	}

}
