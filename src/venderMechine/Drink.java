package venderMechine;

public class Drink {
	static int cash=0;
	int price;
	String name;

	public Drink() {
	}

	public Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}
	public  Drink(int cash) {
		this.cash = cash;
	}
	public static int RetCash() {
	return(cash)	;
	}
	public void countMoney() {
		int m = cash-price;
		if(m>=0) {
			System.out.println("DON!");
		}else {
			System.out.println("BEEP!");}
		}
		
	
	
	
	
}
