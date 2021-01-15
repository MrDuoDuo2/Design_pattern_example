package com.github.mrduoduo2.Phone;

public class PinkPhone extends Phone{
    @Override
    public void prepare() {
        super.prepare();
        this.color = "Pink";
        System.out.println("this is pinkphone~");
    }
}
