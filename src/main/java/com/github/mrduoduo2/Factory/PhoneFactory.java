package com.github.mrduoduo2.Factory;

import com.github.mrduoduo2.Phone.Phone;
import com.github.mrduoduo2.Phone.PinkPhone;
import com.github.mrduoduo2.Phone.RedPhone;

import java.util.HashMap;

public class PhoneFactory {
    HashMap<String, Phone> ColorPhone = new HashMap<String, Phone>();
    public PhoneFactory(){
        ColorPhone.put("Red", new RedPhone());
        ColorPhone.put("Pink",new PinkPhone());
    }
    public Phone create(String color){
        Phone p = ColorPhone.get(color);

        if (p == null){
            throw new NullPointerException();
        }

        return p;
    }
}
