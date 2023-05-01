import java.util.function.*;
class Student
{
	String name;
	int marks;
	Student(String name, int marks)
	{
	this.name=name;
	this.marks=marks;
	}
}

/*
>=80 ==>A[Distinction]
>=60 ==>B[First Class]
>=50 ==>C[Second Class]
>=35 ==>D[Third Class]
==>E[Failed]

Student --> find grade ---> return grade
*/
class Test7
{
public static void main(String...args)
	{
	Function<Student, String> f=s->{
		int marks=s.marks;
		String grade="";
		if(marks>=80) grade="A[Distinction]";
		else if(marks>=60) grade="B[First Class]";
		else if(marks>=50) grade="C[Second Class]";
		else if(marks>=35) grade="D[Third Class]";
		else grade="E[Failed]";
		return grade;
		};

	Predicate<Student> p=s->s.marks>=60;	

	Consumer<Student> c=s1->
		{
		System.out.println("Student name: "+s1.name);
		System.out.println("Student marks: "+s1.marks);
		System.out.println("Student Grade: "+f.apply(s1));
		System.out.println();
		};

	Student[] s={	new Student("Vineeth", 85),
			new Student("Vikram", 75),
			new Student("Rakesh", 65),
			new Student("Venkat", 50),
			new Student("Naresh", 40),
			new Student("Darling", 30)
			};

	for(Student s1 : s)
		{
		if(p.test(s1))
			{
			c.accept(s1);		
			}
		}

/*	for(Student s2 : s)
		{
		if(p.test(s2))
			{
			System.out.println("Student name: "+s2.name);
			System.out.println("Student marks: "+s2.marks);
			System.out.println("Student Grade: "+f.apply(s2));
			System.out.println();
			}
		}
*/
	}
}