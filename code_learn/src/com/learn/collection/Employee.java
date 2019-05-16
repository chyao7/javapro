package com.learn.collection;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        if (this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }else {
            if(this.id > o.salary){
                return 1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "com.learn.collection.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}