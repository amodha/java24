package java24;

public class Nines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int dex=1 ; dex <= 200 ; dex++ ) 
		{	
			int multiple = 9* dex;
			System.out.print( (multiple < 600) ? "TESTING" + multiple/2 : multiple);
		}
	}

}
