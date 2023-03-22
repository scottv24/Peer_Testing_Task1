package peer.testing;

public class Increment {
	private int value = 1;

	public Increment(int i) {
		value = i;
	}
	
	public int increment() {
		value++;
		return value;
	}
}
