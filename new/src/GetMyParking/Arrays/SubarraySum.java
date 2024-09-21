package GetMyParking.Arrays;
/*Question
Given an unsorted array arr of size n that contains only non negative integers, find a sub-array
(continuous elements) that has sum equal to s. You mainly need to return the left and right indexes(1-based indexing) of
 that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such
 subarray exists return an array consisting of element -1.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubarraySum {
    public static void main(String[] args) {
        int[]arr={1,1};
        System.out.println(Subbaray(arr,0,0));

    }
    public static ArrayList<Integer>Subbaray(int []arr,int n,int k) {
        ArrayList<Integer>list=new ArrayList<>();
        n=arr.length;
        if(n==0||n==1){
            if(n==0){
                list.add(-1);
                return list;
            }
            if(arr[0]==k){
                list.add(1);
                list.add(1);
                return list;
            }
            list.add(-1);
            return list;
        }
        int sum=arr[0];
        int j=0;
        int i=0;
        while(i<n && k>0 ){
            while(j<=i&&sum>k){
                sum-=arr[j];
                j++;



            }
            if(sum==k){
                list.add(j+1);
                list.add(i+1);
                return list;
            }
            i++;
            if(i<n){
                sum+=arr[i];}

        }
        if(k==0){
            for(int l=0;l<n;l++){
                if(arr[l]==0){
                    list.add(l+1);
                    list.add(l+1);
                    return list;
                }

            }
        }
        list.add(-1);
        return list;
    }
}
