package com.company;

import java.util.Scanner;

public class Getter_setter{
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name - ");
        String name = sc.nextLine();
        System.out.print("Enter Id - ");
        int id = sc.nextInt();
        //employee.setname("Mayurwithcode");
        //employee.setId(26);
        employee.setname(name);
        employee.setId(id);

        if (employee.getId() == 0){
            System.out.println("No data found");
        }else {
            System.out.println("Employee Id = " + employee.getId());
            System.out.println("Employee name = " + employee.getName());
        }

    }
}
