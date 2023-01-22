package com.alpkor.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements IPatron {
    @Override
    public String surum(String data){
        return "QualifierMultiple Enum 2"+ data;
    }
}
