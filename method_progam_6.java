public class method_progam_6 {
    static float temp(float C){
        System.out.println("Converting Degree Celsius to Degree Fahreheit");
        float temperature = (float) ((C*9.0/5.0) + 32.0);
        return temperature;

    }

    public static void main(String[] args) {
        System.out.println("The temperature in Degree Fahrenheit is  " +temp(32) +"F");
    }

}




