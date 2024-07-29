package com.workintech.developers;

public class HRManager extends Employee{
    private String[] JuniorDevelopers;
    private String[] MidDevelopers;
    private String[] SeniorDevelopers;

    public HRManager(long id, String name, double salary){
        super(id,name,salary);
    }
    public void work(){
        System.out.println("HRManager starts to working");
        setSalary(30000);
    }
    public void addEmployee(String[] JuniorDevelopers){

    }

}
