public class method_program_5 {
    static int avr(int...arr) {
        float result = 0;
        for (float s : arr) {
            result = s + result;
        }
        float R = result / arr.length;
        System.out.println("The average of given number is" + R);

        return (int) R;
    }

    public static void main(String[] args) {
        System.out.println(avr(3,4,5));
    }
}
