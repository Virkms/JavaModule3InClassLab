/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package virk.manpreet.parkinggarage;
import java.util.Scanner;
/**
 *
 * @author sukhm
 */
public class ParkingGarage {
    // Fee is the amount due 
     private static double fee;
     private static double totalFee;
    public static void main(String[] args) {
       System.out.println("Enter how many houors the car is parked");
        Scanner input = new Scanner(System.in);
        // x = number hours the car is parked
        double totalFee = 0.0;
        double x = input.nextDouble();
        while (x != -1){
        double Fee = calculateFee(x);
        totalFee += Fee;
        System.out.println("The Fee is " + Fee);
        System.out.println("Total fee is " + totalFee);
        x = input.nextDouble();
        
        
        }
        input.close();


    }
public static double calculateFee(double x) {
        double minFee = 2.00;
        double maxFee = 10.00;
        double xFee = 0.50;
        double TotalFee = 0.0;
        
        if (x <= 3) {
            TotalFee = minFee;  
        } 
        else if (x <= 24) {
        TotalFee = minFee + xFee *(x - 3);
        }
        else {
        TotalFee = maxFee;
        }
        return TotalFee;
    }
}
  
    


   
       
    

