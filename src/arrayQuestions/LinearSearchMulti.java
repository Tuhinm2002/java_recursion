package arrayQuestions;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class LinearSearchMulti {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,3,4,5};
        int len = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(search(arr,4,0,ans));
    }

    static ArrayList<Integer> search(int[] arr, int target, int i, ArrayList<Integer> ans){
        if (target == arr[i]){
            ans.add(i);
        }
        if (arr.length -1 == i){
            return ans;
        }

        return search(arr,target,i+1,ans);
    }
}
