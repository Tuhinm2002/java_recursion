package SubsetAndStrings;

import java.util.ArrayList;

public class SubsequencesASCII {
    public static void main(String[] args) {
        String str = "ab";
        ArrayList<String> ans = new ArrayList<>();
        subseq(str,"",ans);
        System.out.println(ans);
//        System.out.println(ans.get(0));

    }

    static void subseq(String str, String tmp, ArrayList<String> ans){

        if(str.isEmpty()){
            ans.add(tmp);
            return;
        }

        char ch = str.charAt(0);
        subseq(str.substring(1),tmp+ch,ans);
        subseq(str.substring(1),tmp+(ch+0),ans);
        subseq(str.substring(1),tmp,ans);
    }
}
