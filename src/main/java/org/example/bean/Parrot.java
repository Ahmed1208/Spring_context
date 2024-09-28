package org.example.bean;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Parrot {
    private String name;

    @Autowired
    private Person person;

    public Parrot() {
        this.name = "harron";
    }

    public Parrot(Person person) {

        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    //    @PostConstruct
//    public void init()
//    {
//        this.name = "haroon";
//    }
}