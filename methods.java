public class methods {
    static  int logic(int x,int y){
        int z=x+y;
        if (x>y){
             z= (x+y )*5;
//            System.out.println(z);
        }
        else {
            z = (x + y);
//            System.out.println(z);

        }
        return z;
    }
    public static void main(String[] args) {
        int a=7;
        int b=8;
        int c=logic(a,b);
        System.out.println(c);
        int a1=45;
        int b1=23;
        int c1=logic(a1,b1);
        System.out.println(c1);
    }
}