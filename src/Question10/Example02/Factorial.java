/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example02;

import java.util.Scanner;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question number: 10 Example 02"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        long factorial = factorial(num);
        System.out.println("The factorial of " + num + ": " + factorial);
    }

    public static long factorial(int num) {
        if (num >= 1) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

}
