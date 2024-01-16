package com.carloser7.mybus.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Veiculo {

    @EqualsAndHashCode.Include
    private double idVeiculo;
    private String consorcio;
    private String empresa;
    private String prefixo;
    private String codigoLinha;
    private String sentidoLinha;
    private double idRota;
    private double dataUltimaTransmissao;
    private double latitude;
    private double longitude;
    private double seqPonto;
    private String acessibilidade;
    private double capacidadeSentados;
    private double capacidadeEmPe;
    private double dataAutorizacao;
    private String placa;
    private boolean alertaNaoTransmitiuCiclo;
    private boolean dentroRota;
}
