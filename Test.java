import java.util.function.*;
class Test
/*
{
public static int squareIt(int n)
	{
	return n*n;
	}
public static void main(String...args)
	{
	System.out.println("Square root of 4 is: "+ squareIt(4));
	System.out.println("Square root of 5 is: "+ squareIt(5));

	}
}
*/
/*
// Using Java 8 special word (Function) 
{
public static void main(String...args)
	{
	Function<Integer, Integer> f=i->i*i;
	System.out.println("The Square root of 40 is:"+f.apply(40));
	System.out.println("The Square root of 50 is:"+f.apply(50));
	}
}
*/
/*
{
public static void main(String...args)
	{
	Predicate<Integer> p=i->i%2==0;
	System.out.println("is 4 even :"+p.test(4));
	System.out.println("is 5 even :"+p.test(5));
	}
}
*/
{
public String m1(String s)
	{
	return s.length;
	}

public static void main(String...args)
	{
	System.out.println("Length of String: "+m1("Hello"));
	}
} 