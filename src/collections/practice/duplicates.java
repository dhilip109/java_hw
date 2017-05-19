package collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(5);
		al.add(10);
		al.add(5);
		Set <Integer> st = new HashSet<Integer>(al);
		for(Integer e:st){
			System.out.println(e);
			
		}
		ArrayList <Integer> a = new ArrayList();
		a.add(7);
		a.add(5);
		a.add(6);
		a.add(9);
		a.add(8);
		a.add(4);
/*		
 al= new ArrayList<Integer>(st);
 al.r

System.out.println("a1 values=="+al);
//System.out.println("al2 values=="+al2);
*/
	}

}
