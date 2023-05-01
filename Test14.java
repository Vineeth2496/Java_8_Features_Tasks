import java.util.function.*;
import java.util.*;
class Employee
{
	int eno;
	String name;
	Employee(int eno, String name)
	{
	this.eno=eno;
	this.name=name;
	}

}
class Test14
{
public static void main(String...args)
	{
	ArrayList<Employee> l=new ArrayList<Employee>();
	BiFunction<Integer, String, Employee> f=(eno, name)-> new Employee(eno, name);	
	
	l.add(f.apply(101, "Katherine"));
	l.add(f.apply(102, "Margott Robiee"));
	l.add(f.apply(103, "Gal Gadot"));
	l.add(f.apply(104, "Angelina jolie"));

	for(Employee e : l)
		{
		System.out.println("Actress Number: "+e.eno);
		System.out.println("Actress Name: "+e.name);
		System.out.println();
		}
	} 
}