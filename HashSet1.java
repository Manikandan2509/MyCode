import java.util.HashSet;
// Program to check whether array contains duplicate element
public class HashSet1 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,657,2,2,4,4,9};
        HashSet<Integer> hm = new HashSet<Integer>();
        boolean duplicate=false;
        for (int i = 0; i < arr.length; i++) {
            if(hm.contains(arr[i])){
                duplicate = true;
            }
            else{
                hm.add(arr[i]);
            }
        }
        System.out.println(duplicate);

    }

}
