package Genriccollection;
import java.util.ArrayList;

public class arrayforeach {
	public static void main(String[] args) {
	ArrayList<String> str=new ArrayList<String>();
	str.add("one");
	str.add("two");
	str.add("three");
	str.add("Four");
	str.add("Five");
	str.add("six");
	
	//str.stream().forEachOrdered(System.out::println);
	str.stream().forEachOrdered(st->System.out.println(st));  //lambdaexpression
		
	}

}
