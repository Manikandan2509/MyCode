import java.util.Arrays;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = {17,18,30,39,67,71,72,80,84,92};

        mergeSort(array);
        System.out.print(Arrays.toString(array));
    }
    static void mergeSort(int[] array){ //Function for MergeSort
        int length = array.length;
        int mid = array.length /2;
        int left[] = new int[mid];          //LeftHalf
        int right[] = new int[length-mid];  //RightHalf
        if(length<2){
            return;                         //Return array if array is of size 1 or 0.
        }
        for (int i = 0; i < mid; i++) {     // copy elements of array to left
            left[i] = array[i];
        }
        for (int i = mid; i < length; i++) { // copy remaining elements of array to right
            right[i-mid] = array[i];
        }
        mergeSort(left);                    //calling recursion
        mergeSort(right);
        conquer(array,left,right);          // merging all the elements
    }

    static void conquer(int[] array,int[] left,int[] right){
        int i=0 ,j=0,k=0;
        while(i<left.length && j<right.length)
        if(left[i]<=right[j]){                 // if element of left is smaller insert left[i]
            array[k++] = left[i++];
        }
        else{
            array[k++]=right[j++];              //else insert right[i]
        }
        while(i<left.length){                   // if left > right insert remaining left elements
            array[k++]=left[i++];
        }
        while(j<right.length){                  // if right > left insert remaining right elements
            array[k++]=right[j++];
        }

    }

}


