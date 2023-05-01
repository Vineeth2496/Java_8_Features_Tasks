interface A
{
//	public void m1();
//	public void add(int a, int b);
	public int squareIt(int n);
}
class Test1
{
public static void main(String...args)
	{
//	A i= () -> System.out.println("Welcome Darling with regards Lambda");
//	i.m1();
//	A i= (a,b) -> System.out.println("Sum of a & b is: "+(a + b));
//	i.add(10,20);
//	i.add(100,200);

	A i=n-> n*n;
	System.out.println(i.squareIt(4));
	System.out.println(i.squareIt(5));
	}
}