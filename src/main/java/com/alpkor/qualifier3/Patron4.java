package com.alpkor.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements IPatron {
    @Override
    public String surum(String data){
        return "QualifierMultiple Enum 3"+ data;
    }
}
