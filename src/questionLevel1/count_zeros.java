package questionLevel1;

public class count_zeros {
    public static void main(String[] args) {

        System.out.println(zeros(3040,0));
    }

    static int zeros(int n,int count){
        if(n <= 0){
            // this will return count of two recursive calls
            // if we write return zeros(n,count) + zeros(n,count)
            // this return is to end execution
            return count;
        }
        int r = n % 10;
        if(r == 0){
            count++;
        }
        
        // this is final return call
        return zeros(n/10,count);
    }
}
