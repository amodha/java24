package java24;
import java.awt.*;

public class PointTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point object1 = new Point(11,22);
		Point3D object2 = new Point3D(7,6,64);
		
		System.out.println("The 2D point is located at (" + object1.x + ", " + object1.y + ")");
		System.out.println("\t It's being moved to (4,13)");
		
		object1.move(4, 13);
		
		System.out.println("The 2D point is now at" + object1.x + ", " + object1.y);
		
		System.out.println ("its being moved 10 units both x and y axis");
		
		object1.translate(-10, -10);
		
		System.out.println ("the new 2d point is " + object1.x + object1.y);
		
		//now the 3D pointer movement
		
		System.out.println(" The 3D point coordinates are" + object2.x + object2.y + object2.z)	;
		System.out.println(" it\'s being moved by 10");
		object2.translate(-10, -10);
		System.out.println("New coords are " + object2.x + object2.y + object2.z);
		System.out.println("moving to 10,22,71 now");
		object2.move(10, 22,71);
		System.out.println("New Coordinates check == " + object2.x + object2.y + object2.z);
		

	}

}
