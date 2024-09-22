package GetMyParking.Arrays;
/*
Given an array of integers. Find the Inversion Count in the array.  Two elements arr[i] and arr[j]
form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted.
If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum.
 */

public class InversionPairs {
    public static void main(String[] args) {

    }
    public static long CountInvp(long[]arr){
        long count=0;
        for(int i=0;i<arr.length;i++){
            count+=searchLower(arr,i+1,arr[i]);
        }
        return count;

    }
    public static long searchLower(long[]arr,int start,long ref){
        long count=0;
        for(int i=start;i< arr.length;i++){
            if(arr[i]<ref){
                count++;
            }
        }
        return count;
    }
}
