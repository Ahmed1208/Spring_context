package org.example.bean;

public interface Device2 {

    // can be overrided, can't be called from the Interface Name
    default void end()
    {
        System.out.println("heloo");
    }
}
