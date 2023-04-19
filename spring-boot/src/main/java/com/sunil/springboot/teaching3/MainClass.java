package com.sunil.springboot.teaching3;

public class MainClass {

    public static void main(String[] args) {

        Employee e1 = new Employee(123, "sunil");
        Employee e2 = new Employee(123, "sunil");

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.equals(e2));
    }
}
