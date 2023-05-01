import java.util.function.*;
class Test9
{
public static void main(String...args)
	{
	Consumer<String> c=s->System.out.println(s);
	c.accept("Darling");
	c.accept("Katherine");
	}
}