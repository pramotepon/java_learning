// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    /*
        Variable & Data type
    */
////        Integer
//        int height = 170;
//        System.out.println(height);
////        Double
//        double grade = 1.70;
//        System.out.println(grade);
////        String
//        String name = "Pramote";
//        System.out.println(name);
////        Boolean
//        boolean isPass = true;
//        System.out.println(isPass);

    /*
        Concat variables
    */
//        double lat = 13.5555;
//        double lon = 100.5555;
//        String outputText = "("+ lat + "," + lon + ")";
//        System.out.println(outputText);

    /*
            Convert String
    */
////        To integer
//        String numberText = "23";
//        int number = Integer.parseInt(numberText);
//        System.out.println(number + 5);
////        To double
//        String textDouble = "23.77";
//        double numberDouble = Double.parseDouble(textDouble);
//        System.out.println(numberDouble + 0.2);

    /*
            Operators
            Arithmetic Operators
    */
//        double firstNumber = 15;
//        double secondNumber = 4;
////        Addition
//        System.out.println(firstNumber + secondNumber);
////        Subtraction
//        System.out.println(firstNumber - secondNumber);
////        Multiplication
//        System.out.println(firstNumber * secondNumber);
////        Division
//        System.out.println(firstNumber / secondNumber);
////        Modulus
//        System.out.println(firstNumber % secondNumber);
////        Increment
//        firstNumber++;
//        System.out.println(firstNumber);
////        Decrement
//        secondNumber--;
//        System.out.println(secondNumber);
    /*
        Operators
        Assignment Operators
    */
////        addition assignment
//        firstNumber += 5;
//        System.out.println(firstNumber);
////        Subtraction assignment
//        secondNumber -= 2;
//        System.out.println(secondNumber);
    /*
        Operators
        Comparison Operators
    */
//        double firstNumber = 15;
//        double secondNumber = 12;
////        Equal to
//        System.out.println(firstNumber == secondNumber);
////        Not equal
//        System.out.println(firstNumber != secondNumber);
////        Greater than
//        System.out.println(firstNumber > secondNumber);
////        Less than
//        System.out.println(firstNumber < secondNumber);
////        Greater than or equal to
//        System.out.println(firstNumber >= secondNumber);
////        Less than or equal to
//        System.out.println(firstNumber <= secondNumber);
    /*
        Operators
        Logical Operators
    */
//        double firstNumber = 15;
//        double secondNumber = 12;
////        And
//        System.out.println(firstNumber > secondNumber && firstNumber >= secondNumber);
////        Or
//        System.out.println(firstNumber > secondNumber || firstNumber <= secondNumber);
////        Not
//        System.out.println(firstNumber != secondNumber);

    /*
        Conditions
     */
//        double originalPrice = 2000;
//        double finalPrice = originalPrice;
////        If else
//        if(originalPrice >= 10000){
//            finalPrice = originalPrice - 0.15 * originalPrice;
//        } else if (originalPrice >= 6000) {
//            finalPrice = originalPrice - 0.1 * originalPrice;
//        } else if (originalPrice >= 3000) {
//            finalPrice = originalPrice - 0.08 * originalPrice;
//        }else {
//            finalPrice = originalPrice - 0.05 * originalPrice;
//        }
//        System.out.println(finalPrice);

    /*
        Loop
     */
////    For
//        int sumNumber = 0;
//        for (int i = 2; i <= 4; i++){
//            sumNumber += i;
//        }
//        System.out.println(sumNumber);

//        Call method
        kmToMiles(10);
//        Call method and return
        double resultMiles = reKmToMiles(10);
        System.out.println(resultMiles);
//        Call method and return
        double resultKm = milesToKm(resultMiles);
        System.out.println(resultKm);
    }
    /*
        Method
        void : Method is not return
     */
    static void kmToMiles(double km){
        double miles = km / 1.6;
        System.out.println(miles);
    }

    static double reKmToMiles(double km){
        double miles = km / 1.6;
        return miles;
    }

    static double milesToKm(double miles){
        return miles * 1.6;
    }
}