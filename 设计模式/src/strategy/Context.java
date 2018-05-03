package strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void sort(int[] array) {
		strategy.sort(array);
	}
}
