package code.zeeker.dev.helpers;

public class DistanceConverter {
/*
        Method
        void : Method is not return
        public : Method is export
     */
    public static void kmToMiles(double km){
        double miles = km / 1.6;
        System.out.println(miles);
    }

    public static double reKmToMiles(double km){
        double miles = km / 1.6;
        return miles;
    }

    public static double milesToKm(double miles){
        return miles * 1.6;
    }
}
