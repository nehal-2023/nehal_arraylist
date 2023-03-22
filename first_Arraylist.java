package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class first_Arraylist {

	public static void main(String[] args) {
		

		//ArrayList is a default class already available on JAva
		//you can pass the parameter to your ArrayList by using <> sign;
		//Lets define an ArrayList of type Integer
		//physical capacity of arraylist is 0,when no value is added. virtual capacity is 
		//default capacity, java set 10(0-9) initial and you can increase it by adding the 
		//constructor value for e.g. see below. here virtual capacity is 0-4
		
		ArrayList<Integer>mypurse = new ArrayList <Integer>(5);
		
		//dynamic in nature;
		//int purse[] = new int[4];- normal array, [0],[1],[2],[3]-- you don't have [4]-outbound error
		
		mypurse.add(10);//this will go and sit on mypurse[0];
		mypurse.add(5);//this will be stored on index 1 - my purse[1];
		
		System.out.println(mypurse);
		System.out.println(mypurse.get(1)); //get my second value stored on index[1]
		System.out.println(mypurse.size()); //get me the size of arraylist
		
		//how to iterate through elements of arraylist
		
		for(int i=0; i<mypurse.size(); i++) {
			System.out.println(mypurse.get(i));
			
		}
		System.out.println("------");
		
		//iterate values through for each loop 
		 for (int i : mypurse) {
			 System.out.println(i);
			 
		 }
		 System.out.println("------");

		 Iterator<Integer>it = mypurse.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("-----");
		 // streams with lambda
		 mypurse.stream().forEach(ele->System.out.println(ele));
				 
		 System.out.println("-----");
		 // list with other collection
		 ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","python"));
		 System.out.println(names);

		 }

}


