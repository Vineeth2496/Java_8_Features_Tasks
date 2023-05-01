import java.util.function.*;
class Test6
{
public static void main(String[]args)
	{
	// To find square of Integer
	Function<Integer, Integer> f=i->i*i;
	System.out.println("Square of 4 is: "+f.apply(4));

	// To find Length of String
	Function<String, Integer> s=i->i.length();
	System.out.println("Length of String name Katherine: "+s.apply("Katherine"));
	System.out.println("Length of String name Angelina Jolie: "+s.apply("Angelina Jolie"));

	// Convert String to UpperCase
	Function<String, String> u=i->i.toUpperCase();
	System.out.println("Upper case of String name Katherine: "+u.apply("Katherine"));

	
	}
}