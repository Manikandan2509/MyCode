public class practice {
    public static void main(String[] args) {

                int arr[] = {1,4,5,7,9,10,56,89,99,110};
                int start = 0;
                int end = arr.length-1;
                int target = 150;

                while (start <= end){

                    int mid = (start +end) /2;
                    if(arr[mid] == target){
                        System.out.println("Element present");
                        return;
                    }
                    else if (target > arr[mid]){
                        start = mid +1;
                    }
                    else if (target< arr[mid]){
                        end = mid -1;
                    }
                }
        System.out.println("Element not present");
            }
        }


