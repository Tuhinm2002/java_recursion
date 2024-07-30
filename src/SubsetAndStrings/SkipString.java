package SubsetAndStrings;

public class SkipString {
    public static void main(String[] args) {

        String str = "abdxapplefd";
        System.out.println(skip(str,"apple"));
    }

    static String skip(String str,String item){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith(item)){
            return skip(str.substring(item.length()),item);
        }
        return str.charAt(0) + skip(str.substring(1),item);
    }
}
