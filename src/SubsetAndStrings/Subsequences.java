package SubsetAndStrings;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        String str = "abd";
        ArrayList<String> ans = new ArrayList<>();
        subseq(str,"",ans);
        System.out.println(ans);

    }

    static void subseq(String str, String tmp, ArrayList<String> ans){

        if(str.isEmpty()){
            ans.add(tmp);
            return;
        }

        char ch = str.charAt(0);
        subseq(str.substring(1),tmp+ch,ans);

        subseq(str.substring(1),tmp,ans);
    }
}
