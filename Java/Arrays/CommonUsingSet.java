package Array;

import java.util.HashSet;
import java.util.Set;

public class CommonUsingSet {
static Set<Integer> findCommon(int arr1[], int arr2[]){
	Set<Integer> set = new HashSet<>();
	Set<Integer> common = new HashSet<>();
	for (int i : arr2) {
		common.add(i);
	}
	for (int i : arr1) {
		if(common.contains(i)) 
			set.add(i);
	}
	return set;
	}
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {4,5,6,7,8};
	System.out.println(findCommon(arr1, arr2)); 
}
}

