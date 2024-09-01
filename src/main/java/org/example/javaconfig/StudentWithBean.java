package org.example.javaconfig;

public class StudentWithBean {
    private Marks marks;
    public void study() {
        System.out.println("Hello java coder....");
    }

    public StudentWithBean(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentWithBean{" +
                "marks=" + marks +
                '}';
    }
}
