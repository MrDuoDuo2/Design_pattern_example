package com.github.mrduoduo2.Receiver;

import com.github.mrduoduo2.Factory.PhoneFactory;
import com.github.mrduoduo2.Phone.Phone;

public class Receiver {

    public void stop(){
        System.out.println("stoping....");
    }

    public void run(String color){
        PhoneFactory f = new PhoneFactory();
        Phone p = f.create(color);
        p.prepare();
        p.doAction();
        p.dopackage();
        p.send();
    }


    public void help() {
        System.err.println(
                "\n" +
                        "Usage: Factory [options]\n" +
                        "\n" +
                        "Options:\n" +
                        "    run [Color]       start program\n" +
                        "    stop     \n" +
                        "    help      help\n");
    }
}
