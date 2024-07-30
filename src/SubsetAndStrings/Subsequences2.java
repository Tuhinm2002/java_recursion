package SubsetAndStrings;

import java.util.ArrayList;

public class Subsequences2 {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> final_ans = subseq(str,"",ans);
        System.out.println(final_ans);

    }

    static ArrayList<String> subseq(String str, String tmp, ArrayList<String> ans){

        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(tmp);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subseq(str.substring(1), tmp + ch, ans);

        ArrayList<String> right = subseq(str.substring(1), tmp, ans);

        left.addAll(right);
        return left;
    }
}
