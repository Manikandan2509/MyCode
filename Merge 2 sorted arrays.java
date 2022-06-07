public class Main{

public static void main(String[] args){
	int arr1[] = {2,4,5,6,7,9,10,13};
	int arr2[] = {2,3,4,5,6,7,8,9,11,15};
	int n = arr1.length+arr2.length;
	int arr3[] = new int[n];
	int i=0;
	int j=0;
	int k=0;
	while(i<arr1.length){
	if(arr1[i]<arr2[j]){
	arr3[k] = arr1[i];
	k++;
	i++;
	}
	else{
	arr3[k] = arr2[j];
	j++;
	k++;
	} }
	
	while(i< arr1.length){      // will be executed if length of arr 1> length of arr 2
	arr3[k] = arr1[i];
 	k++;
	i++;
	}
	while(j<arr2.length){        // will be executed if length of arr2 > length of arr1
	arr3[k] = arr2[j];
	j++;
	k++;
	}

	for(int m : arr3){
	System.out.print(m+" ");
}

}

}