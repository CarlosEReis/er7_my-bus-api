package com.carloser7.mybus.service;

import com.carloser7.mybus.model.Linha;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EmtuApiRoot {

    private Linha[] linhas;
}
