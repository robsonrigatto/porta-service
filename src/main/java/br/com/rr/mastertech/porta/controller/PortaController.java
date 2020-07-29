package br.com.rr.mastertech.porta.controller;

import br.com.rr.mastertech.porta.dto.request.PortaRequest;
import br.com.rr.mastertech.porta.dto.response.PortaResponse;
import br.com.rr.mastertech.porta.service.PortaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/porta")
public class PortaController {

    @Autowired
    private PortaService service;

    @PostMapping
    public ResponseEntity<PortaResponse> create(@RequestBody @Valid PortaRequest request) {
        return new ResponseEntity<PortaResponse>(service.create(request), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<PortaResponse> findById(@PathVariable Integer id) {
        return new ResponseEntity<PortaResponse>(service.findById(id), HttpStatus.OK);
    }
}
