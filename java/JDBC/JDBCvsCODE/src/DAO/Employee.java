package DAO;

import java.sql.Date;

public class Employee {
    private int id;
    private String name;
    private boolean gender;
    private Date birthday;
    private double salary;

    public Employee(){

    }
    public Employee(int id, String name, boolean gender,double salary){
        this.id=id;
        this.name=name;
        this.gender=gender;
      
        this.salary=salary;
    }
    public int getId(){
        return this.id;
    }
    public void setId(){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name=name;
    }
    public boolean getGender(){
        return this.gender;
    }
    public void setGender(){
        this.gender=gender;
    }
    // public Date getDate(){
    //     return this.birthday;
    // }
    // public void setDate(){
    //     this.birthday=birthday;
    // }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Employee{"+
                    "id ="+id+
                    " ; name =" +name+
                    " ; gender ="+gender+
                    // " ; birthday ="+birthday+
                    " ; salary ="+salary+
                    "}";
    }

}
