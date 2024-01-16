package com.carloser7.mybus.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Rota {

    @EqualsAndHashCode.Include
    private double id;
    private double idLinha;
    private String codigoLinha;
    private String consorcio;
    private String encode;
    private double tarifa;
    private String cidade;
    private double sequencia;
    private Ponto[] pontos;
    private String corredor;
    private double tempo;
    private double qtdPontos;
    private double idTipoSentido;
    private String horarios;
    private String sentido;
    private double distancia;
    private double raioCerca;
    private String idEmpresa;
    private String destino;
    private String status;
    private String tp;
    private String ts;
    private String horariosdiasuteis;
    private String horariossabados;
    private String horariosdomingosferiados;
}
