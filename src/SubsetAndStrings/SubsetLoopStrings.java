package SubsetAndStrings;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class SubsetLoopStrings {
    public static void main(String[] args) {

        String str = "abc";
        ArrayList<String> ans = new ArrayList<>();
        func(str,ans);
//        System.out.println(ans);

    }

    static void func(String str, ArrayList<String> ans){

        ArrayList<ArrayList<Character>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int j=0;j<str.length();j++){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                String tmp2 =  "";
                ArrayList<Character> tmp = new ArrayList<>(outer.get(i));
                tmp.add(str.charAt(j));
                outer.add(tmp);
            }
        }

        System.out.println(outer);
    }
}
