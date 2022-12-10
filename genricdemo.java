package Genriccollection;
import java.util.ArrayList;
public class genricdemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("maha");
		al.add("prabu");
		al.add("mayil");
		samplegenric sg=new samplegenric();
		sg.m(al);
	}

}
