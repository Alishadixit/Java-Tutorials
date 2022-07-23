public class methods1 {
//    method overloading
    static void marks(int a){
        System.out.println("Hey alisha you got  "+ a + " in maths");

    }
    static void marks(int a,int b){
        System.out.println("You scored "+ a+ " in physics "+ b +  " in chemistry");
    }

    public static void main(String[] args) {
       marks(87);// arguments are actual
        marks(77,94);
    }
}
