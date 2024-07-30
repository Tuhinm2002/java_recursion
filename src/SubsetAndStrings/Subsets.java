package SubsetAndStrings;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
    // Pattern of taking some elements and removing some is called subset
        int[] arr = new int[]{1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        subset(arr,ans,list,0);
        System.out.println(ans);

    }

    static void subset(int[] arr,ArrayList<Integer> ans,ArrayList<Integer> list,int i){
        if(i == arr.length){
            ans.addAll(list);
            return;
        }

        list.add(arr[i]);
        subset(arr,ans,list,i+1);
        list.removeLast();
        subset(arr,ans,list,i+1);

    }
}
