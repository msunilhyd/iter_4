package com.sunil.springboot.teaching2;

public class MainClass {
    public static void main(String[] args) {

        Employee e1 = new Employee(1234, "sunil");
        Employee e2 = new Employee(1234, "sunil");

        // contract between a user and java
        // 2 objects are only equals iff you override the equals method
        // and also their hashcodes should be the same

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.equals(e2));
    }
}
