public class Fibonacci {
    public static void main(String[] args) {
        // when we write the recursion solution in the form of
        // equation then it is called recurrence relation
        // f(n) = f(n-1) + f(n-2) -> recurrence relation

        // The base condition is represented by answer we know already
        // know. In this case fib(0) = 0 and fib(1) = 1


        System.out.println(fib(4));
    }

    static int fib(int n){

        if(n < 2){
            return n;
        }

        return fib(n-1) + fib(n-2);
        // After coming out of stack (means after completing execution)
        // then it will jump to the right side of the tre
    }
}
