package SubsetAndStrings;


import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
    // Pattern of taking some elements and removing some is called subset
        int[] arr = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        subset(arr,ans,list,0);
        System.out.println(ans);

    }

    static void subset(int[] arr,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list,int i){
        if(i == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }


        for(int j = 0; j < ans.size();j++) {
            ArrayList<Integer> tmp = new ArrayList<>(arr[i]);
            tmp.add(arr[i]);
            subset(arr, ans, tmp, i + 1);
        }
    }
}
