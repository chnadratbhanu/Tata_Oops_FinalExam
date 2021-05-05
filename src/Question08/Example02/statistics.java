/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08.Example02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class statistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        System.out.println("Answer for Question number: 06 Example 02"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        try {
            Scanner scan = new Scanner(new File("chandra.txt"));
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
        }
    }

}
