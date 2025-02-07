package org.example.xmlconf;

public class Employee implements Records{
    int empId;
    String empName;
    Address address;

    public Employee() {
    }

    public Employee(int empId, String empName, Address address) {
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
