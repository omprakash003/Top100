package GetMyParking.Arrays;

import java.util.Arrays;

public class CountTriplets {
    public static void main(String[] args) {
        int[]arr={12 ,8, 2, 11, 5 ,14, 10};
        System.out.println(Counttriplets(arr));

    }
    public static int Counttriplets(int[]arr) {
        Arrays.sort(arr);
        int count = 0;
        int n= arr.length;

        // Loop through the array, treating arr[i] as the third element in the triplet
        for (int i = n - 1; i >= 2; i--) {
            int low = 0;
            int high = i - 1;

            // Check if there are two elements whose sum equals arr[i]
            while (low < high) {
                int sum = arr[low] + arr[high];
                if (sum == arr[i]) {
                    count++;
                    low++;
                    high--;
                } else if (sum < arr[i]) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return count;
    }



    }


