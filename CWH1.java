package com.company;

import java.util.Scanner;

public class CWH1{
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public void setId (int id){
        if (id == 26 ){
            this.id=id;
        }
        else{
            System.out.println("This is not a integer");
        }
    }

    public String getName(){
        return name;
    }

    public void setname (String name){
        this.name = name;
    }

    public static void main(String[] args) {
        CWH1 employee = new CWH1();
        employee.setname("Mayurwithcode");
        employee.setId(26);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
