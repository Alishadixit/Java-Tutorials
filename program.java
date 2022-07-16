import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        int pen=10;
        int copy=40;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of money you have : ");
         int cash=sc.nextInt();
         if (cash ==50){
             System.out.println("you can buy both");
         }
         else if (cash==10 && cash<50 ){
             System.out.println("you can buy one thing either pen or copy");
         }
         else if (cash==40) {
             System.out.println(" you  can buy only copy");
         }
         else {
             System.out.println(" you can't buy anything");
         }


    }

    }

