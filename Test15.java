import java.util.function.*;
import java.util.*;

class Employee
{
	String name;
	double salary;
	Employee(String name, double salary)
	{
	this.name=name;
	this.salary=salary;
	}
}
class Test15
{
public static void main(String...args)
	{
	ArrayList<Employee> l=new ArrayList<Employee>();
	populate(l);
	BiConsumer<Employee, Double> c=(e, d) -> e.salary=e.salary+d;
	for(Employee e : l)
		{
		c.accept(e, 5000.0);
		}
	for(Employee e : l)
		{
		System.out.println("Employee name: "+ e.name);
		System.out.println("Employee salary: "+ e.salary);
		System.out.println();
		}
	}
public static void populate(ArrayList<Employee> l)
	{
	l.add(new Employee("Banti", 10000));
	l.add(new Employee("Chintu", 20000));
	l.add(new Employee("Vineeth", 40000));
	l.add(new Employee("Vikram", 30000));

	}
}