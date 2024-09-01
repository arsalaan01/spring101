package org.example.awannotation;

import org.example.xmlconf.Address;
import org.example.xmlconf.Records;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee implements Records {

    int empId;
    String empName;
    Address address;

//    @Autowired
//    @Qualifier("qualifying bean name")
//    Address address;

    public Employee() {
    }
    @Autowired
    public Employee(@Value("1230")int empId, @Value("Harun")String empName, @Qualifier("address2")Address address) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "empId=" + empId +
                " empName=" + empName +
                ", address=" + address +
                ']';
    }

    @Override
    public void printRole() {
        System.out.println("My Employee Id is:" + empId);
    }
}
