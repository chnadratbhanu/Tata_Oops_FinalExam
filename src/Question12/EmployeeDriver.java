/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question number: 11 "
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Employee emp1 = new Employee(5, "chandra", 18000.0);
        Employee emp2 = new Employee(6, "hemanth", 5700.0);
        Employee emp3 = new Employee(9, "jaya krishna", 4500.0);
        Employee emp4 = new Employee(8, "madhu babu", 2900.0);
        Employee emp5 = new Employee(7, "Srikanth", 6000.0);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        System.out.println("List Order without sorting");
        for (Employee e : employees) {
            // original List
            System.out.println(e);
        }
        System.out.println("After sorting based on employee Id");
        Collections.sort(employees);
        printList(employees);
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee em1, Employee em2) {
                if (em1.getEmpSalary() < em2.getEmpSalary()) {
                    return -1;
                } else if (em1.getEmpSalary() == em2.getEmpSalary()) {
                    return 0;
                } else {
                    return +1;
                }
            }
        });

        System.out.println("After Sorting based on employee salary");
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("After Sorting based on employee name");
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee em1, Employee em2) {
                if (em1.getEmpName().compareTo(em2.getEmpName()) == 0) {
                    return em1.getEmpName().compareTo(em2.getEmpName());
                } else {
                    return em1.getEmpName().compareTo(em2.getEmpName());
                }

            }

        });
        printList(employees);

    }

    private static void printList(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}
