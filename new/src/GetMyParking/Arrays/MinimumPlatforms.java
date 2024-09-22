package GetMyParking.Arrays;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int arr[] = {900, 1235, 1100};
        int dep[] = {1000, 1240, 1200};
        System.out.println(NoOfPlatforms(arr,dep));

    }
    public static int NoOfPlatforms(int[]arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0;
        int maxcount=0;
        int arv=0;
        int dept=0;
        while(arv<arr.length ){
            if(arr[arv]>dep[dept]){
                count--;
                dept++;
            }
            else{
                count++;
                arv++;
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;

    }
}
