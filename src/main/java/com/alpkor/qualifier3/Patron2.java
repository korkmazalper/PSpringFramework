package com.alpkor.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
public class Patron2 implements IPatron {
    @Override
    public String surum(String data){
        return "QualifierMultiple Enum 1"+ data;
    }
}
