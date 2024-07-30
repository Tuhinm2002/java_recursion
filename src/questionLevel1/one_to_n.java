package questionLevel1;

public class one_to_n {
    public static void main(String[] args) {

        func(5,1);
    }

    private static int func(int i,int start) {
        if(start == i+1){
            return start;
        }
        System.out.println(start);
        return func(i,start+1);
    }
}
