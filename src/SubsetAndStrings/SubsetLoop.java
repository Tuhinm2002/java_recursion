package SubsetAndStrings;

import java.util.ArrayList;

public class SubsetLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,4};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        func(arr,ans);

    }

    static void func(int[] arr, ArrayList<ArrayList<Integer>> ans){

        ans.add(new ArrayList<>());

//        System.out.println(ans);

        for(int num: arr){
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                                        // bellow is the index value
                ArrayList<Integer> tmp = new ArrayList<>(ans.get(i));
                tmp.add(num);
//                System.out.println(num);
                ans.add(tmp);
                System.out.println(num+" "+tmp);
            }
        }

//        System.out.println(ans);
    }
}
