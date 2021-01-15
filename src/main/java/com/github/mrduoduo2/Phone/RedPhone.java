package com.github.mrduoduo2.Phone;

public class RedPhone extends Phone {
    @Override
    public void prepare() {
        super.prepare();
        this.color = "Red";
        System.out.println("this is redphone~");
    }

}
