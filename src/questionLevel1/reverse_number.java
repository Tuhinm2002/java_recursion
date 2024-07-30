package questionLevel1;

public class reverse_number {
    public static void main(String[] args) {

        System.out.println(reverse(1234,0));
    }

    static int reverse(int n,int sum){
        if(n <= 0){
            return sum;
        }
        int r = n % 10;
        sum = (sum *10)+r;
        return reverse(n/10,sum);
    }
}
