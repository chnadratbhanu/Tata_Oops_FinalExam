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
public class Experiment extends Lab implements LabInterface {

    @Override
    public void doExperiment() {
        System.out.println("This is a Experiment!!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNoOfStudents() {
        return 50; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Laboratory is an " + LAB_TYPE + " Laboratory . Number of students are "
                + this.getNoOfStudents();

    }
}
