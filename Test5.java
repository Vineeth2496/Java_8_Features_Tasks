interface I
{
	public void m1();
	public void m2();	
	default void m3()
	{
	System.out.println("Default Method");
	}	
}
class Test1 implements I
{
	public void m1(){}
	public void m2(){}
}
class Test2 implements I
{
	public void m1(){}
	public void m2(){}
}
class Test3 implements I
{
	public void m1(){}
	public void m2(){}
}
class Test4 implements I
{
	public void m1(){}
	public void m2(){}
}
