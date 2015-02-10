package java24;
import java.util.*; 


public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//get the current date and time
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);
		
		//display greetings
		if (hour <12) {
			System.out.println("Good Morning. \n");
		} else if (hour <17) {
			System.out.println("Good Afternoon \n");
		}else
			{System.out.println("Good Evening");
			
			}
	System.out.println(hour+" "+minute+ " "+month+ " "+day+ " "+year);
	
	//begin time message by showing the mins
	
	System.out.print("it's");
	if (minute != 0) {
			System.out.println(" "+minute+" ");
			System.out.print( (minute != 1) ? "minutes" : "minute" );
			System.out.print(" past");
	}
	//display the hour
	System.out.print( " ");
	System.out.print((hour > 12) ? (hour - 12) : hour);
	System.out.print(" o'clock on ");
	
	//display the name of the month
	
	switch (month) {
		case 1 :
			System.out.println("January");
			break;
		
		case 2 :
			System.out.println("Feb");
			break;
		case 7 :
			System.out.println ("August");
			break;
			
			default :
				System.out.println ("no month in the list");
			
			

			
	
	
	
	
	
	
	}
}
}
	
	
	
	
		
	

