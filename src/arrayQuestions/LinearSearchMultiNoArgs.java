package arrayQuestions;

import java.util.ArrayList;

public class LinearSearchMultiNoArgs {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,3,4,5};
        int len = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(search(arr,4,0));
    }

    static ArrayList<Integer> search(int[] arr, int target, int i){
        ArrayList<Integer> ans = new ArrayList<>();
        if (target == arr[i]){
            // This happens after finding answer
            // Then it will go upwards in the stack to
            // previous calls and there it will get
            // stored in an arraylist in java we have to declare type
            // but if we do it in python there is no need
            ans.add(i);
        }
        if (arr.length -1 == i){
            return ans;
        }

        ArrayList<Integer> ansFromBelowCalls =  search(arr,target,i+1);

        ans.addAll(ansFromBelowCalls);
        return  ans;
    }
}
