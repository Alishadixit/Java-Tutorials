import java.util.Arrays;
public class Array {
    public static void main(String args[]){
        int age =34;
        int Physics=90;
        int Chemistry=78;
        int Maths=89;
        int[] marks=new int[3];
        marks[0]=90;
        marks[1]=78;
        marks[2]=89;
        System.out.println("Marks of PCM");
        System.out.println("Physcis marks  " +   marks[0] );
        System.out.println("Chemistry  " + marks[1]);
        System.out.println("Maths  " + marks[2]);
//        length of array
   //     System.out.println(marks.length);
//        Sorting of array
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }

}
