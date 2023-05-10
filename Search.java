public class Search{
    public static void main(String[] args) {
      int srr[] = {1,2,3,4,5};
            System.out.println(Bsearch(srr, 5));
        
    }
    static int Bsearch(int arr[] , int target){
        int low = 0;
        int high= arr.length - 1;
        while(high >= low){
            int mid = (high - low)/2 + low;
            if(arr[mid]== target) return mid;
            else if(arr[mid] > target) high = mid-1;
            else {
                low = mid + 1;
            }
        }
        return -1;
         
        
    }
}
