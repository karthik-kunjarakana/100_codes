package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MergeWithoutDuplicates {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {4,5,6,7,8};
	ArrayList<Integer>merged =new ArrayList<Integer>();
	merged.addAll(mergeWithoutDup(arr1, arr2));
	System.out.println(merged);
}
static Set<Integer>mergeWithoutDup(int arr1[],int arr2[]){
	Set<Integer> set = new HashSet<Integer>();
	for (int i : arr1) {
		set.add(i);
	}
	for (int i : arr2) {
		if(!set.contains(i)) 
			set.add(i);
	}
	return set;
	}
		
	
}

