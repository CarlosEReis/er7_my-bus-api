package com.carloser7.mybus.service;

import com.carloser7.mybus.model.Linha;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


@Service
@Getter
@Setter
public class EMTUClientService {

    @Value("${my-bus.api.client}")
    private String urlAPI;

    @Autowired
    private RestTemplate restTemplate;

    public Linha buscar(String linhaID) {
        SSLUtil.disableCertificateValidation();
        URI uri = URI.create(urlAPI.concat(linhaID));
        EmtuApiRoot response = restTemplate.getForObject(uri, EmtuApiRoot.class);
        return response.getLinhas()[0];
    }

}
