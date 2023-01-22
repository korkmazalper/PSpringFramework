package com.alpkor.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifierCdi")
@ApplicationScoped
public class Calisan {

    @Inject //inject edince new gerekmez
    @QualifierMultiple
    private IPatron iPatron;


    public String getData(String data){
        return iPatron.surum(data);
    }
}
