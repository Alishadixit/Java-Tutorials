public class vrargs {
    static int multi(int...arr){
        int result =1;
        for (int a:arr){
            result=result*a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The multiplication is " + multi(4,5));
        System.out.println("The multiplication is " +multi(3,4,5));
        System.out.println("The multiplication is " +multi(10,9,8));
    }

}
