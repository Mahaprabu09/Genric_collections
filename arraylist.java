package Genriccollection;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mahaprabu");
		al.add("Mageswar");
		al.add("albert leo");
		//ARRAYLIST is better for accessing or search operations 
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}			
	}
}
