package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, double salary){
        super(id,name,salary);
    }
    public void work(){
        System.out.println("MidDeveloper starts to working");
        setSalary(90000);
    }
}
