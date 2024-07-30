public class NumberExample {
    public static void main(String[] args) {

        print1(5);
        System.out.println("Done from main");
    }

    static void print1(int n){
        System.out.println(n);
        print2(n);
        System.out.println("Done from 1");
    }

    static void print2(int n){
        System.out.println(n);
        print3(n);
        System.out.println("Done from 2");
    }

    static void print3(int n){
        System.out.println(n);
        print4(n);
        System.out.println("Done from 3");
    }

    static void print4(int n){
        System.out.println(n);
        System.out.println("Done from 4");
    }
}


