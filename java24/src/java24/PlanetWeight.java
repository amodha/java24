package java24;

public class PlanetWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("your weight on Earth is ");
	double weight = 205;
	System.out.println(weight);
	
	System.out.print("your weight on Mercury is ");
	double mercury = weight * .378;
	System.out.println(mercury);
	
	System.out.print("your weight on the Moon is ");
	double moon = weight * .166;
	System.out.println(moon);
	
	System.out.print("your weight on Jupiter is ");
	double jupiter = weight * 2.364;
	System.out.println(jupiter);
	
	System.out.println("Jane Campion directed \"The Piano\" in 1993");
	
	String name = "amodha";
	String cap_name = name.toUpperCase();
	
	System.out.println("name is "+cap_name+name.equals("amodha"));
	
	String script = "little brown fox jumps over the lazy dog";
	int test = script.indexOf("jumping over");
	System.out.println(test);
	
	
	
	}

}
