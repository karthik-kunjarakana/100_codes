package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCommons {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {4,5,6,7,8};
	System.out.println(commonElements(arr1,arr2));
}
static List<Integer>commonElements(int arr1[],int[] arr2){
	List<Integer>common = new ArrayList<>();
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(arr1[i]==arr2[j])
				common.add(arr1[i]);
		}
	}
		return common;
		
	
}
}
