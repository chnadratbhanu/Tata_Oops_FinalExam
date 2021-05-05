/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 * 
 * @author Chandra Bhanu Tata 
 */

public class ArmyDriver {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question number: 11 "
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Army a1 = new Army("Chandra", 100, "first");
        Army a2 = new Army("Hemanth", 100, "second");
        Army a3 = new Army("Pavan", 100, "thrid");
        Army a4 = new Army("sai", 100, "fourth");
        Army a5 = new Army("Jaya Krishna", 100, "fiveth");
        Army a6 = new Army("Srikanth", 100, "sixth");
        Army a7 = a6;
        /*
        * this invokes the equals method from Army class and returns true
        * if attribute values of object are same
         */
        System.out.println("h1 equals h2: " + a1.equals(a2));
        System.out.println("h1 equals h5: " + a1.equals(a5));
        System.out.println("h4 equals h5: " + a4.equals(a5));
        System.out.println("h7 equals h6: " + a6.equals(a7));
        System.out.println("\n");
        /*
        *== is used to compare the addresses of the objects.It returns true 
        * only if the address of the objects is same
         */
        System.out.println("h1 equals h2: " + (a1 == a2));
        System.out.println("h1 equals h5: " + (a1 == a5));
        System.out.println("h4 equals h5: " + (a4 == a5));
        System.out.println("h7 equals h6: " + (a6 == a7));
        System.out.println("\n");
        /*
        *invokes the overrided hashcode method from army class and returns 
        similar hashcode if the two objects has same attribute values values
         */
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a5.hashCode());
        System.out.println(a7.hashCode());

    }

}
