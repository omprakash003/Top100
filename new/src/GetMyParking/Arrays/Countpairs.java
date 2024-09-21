package GetMyParking.Arrays;

public class Countpairs {
    public static void main(String[] args) {
        int[]arr={2, 3,4,5};
        int []brr={1,2,3};
        System.out.println(NumberOfPairs(arr,brr));

    }
    public static long NumberOfPairs(int[]arr,int[]brr){
        long count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brr.length;j++){
                double x=Math.pow((double) arr[i],(double) brr[j]);
                double y=Math.pow((double) brr[j],(double) arr[i]);
                if(x>y){
                    count++;
                }
            }
        }
        return count;
    }
}
