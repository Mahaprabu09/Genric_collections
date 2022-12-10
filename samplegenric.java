package Genriccollection;
import java.util.ArrayList;
import java.util.Iterator;

public class samplegenric {
	void m(ArrayList<String> al)
	{
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			String s=(String)obj;
			System.out.println(s);
		}
	}

}
