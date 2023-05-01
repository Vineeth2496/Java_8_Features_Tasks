import java.util.*;
import java.util.stream.*;
/*
class Mycomparator implements Comparator<Integer>
{
public int compare(Integer I1, Integer I2)
	{
//		return I1<I2?-1:I1>I2?1:0;
		if(I1<I2)
		{
		return -1;
		}
		else if(I1>I2)
		{
		return +1;
		}
		else
		{
		return 0;
		}

	}
}
*/
class Test3
{
public static void main(String...args)
	{
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(20);
	l.add(12);
	l.add(9);
	l.add(15);
	l.add(30);
	l.add(0);
	l.add(5);
	System.out.println(l);
	Comparator<Integer> c=(I1, I2)->I1<I2?-1:I1>I2?1:0;
	Collections.sort(l, c);
//	System.out.println(l);
	l.stream().forEach(System.out::println);
	List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l2);
	}
}