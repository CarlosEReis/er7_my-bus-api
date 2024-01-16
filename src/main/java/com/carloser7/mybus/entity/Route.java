package com.carloser7.mybus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "routes")
public class Route {

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "route_id")
    private String id;

    @Column(name = "route_short_name")
    private String numero;

    @Column(name = "route_long_name")
    private String nome;

    @Column(name = "route_type")
    private Integer tipo;

}
