package com.alpkor.qualifier2;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements IPatron {
    @Override
    public String surum(String data){
        return "surum 1 (Default) "+ data;
    }
}
