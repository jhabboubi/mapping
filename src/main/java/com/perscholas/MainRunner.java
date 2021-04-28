package com.perscholas;

import com.perscholas.models.Employee;
import com.perscholas.models.EmployeeDetails;
import com.perscholas.services.EmployeeServices;
import com.perscholas.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {
    public static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();


    public static void main(String[] args) {
        EmployeeServices es = new EmployeeServices();

        Employee employee = new Employee();
        employee.setEName("Konstantin");
        employee.setEEmail("kon@gmail.com");
        employee.setESalary(12000D);

        EmployeeDetails detailOne = new EmployeeDetails();
        detailOne.setEDAddress("Plano,Tx");
        detailOne.setEDPhone("685555455");

        EmployeeDetails detailTwo = new EmployeeDetails();
        detailTwo.setEDAddress("Dallas, Tx");
        detailTwo.setEDPhone("4548544444");

        List<EmployeeDetails> edList = new ArrayList<EmployeeDetails>();
        edList.add(detailOne);
        edList.add(detailTwo);

        employee.setEmployeeDetails(edList);

        es.createEmployee(employee);







    }
}
