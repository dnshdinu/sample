package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collectionfrq {
public static void main(String[] args) {
	
	
	List<Integer> li=new ArrayList<Integer>();
	
	li.add(10);
	li.add(20);
	li.add(10);
	li.add(30);
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(20);
	
	Set<Integer> s=new HashSet<>(li);
	
	for (Integer temp : s) {
		System.out.println(temp +":"+Collections.frequency(li, temp));
	}
	
}
	
	
}
