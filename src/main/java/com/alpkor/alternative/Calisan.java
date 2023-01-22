package com.alpkor.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="alternativedi")
@ApplicationScoped
public class Calisan {

    @Inject //inject edince new gerekmez
    private IPatron iPatron;

    public Calisan() {
        //iPatron = new Patron(); //inject edince new gerekmez
    }
    public String getData(String data){
        return iPatron.surum(data);
    }
}
