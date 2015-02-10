package java24;

public class Commodity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int command = 1;
		int balance = 350;
		int quantity = 42;
		
		//strings in switch statements are allowed in Java 7
		
		switch (command) {
		case 1 :
			quantity += 5;
			balance -= 20;
			break;
		case 2 : //for SELL (as this version of Java doesn't support strings in switch stmts
			quantity -= 5;
			balance += 15;
		
	
		}
		
		System.out.println("Balance: " + balance + "in" + quantity);
	}

}
