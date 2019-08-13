package prob02;

public class Add implements Arithmetic {
	int result;
	
	@Override
	public int calculate(int a, int b) {
		this.result = a + b;
		return this.result;
	}

}
