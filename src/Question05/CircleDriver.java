/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question number: 05   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        ComparableCircle comcir2 = new ComparableCircle(2);
        ComparableCircle comcir1 = new ComparableCircle(4.2);
        ComparableCircle comcir3 = new ComparableCircle(5.2);

        ArrayList<ComparableCircle> lcc = new ArrayList<>();
        lcc.add(comcir1);
        lcc.add(comcir2);
        lcc.add(comcir3);
        System.out.println("Before Sorting");
        printList(lcc);

        Collections.sort(lcc);
        System.out.println("The Larger Area is "
                + lcc.get(0).parentArea());
    }

    public static void printList(List<ComparableCircle> l) {
        l.forEach(cc -> {
            System.out.println(cc.parentArea());
        });
    }

}
