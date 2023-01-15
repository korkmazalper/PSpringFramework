package com.alpkor.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named(value="cdibean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String patika;
    private String secondOne;
    public JsfBean() {
        this.patika="Spring Boot Egitimi - Burasi canlida cikmiyor\n";
        this.secondOne="Noname JSF Files - Burasi canlida cikmiyor";
    }

    public String getPatika() {
        return patika;
    }

    public void setPatika(String patika) {
        this.patika = patika;
    }

    public String getSecondOne() {
        return secondOne;
    }

    public void setSecondOne(String secondOne) {
        this.secondOne = secondOne;
    }
}
