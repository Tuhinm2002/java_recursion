package questionLevel1;

public class palindrome_number {
    public static void main(String[] args) {

        int val = 231;
        System.out.println(reverse(val,0) == val);
    }
    static int reverse(int n,int sum){

        if(n <= 0){
            return sum;
        }

        // Every thing is reversing back in call stack
        // In this manner we are getting the value
        // from base return function
        int r = n % 10;
        sum = (sum*10) + r;
        return reverse(n/10,sum);
    }
}
