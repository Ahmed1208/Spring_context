package org.example.bean;

public interface Device {

    // any attribute inside the interface is public, static and final by default
    public static final int counter = 5;

    // can't be overrided , if you need to call it -> then you need to call it from the Interface Name(Device.start())
    static void start()
    {
        System.out.println("heloo");
    }


    // can be overrided, can't be called from the Interface Name because not static; so it need to be called from and object
    // otherwise you can use Device.super.end() inside the iherihted class
    default void end()
    {
        System.out.println("heloo");
    }
}
