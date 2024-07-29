package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary, SeniorDeveloper[] seniorDevelopers,
                     MidDeveloper[] midDevelopers, JuniorDeveloper[] juniorDevelopers) {
        super(id, name, salary);
        this.seniorDevelopers = seniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.juniorDevelopers = juniorDevelopers;
    }

    @Override
    public void work(){
        System.out.println("HRManager starts to working");
        setSalary(30000);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper,int index){
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("TheRequiredIndexIsNotEmpty");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }
    public void addEmployee(MidDeveloper midDeveloper,int index){
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("TheRequiredIndexIsNotEmpty");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }
    public void addEmployee(SeniorDeveloper seniorDeveloper, int index){
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("TheRequiredIndexIsNotEmpty");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
