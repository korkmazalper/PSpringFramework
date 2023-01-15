package com.alpkor.cdi;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Data
@AllArgsConstructor
@Builder
@Log4j2
@Named(value="namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData="Hello named Data";

    public _01_Named() {
    }
}
