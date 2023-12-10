package DesignPattern.builder;

public class Client {
    public static void main(String[] args) {
        Student student = new Student.Builder(201910101, "Justin")
                .major("Comp Sci")
                .age(24)
                .build();

        System.out.println("== Student Info ==");
        System.out.println("ID = " + student.getId());
        System.out.println("Name = " + student.getName());
        System.out.println("Major = " + student.getMajor());
        System.out.println("Age = " + student.getAge());
    }
}
