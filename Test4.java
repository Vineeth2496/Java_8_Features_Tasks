import java.util.*;
class Employee
{
	String name;
	int eno;
	Employee(String name, int eno)
	{
	this.name=name;
	this.eno=eno;
	}
	public String toString()
	{
	return name+ "::"+eno;
	}
}
class Test4
{
public static void main(String...args)
	{
//	Employee e=new Employee("Katherine", 96);
//	System.out.println(e);	
	ArrayList<Employee> l=new ArrayList<Employee>();
	l.add(new Employee("Katherine", 96));
	l.add(new Employee("Margott", 86));
	l.add(new Employee("Gal Gadot", 91));
	l.add(new Employee("Angelina", 84));
	l.add(new Employee("Stala", 94));
	System.out.println(l);
//	Collections.sort(l, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
	Collections.sort(l, (e1,e2)->e1.name.compareTo(e2.name));
	System.out.println(l);
	}
}