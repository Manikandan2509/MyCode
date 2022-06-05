import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,6,9,0,1};
        Arrays.sort(arr);
        boolean duplicate = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                   duplicate = true;
            }
        }
        System.out.print(duplicate);
    }
}
