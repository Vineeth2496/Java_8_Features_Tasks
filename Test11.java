import java.util.function.*;
import java.util.Date;
class Test11
{
public static void main(String...args)
	{
	Supplier<Date> s=()->new Date();
	System.out.println(s.get());
	}
}