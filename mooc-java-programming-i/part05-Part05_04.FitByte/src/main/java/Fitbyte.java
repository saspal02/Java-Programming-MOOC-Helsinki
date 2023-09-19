public class Fitbyte {
     private int age;
     private int restingHeartRate;

     public Fitbyte(int age, int restingHeartRate) {
         this.age = age;
         this.restingHeartRate = restingHeartRate;
     }
     public double targetHeartRate (double percentageofMaximum) {

         double maximumHeartRate =  206.3 - (0.711 * age);
         double result = 0;

         result = result = (maximumHeartRate - restingHeartRate) * (percentageofMaximum) + restingHeartRate;

         return  result;

     }
}
