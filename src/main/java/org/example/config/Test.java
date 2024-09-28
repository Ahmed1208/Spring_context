package org.example.config;

import org.example.bean.Device;
import org.example.bean.Device2;

public class Test implements Device,Device2 {


    @Override
    public void end() {
        Device.super.end();
    }

}
