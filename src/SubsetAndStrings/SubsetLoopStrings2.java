package SubsetAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetLoopStrings2 {
    public static void main(String[] args) {

        String str = "abc";
        ArrayList<ArrayList<Character>> ans = new ArrayList<>();
        func(str,ans);
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("ball");
        Collections.sort(a);
        System.out.println(a);

    }

    static void func(String str, ArrayList<ArrayList<Character>> ans){

        ans.add(new ArrayList<>());

        for(int j = 0;j<str.length();j++){
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Character> tmp = new ArrayList<>(ans.get(i));
                tmp.add(str.charAt(j));
                ans.add(tmp);
            }
        }
    }
}
