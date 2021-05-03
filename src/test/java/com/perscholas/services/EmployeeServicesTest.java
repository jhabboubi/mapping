package com.perscholas.services;


import com.perscholas.MainRunner;
import com.perscholas.models.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

// default value to start a new instance of this class or PER_CLASS to create one instance of this class
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class EmployeeServicesTest {

    static EmployeeServices es;

    @BeforeAll
    static void beforeAll() {
        es = new EmployeeServices();

    }

    @Test
    void test() {
        assumeTrue(MainRunner.emf.isOpen());
        Employee expected = new Employee(1, "Jafer", "habboubi@gmail.com", 1000.0D);
        es.createEmployee(expected);
        assertEquals(expected, MainRunner.emf.createEntityManager().find(Employee.class, 1));

    }


}