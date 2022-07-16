import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your  first number :");
        num1=sc.nextInt();
        System.out.println("Enter your Second number :");
        num2=sc.nextInt();
        System.out.println("Enter your Third number :");
        num3= sc.nextInt();
        if (num1>=num3){
            if (num1>num2){
                System.out.println("num 1 is  greater" +num1);
                }
            else{
                System.out.println("num 2 is greater" + num2);
        }
        }
    else{
            System.out.println("num 3 is greater" +num3);
        }
    }
}
