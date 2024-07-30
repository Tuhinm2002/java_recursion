package SubsetAndStrings;

import java.util.ArrayList;
import java.util.HashMap;

public class SubsequencesMemo {
    public static void main(String[] args) {
        // Duplicate is needed don't delete it
        String str = "bccbcdcabadabdd";
        ArrayList<String> final_ans = subseq(str, "", new HashMap<>());
        System.out.println(final_ans);
    }

    static ArrayList<String> subseq(String str, String tmp, HashMap<String, ArrayList<String>> memo) {
        String key = str + "|" + tmp;  // Create a unique key for the current state

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(tmp);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subseq(str.substring(1), tmp + ch, memo);
        ArrayList<String> right = subseq(str.substring(1), tmp, memo);

        ArrayList<String> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);

        memo.put(key, result);  // Store the result in the memo map
        return result;
    }
}
