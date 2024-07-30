package SubsetAndStrings;

public class RemoveCharacter2 {
    public static void main(String[] args) {

        String str = "abbacd";
        System.out.println(removeChar(str,'a'));
    }

    static String removeChar(String str,char item){

        if(str.isEmpty()){
            return "";
        }

        if(str.charAt(0) == item){
            return removeChar(str.substring(1),item);
        }
        return str.charAt(0) + removeChar(str.substring(1),item);

    }
}
