public class method_program_3 {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        sum(4);
        System.out.println(sum(4));
    }
}
