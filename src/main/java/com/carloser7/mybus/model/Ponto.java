package com.carloser7.mybus.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ponto {

    @EqualsAndHashCode.Include
    private double id;
    private double latitude;
    private double longitude;
    private String endereco;
    private double raio;
    private double sequencia;
}
