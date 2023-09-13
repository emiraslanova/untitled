package org.example;

public class Student extends  Person{

    private String group;

    public void setGroup(String group) {
        this.group = group;
    }

    public String fullGatName(){
        return super.getName()+' '+getSurname()+' '+ group;
    }
}
