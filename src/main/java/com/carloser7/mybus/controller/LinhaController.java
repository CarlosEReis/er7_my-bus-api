package com.carloser7.mybus.controller;

import com.carloser7.mybus.service.EMTUClientService;
import com.carloser7.mybus.entity.Route;
import com.carloser7.mybus.model.Linha;
import com.carloser7.mybus.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(originPatterns = "*")
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
