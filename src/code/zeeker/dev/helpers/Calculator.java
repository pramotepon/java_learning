package code.zeeker.dev.helpers;

public class Calculator {
    public static String getDivisibleOutput(int numerator){
        String output = "Demominator : ";
        for (int i = 2; i < numerator; i++){
            if (numerator % i == 0){
                output += i + ", ";
            }
        }
        return output;
    }
}
