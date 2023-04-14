package com.sunil.springboot.teaching;

public class Employee {

    public int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String name;

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        if (this.id == emp.id && this.name == emp.name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
       return this.id;
    }
}
