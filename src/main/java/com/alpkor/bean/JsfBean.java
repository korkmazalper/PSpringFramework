package com.alpkor.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String patika;
    private String secondOne;
    public JsfBean() {
        this.patika="Spring Boot Egitimi";
        secondOne="Noname JSF Files";
    }

}
