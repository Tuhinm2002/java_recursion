package SubsetAndStrings;

import java.util.ArrayList;

public class SubsequencesLoop {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> final_ans = subseq(str);
        System.out.println(final_ans);
    }

    static ArrayList<String> subseq(String str) {
        ArrayList<String> result = new ArrayList<>();
        result.add("");  // Start with an empty subsequence

        for (char ch : str.toCharArray()) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                result.add(result.get(i) + ch);
            }
        }

        return result;
    }
}
