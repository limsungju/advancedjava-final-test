package prob03;

public class Money {

	private int amount;
	
	public Money(int i) {
		this.amount = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Money && this.amount == ((Money) obj).amount;
	}

	public Object add(Money m) {
		Money money = new Money(this.amount + m.amount);
		return money;
	}
	
	public Object minus(Money m) {
		Money money = new Money(this.amount - m.amount);
		return money;
	}
	public Object multiply(Money m) {
		Money money = new Money(this.amount * m.amount);
		return money;
	}
	public Object devide(Money m) {
		Money money = new Money(this.amount / m.amount);
		return money;
	}

}
