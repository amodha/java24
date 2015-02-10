package java24;

public class Benchmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 long startTime = System.currentTimeMillis();
 long endTime = startTime + 60000;
 long index = 0 ;
 
 while (true) {
	 	double x = Math.sqrt(index);
	 	long now = System.currentTimeMillis();
	 	if (now > endTime) {
	 		break;
	 	}
	 	index++;
	 	
 }
 System.out.println(index + " loops in one minute");
	}

}
