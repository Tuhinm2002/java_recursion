package questionLevel1;

public class n_to_1 {
    public static void main(String[] args) {
      val(5);
    }

    static int val(int n){
        if (n == 0){
            return n;
        }
        System.out.println(n);
        return val(n-1);

    }
}
