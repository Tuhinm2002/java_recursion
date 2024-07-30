package questionLevel1;

public class product_n_to_one {
    public static void main(String[] args) {

//        f(x) = n * f(n-1)
        System.out.println(func(5));
    }

    static int func(int n){
        if (n == 1){
            return n;
        }
        // here n is multiplied with return value (i.e 1)
        // therefore, 5 * 4 * 3 * 2 * return value
        return n * func(n-1);
    }
}
