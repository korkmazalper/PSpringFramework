package com.alpkor.qualifier2;

@QualifierMultiple
public class Patron2 implements IPatron {
    @Override
    public String surum(String data){
        return "QualifierMultiple 1"+ data;
    }
}
