package Genriccollection;
import java.util.LinkedList;
import java.util.Iterator;
public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Mahaprab");
		list.add("Anudip foundation");
		list.add("fullstackdeveloper");
		//Likedlist is best for manipulating data
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
