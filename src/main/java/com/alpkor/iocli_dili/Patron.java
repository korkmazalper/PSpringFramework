package com.alpkor.iocli_dili;

public class Patron implements IPatron{
    @Override
    public String surum(String data){
        return "surum"+ data;
    }
}
