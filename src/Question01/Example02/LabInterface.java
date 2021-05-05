/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.Example02;

/**
 *
 * @author Chandra Bhanu Tata
 */
public interface LabInterface {

    String LAB_TYPE = "Research & Development";

    public default String getLabType() {
        return LAB_TYPE;
    }

    int getNoOfStudents();
}
