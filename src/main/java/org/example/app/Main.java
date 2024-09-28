package org.example.app;

import org.example.bean.*;
import org.example.config.ProjectConfig;
import org.example.config.Test;
import org.example.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

    public static void main(String[] args) {


        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getPerson());


        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");

        Person person = context.getBean(Person.class);
        System.out.println(person.getParrot());

        Test test = new Test();
        test.end();

        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");


        Comment comment = new Comment();
        comment.setText("Hello world");
        comment.setAuthor("haroon");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);


    }
}