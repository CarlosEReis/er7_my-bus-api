package com.carloser7.mybus.controller;

import com.carloser7.mybus.service.EMTUClientService;
import com.carloser7.mybus.entity.Route;
import com.carloser7.mybus.model.Linha;
import com.carloser7.mybus.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linhas")
public class LinhaController {

    @Autowired private EMTUClientService emtuClientService;
    @Autowired private LinhaRepository linhaRepository;

    @GetMapping("/{linhaID}")
    public Linha buscar(@PathVariable String linhaID) {
        return emtuClientService.buscar(linhaID);
    }

    @GetMapping()
    public List<Route> pesquisar(String search) {
        System.out.println("REALIZAR PESQUISA POR:  ".concat(search));
        return linhaRepository.findByNumeroStartingWith(search);
    }
}
