package com.alpkor.iocli_dili;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="ioclicdiliCalisan")
@ApplicationScoped
public class Calisan {
    private Patron patron;

    public Calisan() {
        patron = new Patron();
    }
    public String getData(String data){
        return patron.surum(data);
    }
}
