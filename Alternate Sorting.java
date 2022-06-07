import java.util.*;
public class Main{
	public static void main(String[] args){
	int arr[] = {2,6,8,3,4,1,9,5};
	Arrays.sort(arr);
	int i =0;              // Pointer to traverse from start
	int j = arr.length -1; // Pointer to traverse from end
	while(i<j)
	{
	System.out.print(arr[i++]+" " );
	System.out.print(arr[j--]+" ");
	}
	if(arr.length % 2 != 0){            // if length of an array is odd then print middle element 
	System.out.print(arr[i]+" ");
}
}
}