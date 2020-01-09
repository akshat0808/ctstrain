package comm.example;

import java.util.Collections;
//import java.util.List;

import java.util.LinkedList;

public class MyList {
	private LinkedList<String> list= new LinkedList<String>();
	
	public void getSortedlist()
	{
		list.add("sang");
		list.add("sing");
		list.add("boston");
		list.add("america");
		System.out.println("before sorting"+list);
		Collections.sort(list);
		System.out.println("after sorting"+list);
	}
	public static void main (String[] args)
	{
		MyList myList=new MyList();
		myList.getSortedlist();
	}
}
