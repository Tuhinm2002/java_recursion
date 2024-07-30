package SubsetAndStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetDuplicate2 {
    public static void main(String[] args) {

        int[] arr = {1,2,4};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        func(arr,ans);

    }

    static void func(int[] arr, ArrayList<ArrayList<Integer>> ans){

        ans.add(new ArrayList<>());
        for(int j=0;j<arr.length;j++){
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                // append with 0th index then append with 1st index
                // it is looping until ans.size() i.e. not arr.length
                ArrayList<Integer> tmp = new ArrayList<>(ans.get(i));
                // nums is replaced by arr[j]
                tmp.add(arr[j]);
                if (!ans.contains(tmp)){
                ans.add(tmp);}
            }
        }

        System.out.println(ans);

    }
}
