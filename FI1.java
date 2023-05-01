/*
@FunctionalInterface
interface FI1
{
	public void m1();
	public default void m2()
		{
		System.out.println("Hai Darling");
		}
	public static void m3()
		{
		System.out.println("Glad to meet you");
		}
}
*/
@FunctionalInterface
interface A
{
	public void m1();
}

@FunctionalInterface
interface B extends A
{
	public void m1();
}
