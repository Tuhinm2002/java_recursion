package questionLevel1;

public class sum_of_digits {
    public static void main(String[] args) {

//        f(x) = r + prev
//        prev = f(n/10)

        System.out.println(sumDigits(123450));
    }

    static int sumDigits(int n){

        if(n <= 1){
            return n;
        }

        int r = n%10;
        return r + sumDigits(n/10);
    }
}
