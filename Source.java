import java.util.Observable;

public class Source extends Observable {
	private int value;

	public void create() {
		value = (int) (Math.random() * (250 -0 + 1)) + 0;
		System.out.print(value);
		setChanged();
		notifyObservers();
	}

	public int getValue() {
		
		return value;
		
	}
}
