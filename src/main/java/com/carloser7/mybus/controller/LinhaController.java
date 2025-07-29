package com.carloser7.mybus.controller;

import com.carloser7.mybus.service.EMTUClientService;
import com.carloser7.mybus.entity.Route;
import com.carloser7.mybus.model.Linha;
import com.carloser7.mybus.repository.LinhaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/linhas")
public class LinhaController {

    private final EMTUClientService emtuClientService;
    private final LinhaRepository linhaRepository;

    public LinhaController(EMTUClientService emtuClientService, LinhaRepository linhaRepository) {
        this.emtuClientService = emtuClientService;
        this.linhaRepository = linhaRepository;
    }

    @GetMapping("/{numeroLinha}")
    public Linha buscar(@PathVariable String numeroLinha) {
        return emtuClientService.buscar(numeroLinha);
    }

    @GetMapping()
    public List<Route> pesquisar(String numeroLinha) {
        System.out.println("REALIZAR PESQUISA POR:  ".concat(numeroLinha));
        return linhaRepository.findByNumeroStartingWith(numeroLinha);
    }
}
