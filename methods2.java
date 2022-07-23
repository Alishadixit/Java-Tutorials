
public class methods2 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
           return 1;
        }else {
            return n*factorial(n -1);
        }
    }
    public static void main(String[] args) {
        System.out.println(  " The factorial of  5 is" +factorial(5));
        System.out.println(  " The factorial of  6 is" +factorial(6));
        System.out.println(  " The factorial of  7 is" +factorial(7));
    }
}
