/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java. util. Scanner;
/**
 *
 * @author sukhm
 */
public class IsEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer (or -1 to quit): ");
        int x = input.nextInt();
        
        while (x != -1) {
            if (isEven(x)) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
            x = input.nextInt();
        }
        
        input.close();
    }
    
    public static boolean isEven(int x) {
        return (x % 2 == 0);
    }
}


