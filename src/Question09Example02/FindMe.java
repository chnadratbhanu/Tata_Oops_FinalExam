/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example02;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class FindMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        System.out.println("Answer for Question number: 09 Example 02"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        int[] arr={1,67,34,89,23};
        
        try{
            System.out.println("Trying to access out of index");
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        }
        
        try{
            System.out.println("Trying to divide by Zero,,we are catching Arithmetic exception at runtime");
            System.out.println(arr[3]/0);
            
        }
        catch(ArithmeticException aec){
            System.out.println(aec.getMessage());
        }
    }
    
}
