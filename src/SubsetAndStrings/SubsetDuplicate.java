package SubsetAndStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetDuplicate {
    public static void main(String[] args) {

        int[] arr = {1,2,2};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        func(arr,ans);

    }

    static void func(int[] arr, ArrayList<ArrayList<Integer>> ans){

        ans.add(new ArrayList<>());
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        for(int j=0;j<arr.length;j++){
            if (j > 0 && arr[j] == arr[j-1]){
                start = end + 1;
            }
            end = ans.size() - 1;
            int n = ans.size();
            for (int i = start; i < n; i++) {
                ArrayList<Integer> tmp = new ArrayList<>(ans.get(i));
                // nums is replaced by arr[j]
                tmp.add(arr[j]);
                ans.add(tmp);
            }
        }

        System.out.println(ans);

    }
}
