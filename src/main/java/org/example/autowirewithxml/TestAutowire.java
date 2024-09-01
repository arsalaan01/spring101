package org.example.autowirewithxml;

import org.example.xmlconf.Address;

public class TestAutowire {
    int tid;
    String test;
    Address address;

    public TestAutowire() {
    }

    public TestAutowire(int tid, String test, Address address) {
        this.tid = tid;
        this.test = test;
        this.address = address;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TestAutowire ===> {" +
                "tid=" + tid +
                ", test='" + test + '\'' +
                ", address=" + address +
                '}';
    }
}
