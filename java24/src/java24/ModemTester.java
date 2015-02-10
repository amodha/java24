package java24;

public class ModemTester {

	public static void main(String[] args) {
		//creating a cableModem and dslModem objects
		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		
		System.out.println("Trying the cable Modem: ");
		surfBoard.displaySpeed();
		surfBoard.connect();
		
		System.out.println("Trying to connect using the DSL modem");
		gateway.displaySpeed();
		gateway.connect();
	
	}
}
