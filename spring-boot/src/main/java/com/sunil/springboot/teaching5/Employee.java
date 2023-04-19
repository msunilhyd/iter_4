package com.sunil.springboot.teaching5;

public class Employee {

    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        if (this.id == emp.id && this.name.equals(emp.name)) {
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
