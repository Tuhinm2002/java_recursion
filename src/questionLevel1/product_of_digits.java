package questionLevel1;

public class product_of_digits {
    public static void main(String[] args) {

        System.out.println(productDigits(505));
    }

    static int productDigits(int n){
        if(n <= 1){
            return 1;
        }
        int r = n%10;
        // Every time the function call bellow is getting some value
        // in return multiplied with r
        return r * productDigits(n/10);
    }
}
