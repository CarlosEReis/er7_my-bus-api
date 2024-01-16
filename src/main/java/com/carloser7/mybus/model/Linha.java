package com.carloser7.mybus.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Linha {

    @EqualsAndHashCode.Include
    private String id;
    private String codigo;
    private String consorcio;
    private double tarifa;
    private Veiculo[] veiculos;
    private Rota[] rotas;
    private String corredor;
    private String tp;
    private String ts;
    private int velocidadeMedia;
    private int mediaHistorica;
    private String status;
}
