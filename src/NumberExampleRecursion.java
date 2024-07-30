public class NumberExampleRecursion {
    public static void main(String[] args) {

        // Every recursive call taking a separate memory
        // Just like calling a different function within a function
        // takes some spaces

        print1(0);

    }

    static void print1(int n){
        if (n == 5){
            return;
        }
        System.out.println(n);
        // this is called tail recursion or the last recursion call
        print1(n+1);
    }
}


