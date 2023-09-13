package org.example;

public class Main {
    public static void main(String[] args) {


        Person person = new Person();
        person.setName("MInaver");
        person.setSurname("Amiraslanova");

        System.out.println(person.fullGatName());

        Student student =  new Student();
        student.setName("mina");
       student.setSurname("Amir");
        student.setGroup("B103");

        System.out.println(student.fullGatName());
    }
}