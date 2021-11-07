package it.fabrick.appFabrick.Controller;


import it.fabrick.appFabrick.Model.Conto;
import it.fabrick.appFabrick.Repository.ContoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ContoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{accountId}/balance")
    public ResponseModel<Conto> getBalance(@PathVariable("accountId") String accountId) {

        String url = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/{accountId}/balance";
        url = url.replace("{accountId}", accountId);

        HttpEntity<String> entity = new HttpEntity<>(null, getHeaders());

        ResponseEntity<ResponseModel<Conto>> response = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<ResponseModel<Conto>>() {
                }
        );

        return response.getBody();
    }


    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Auth-Schema", "S2S");
        headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
        return headers;
    }
}