package GetMyParking.Arrays;

import java.util.Arrays;

public class Mergetwo {
    public static void main(String[] args) {
        long[]arr={1,3,4,7};
        long[]arr2={2,6,5,8,20};
        merge(arr,arr2,4,5);
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        int left=n-1;
        int right=0;
        while(left>=0&& right<m){
            if(arr1[left]>arr2[right]){
                long temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                right++;
                left--;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
