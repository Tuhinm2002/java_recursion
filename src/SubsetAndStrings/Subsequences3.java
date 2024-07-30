package SubsetAndStrings;

import java.util.ArrayList;

public class Subsequences3 {
    public static void main(String[] args) {
        String str = "bccbcdcabadabddbccaddcbabbaaacdba";
        ArrayList<String> final_ans = subseq(str,"");
        System.out.println(final_ans);

    }

    static ArrayList<String> subseq(String str, String tmp){

        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(tmp);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> left = subseq(str.substring(1), tmp + ch);

        ArrayList<String> right = subseq(str.substring(1), tmp);

        left.addAll(right);

        return left;
    }
}
