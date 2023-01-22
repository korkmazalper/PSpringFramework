package com.alpkor.qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    @Inject //inject edince new gerekmez
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    private IPatron iPatron;
    public String getData(String data){
        return iPatron.surum(data);
    }
}
