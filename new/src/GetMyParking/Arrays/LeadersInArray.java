package GetMyParking.Arrays;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[]arr={16,17,4,3,5,2};
        System.out.println(FindLeaders(arr));

    }
    public static ArrayList<Integer>FindLeaders(int[]arr){
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        if(n==0||n==1){
            if(n==1){
                list.add(arr[0]);
                return list;
            }
            list.add(-1);
            return list;
        }
        int j=n-1;
        list.add(arr[j]);
        int i=j-1;
        while(i>=0){
            if(arr[i]>arr[j]){
                list.add(arr[i]);
                j=i;
            }
            i--;
        }
        return list;
    }
}
