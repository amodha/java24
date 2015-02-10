package java24;
import java.util.*;

public class SpaceRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String mostFamous = "Rudolph the Red-Nosed Reindeer";
char[] mfl = mostFamous.toCharArray();
for (int dex = 0; dex < mfl.length; dex++) {
	char current = mfl[dex];
	
	if (current != ' ') {
		System.out.print(current);
		
	}else {
		System.out.print(".");
		
		}
		
	}

//Sorting the Array

Arrays.sort(mfl);
for (int i = 0; i < mfl.length; i++)
{
	System.out.print(mfl[i]);
}
	}

}
