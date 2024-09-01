package org.example.stereotypeanno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // bean will be created with class name itself i.e register
//@Component("myBean") if want to give custom name to your bean
//@Scope("prototype") used to define bean scope default is singleton
public class Register {
    @Value("2198")
    int id;
    @Value("David")
    String firstName;
    @Value("Zenesy")
    String lastName;
    @Value("#{myList}")
    List<String> cities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Register{" +
                "cities=" + cities +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}
