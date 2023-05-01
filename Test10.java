import java.util.function.*;
class Movie
{
	String name;
	Movie(String name)
	{
	this.name=name;
	}
}
class Test10
{
public static void main(String...args)
	{
	Consumer<Movie> c1=m->System.out.println(m.name+" ready to release");	
	Consumer<Movie> c2=m->System.out.println(m.name+" movie is block buster hit");	
	Consumer<Movie> c3=m->System.out.println(m.name+" ready to update in database");	
	Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
	
	Movie m=new Movie("Billa");
	//c1.accept(m);
	//c2.accept(m);
	//c3.accept(m);
	
	cc.accept(m);

	}
}