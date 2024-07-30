package SubsetAndStrings;

public class RemoveCharacter {
    public static void main(String[] args) {

        String str = "abbacd";
        System.out.println(removeChar(str,'a',"",0));
    }

    static String removeChar(String str,char item,String ans,int i){

        if(i == str.length()){
            return ans;
        }

        if(str.charAt(i) != item){
        ans += str.charAt(i);}

        return removeChar(str,item,ans,i+1);

    }
}
