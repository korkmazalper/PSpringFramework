package com.alpkor.qualifier3;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements IPatron {
    @Override
    public String surum(String data){
        return " (Default) Surum 1 - "+ data;
    }
}
