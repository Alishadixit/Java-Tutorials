import  java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
         char operator;
        int num1;
        int num2;
        int result;
        Scanner input=new Scanner(System.in);
        System.out.println("Choose an operator  + ;- ;* ; / ");
         operator= input.next().charAt(0);
        System.out.println("Enter num1 :");
        num1=input.nextInt();
        System.out.println("Enter num2 :");
        num2=input.nextInt();
        switch (operator){
            case '+':
              result=num1 + num2;
                System.out.println("The sum of two no is : " +result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("The difference of two no is :" +result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("The product of two no is :" +result);
            case '/':
                result=num1/num2;
                System.out.println("The division of two no is :" +result);
            default:
                System.out.println("You enter wrong choice");

        }

    }
}