package GetMyParking.Arrays;

import java.util.ArrayList;

public class ReverseArrayGroups {
    public static void main(String[] args) {
        ArrayList<Long>list=new ArrayList<>();
        long[]arr={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        for(long e:arr){
            list.add(e);
        }
        ReverseGroups(list,5);
        System.out.println(list);

    }
    public static void ReverseGroups(ArrayList<Long>list,int k){

        if(k>list.size()){
            SwapGroups(list,0, list.size()-1);
        }
        else if(k!=0){
            int start=0;
            int end=k;
           while( end<list.size() &&end-start==k){
               SwapGroups(list,start,end-1);
               System.out.println(list);
               start=end;
               end=end+k;
           }
           if(start<list.size()){
               SwapGroups(list,start,list.size()-1);
           }

        }

        else{
            return;
        }


    }
    public static void SwapGroups(ArrayList<Long>list,int start,int end){
        if(end<list.size()) {
            while (start < end) {
                Long temp = list.get(start);
                list.set(start, list.get(end));
                list.set(end, temp);
                start++;
                end--;
            }
        }

    }
}
